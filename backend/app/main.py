import hashlib
import hmac
import secrets
import time
from typing import Optional

from fastapi import Depends, FastAPI, File, Header, HTTPException, Query, UploadFile
from fastapi.responses import FileResponse
from pydantic import BaseModel, Field

from .config import Settings, load_settings
from .db import connect, init_db
from .package import PackageError, parse_package, version_key


def create_app(settings: Optional[Settings] = None) -> FastAPI:
    cfg = settings or load_settings()
    cfg.packages_dir.mkdir(parents=True, exist_ok=True)
    init_db(cfg.db_path)
    app = FastAPI(title="TgYou Marketplace", version="1.0.0")

    def bearer(authorization: Optional[str]) -> str:
        if not authorization or not authorization.lower().startswith("bearer "):
            raise HTTPException(401, "missing bearer token")
        return authorization[7:].strip()

    def require_admin(authorization: Optional[str] = Header(None)) -> None:
        if not hmac.compare_digest(bearer(authorization), cfg.admin_token):
            raise HTTPException(403, "admin token required")

    def require_developer(authorization: Optional[str] = Header(None)) :
        token_hash = hashlib.sha256(bearer(authorization).encode()).hexdigest()
        with connect(cfg.db_path) as db:
            row = db.execute("SELECT * FROM developers WHERE token_hash = ?", (token_hash,)).fetchone()
        if row is None:
            raise HTTPException(403, "invalid developer token")
        return row

    def package_path(sha256: str):
        return cfg.packages_dir / f"{sha256}.zip"

    def plugin_json(db, row) -> dict:
        versions = db.execute(
            "SELECT * FROM versions WHERE plugin_id = ? AND status = 'approved'", (row["id"],)
        ).fetchall()
        latest = max(versions, key=lambda v: version_key(v["version"]), default=None)
        rating = db.execute(
            "SELECT AVG(stars) AS avg, COUNT(*) AS cnt FROM ratings WHERE plugin_id = ?", (row["id"],)
        ).fetchone()
        author = db.execute("SELECT name FROM developers WHERE id = ?", (row["author_id"],)).fetchone()
        return {
            "id": row["id"],
            "name": row["name"],
            "description": row["description"],
            "category": row["category"],
            "author": author["name"] if author else "",
            "downloads": row["downloads"],
            "rating": round(rating["avg"], 2) if rating["cnt"] else None,
            "rating_count": rating["cnt"],
            "updated_at": row["updated_at"],
            "latest": None
            if latest is None
            else {
                "version": latest["version"],
                "api_version": latest["api_version"],
                "sha256": latest["sha256"],
                "size": latest["size"],
                "changelog": latest["changelog"],
            },
        }

    @app.get("/health")
    def health():
        return {"ok": True, "api_version": cfg.api_version}

    # ---- admin ----------------------------------------------------------------

    class NewDeveloper(BaseModel):
        name: str = Field(min_length=2, max_length=40, pattern=r"^[\w .-]+$")

    @app.post("/api/v1/admin/developers", dependencies=[Depends(require_admin)])
    def create_developer(body: NewDeveloper):
        token = secrets.token_urlsafe(32)
        with connect(cfg.db_path) as db:
            try:
                db.execute(
                    "INSERT INTO developers (name, token_hash, created_at) VALUES (?, ?, ?)",
                    (body.name, hashlib.sha256(token.encode()).hexdigest(), int(time.time())),
                )
            except Exception:
                raise HTTPException(409, "developer already exists")
        return {"name": body.name, "token": token, "note": "store the token now, it is not shown again"}

    def set_status(plugin_id: str, version: str, status: str):
        with connect(cfg.db_path) as db:
            cur = db.execute(
                "UPDATE versions SET status = ? WHERE plugin_id = ? AND version = ?",
                (status, plugin_id, version),
            )
            if cur.rowcount == 0:
                raise HTTPException(404, "version not found")
            db.execute("UPDATE plugins SET updated_at = ? WHERE id = ?", (int(time.time()), plugin_id))
        return {"plugin": plugin_id, "version": version, "status": status}

    @app.post("/api/v1/admin/plugins/{plugin_id}/versions/{version}/approve", dependencies=[Depends(require_admin)])
    def approve(plugin_id: str, version: str):
        return set_status(plugin_id, version, "approved")

    @app.post("/api/v1/admin/plugins/{plugin_id}/versions/{version}/reject", dependencies=[Depends(require_admin)])
    def reject(plugin_id: str, version: str):
        return set_status(plugin_id, version, "rejected")

    @app.get("/api/v1/admin/pending", dependencies=[Depends(require_admin)])
    def pending():
        with connect(cfg.db_path) as db:
            rows = db.execute(
                "SELECT plugin_id, version, size, sha256, created_at FROM versions WHERE status = 'pending' ORDER BY created_at"
            ).fetchall()
        return [dict(r) for r in rows]

    # ---- developers -----------------------------------------------------------

    @app.post("/api/v1/plugins")
    async def publish(file: UploadFile = File(...), developer=Depends(require_developer)):
        data = await file.read(cfg.max_package_bytes + 1)
        if len(data) > cfg.max_package_bytes:
            raise HTTPException(413, "package is too large")
        try:
            manifest = parse_package(data, cfg.max_unpacked_bytes, cfg.max_files)
        except PackageError as error:
            raise HTTPException(422, str(error))
        if manifest.api_version > cfg.api_version:
            raise HTTPException(422, f"api_version {manifest.api_version} is newer than the server supports")
        now = int(time.time())
        status = "approved" if cfg.auto_approve else "pending"
        with connect(cfg.db_path) as db:
            existing = db.execute("SELECT author_id FROM plugins WHERE id = ?", (manifest.id,)).fetchone()
            if existing is None:
                db.execute(
                    "INSERT INTO plugins (id, name, description, category, author_id, created_at, updated_at)"
                    " VALUES (?, ?, ?, ?, ?, ?, ?)",
                    (manifest.id, manifest.name, manifest.description, manifest.category, developer["id"], now, now),
                )
            elif existing["author_id"] != developer["id"]:
                raise HTTPException(403, "this plugin id belongs to another developer")
            else:
                db.execute(
                    "UPDATE plugins SET name = ?, description = ?, category = ?, updated_at = ? WHERE id = ?",
                    (manifest.name, manifest.description, manifest.category, now, manifest.id),
                )
            try:
                db.execute(
                    "INSERT INTO versions (plugin_id, version, api_version, changelog, sha256, size, status, created_at)"
                    " VALUES (?, ?, ?, ?, ?, ?, ?, ?)",
                    (manifest.id, manifest.version, manifest.api_version, manifest.changelog, manifest.sha256,
                     manifest.size, status, now),
                )
            except Exception:
                raise HTTPException(409, "this version is already published")
        package_path(manifest.sha256).write_bytes(data)
        return {"id": manifest.id, "version": manifest.version, "status": status, "sha256": manifest.sha256}

    # ---- public catalogue -----------------------------------------------------

    @app.get("/api/v1/plugins")
    def list_plugins(
        q: str = Query("", max_length=60),
        category: str = Query("", max_length=20),
        page: int = Query(1, ge=1),
        per_page: int = Query(20, ge=1, le=100),
        sort: str = Query("downloads", pattern="^(downloads|updated|name)$"),
    ):
        order = {"downloads": "downloads DESC", "updated": "updated_at DESC", "name": "name COLLATE NOCASE"}[sort]
        where = ["EXISTS (SELECT 1 FROM versions v WHERE v.plugin_id = plugins.id AND v.status = 'approved')"]
        args: list = []
        if q:
            where.append("(name LIKE ? ESCAPE '\\' OR description LIKE ? ESCAPE '\\')")
            like = "%" + q.replace("\\", "\\\\").replace("%", "\\%").replace("_", "\\_") + "%"
            args += [like, like]
        if category:
            where.append("category = ?")
            args.append(category)
        clause = " AND ".join(where)
        with connect(cfg.db_path) as db:
            total = db.execute(f"SELECT COUNT(*) FROM plugins WHERE {clause}", args).fetchone()[0]
            rows = db.execute(
                f"SELECT * FROM plugins WHERE {clause} ORDER BY {order} LIMIT ? OFFSET ?",
                args + [per_page, (page - 1) * per_page],
            ).fetchall()
            items = [plugin_json(db, r) for r in rows]
        return {"total": total, "page": page, "per_page": per_page, "items": items}

    @app.get("/api/v1/plugins/{plugin_id}")
    def get_plugin(plugin_id: str):
        with connect(cfg.db_path) as db:
            row = db.execute("SELECT * FROM plugins WHERE id = ?", (plugin_id,)).fetchone()
            if row is None:
                raise HTTPException(404, "plugin not found")
            data = plugin_json(db, row)
        if data["latest"] is None:
            raise HTTPException(404, "plugin has no approved versions")
        return data

    @app.get("/api/v1/plugins/{plugin_id}/download")
    def download(plugin_id: str, version: str = Query("", max_length=32)):
        with connect(cfg.db_path) as db:
            rows = db.execute(
                "SELECT * FROM versions WHERE plugin_id = ? AND status = 'approved'", (plugin_id,)
            ).fetchall()
            chosen = None
            if version:
                chosen = next((v for v in rows if v["version"] == version), None)
            elif rows:
                chosen = max(rows, key=lambda v: version_key(v["version"]))
            if chosen is None:
                raise HTTPException(404, "version not found")
            path = package_path(chosen["sha256"])
            if not path.exists():
                raise HTTPException(410, "package file is gone")
            db.execute("UPDATE plugins SET downloads = downloads + 1 WHERE id = ?", (plugin_id,))
        return FileResponse(
            path,
            media_type="application/zip",
            filename=f"{plugin_id}-{chosen['version']}.zip",
            headers={"X-Package-SHA256": chosen["sha256"]},
        )

    class Rating(BaseModel):
        device_id: str = Field(min_length=8, max_length=64, pattern=r"^[A-Za-z0-9_-]+$")
        stars: int = Field(ge=1, le=5)
        review: str = Field("", max_length=500)

    @app.post("/api/v1/plugins/{plugin_id}/rating")
    def rate(plugin_id: str, body: Rating):
        with connect(cfg.db_path) as db:
            if db.execute("SELECT 1 FROM plugins WHERE id = ?", (plugin_id,)).fetchone() is None:
                raise HTTPException(404, "plugin not found")
            db.execute(
                "INSERT INTO ratings (plugin_id, device_id, stars, review, created_at) VALUES (?, ?, ?, ?, ?)"
                " ON CONFLICT(plugin_id, device_id) DO UPDATE SET stars = excluded.stars,"
                " review = excluded.review, created_at = excluded.created_at",
                (plugin_id, body.device_id, body.stars, body.review, int(time.time())),
            )
        return {"ok": True}

    return app
