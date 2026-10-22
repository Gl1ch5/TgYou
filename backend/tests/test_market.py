import io
import json
import zipfile

import pytest
from fastapi.testclient import TestClient

from app.config import Settings
from app.main import create_app

ADMIN = "a" * 32


def make_zip(manifest=None, extra=None, entry="main.py"):
    base = {
        "id": "ghost_mode", "name": "Ghost mode", "version": "1.0.0", "api_version": 1,
        "description": "Hides read receipts", "category": "privacy", "entry": entry,
    }
    base.update(manifest or {})
    buf = io.BytesIO()
    with zipfile.ZipFile(buf, "w") as z:
        z.writestr("manifest.json", json.dumps(base))
        z.writestr("main.py", "print('hi')")
        for name, content in (extra or {}).items():
            z.writestr(name, content)
    return buf.getvalue()


@pytest.fixture
def client(tmp_path):
    cfg = Settings(data_dir=tmp_path, admin_token=ADMIN, auto_approve=False)
    return TestClient(create_app(cfg))


def admin(client):
    return {"Authorization": f"Bearer {ADMIN}"}


def new_dev(client, name="alice"):
    r = client.post("/api/v1/admin/developers", json={"name": name}, headers=admin(client))
    assert r.status_code == 200
    return {"Authorization": f"Bearer {r.json()['token']}"}


def publish(client, headers, data):
    return client.post("/api/v1/plugins", files={"file": ("p.zip", data, "application/zip")}, headers=headers)


def test_admin_required(client):
    assert client.post("/api/v1/admin/developers", json={"name": "bob"}).status_code == 401
    assert client.post("/api/v1/admin/developers", json={"name": "bob"},
                       headers={"Authorization": "Bearer wrong"}).status_code == 403


def test_short_admin_token_rejected(tmp_path):
    from app.config import load_settings
    import os
    os.environ["MARKET_ADMIN_TOKEN"] = "short"
    with pytest.raises(RuntimeError):
        load_settings()


def test_publish_requires_moderation_then_download(client):
    dev = new_dev(client)
    r = publish(client, dev, make_zip())
    assert r.status_code == 200 and r.json()["status"] == "pending"
    assert client.get("/api/v1/plugins").json()["total"] == 0
    assert client.get("/api/v1/plugins/ghost_mode").status_code == 404
    assert client.get("/api/v1/plugins/ghost_mode/download").status_code == 404

    pend = client.get("/api/v1/admin/pending", headers=admin(client)).json()
    assert pend[0]["plugin_id"] == "ghost_mode"
    assert client.post("/api/v1/admin/plugins/ghost_mode/versions/1.0.0/approve", headers=admin(client)).status_code == 200

    listing = client.get("/api/v1/plugins").json()
    assert listing["total"] == 1 and listing["items"][0]["latest"]["version"] == "1.0.0"
    d = client.get("/api/v1/plugins/ghost_mode/download")
    assert d.status_code == 200 and d.headers["x-package-sha256"] == r.json()["sha256"]
    assert zipfile.ZipFile(io.BytesIO(d.content)).namelist()[0] == "manifest.json"
    assert client.get("/api/v1/plugins/ghost_mode").json()["downloads"] == 1


def test_latest_version_is_numeric_max(client):
    dev = new_dev(client)
    for v in ("1.2.0", "1.10.0", "1.9.0"):
        publish(client, dev, make_zip({"version": v}))
        client.post(f"/api/v1/admin/plugins/ghost_mode/versions/{v}/approve", headers=admin(client))
    assert client.get("/api/v1/plugins/ghost_mode").json()["latest"]["version"] == "1.10.0"


def test_duplicate_version_and_foreign_owner(client):
    a, b = new_dev(client, "alice"), new_dev(client, "bob")
    assert publish(client, a, make_zip()).status_code == 200
    assert publish(client, a, make_zip()).status_code == 409
    assert publish(client, b, make_zip({"version": "2.0.0"})).status_code == 403


@pytest.mark.parametrize("manifest", [
    {"id": "Bad-ID"}, {"version": "1.0"}, {"api_version": 0}, {"api_version": 99},
    {"category": "nope"}, {"entry": "missing.py"}, {"name": ""},
])
def test_bad_manifest_rejected(client, manifest):
    assert publish(client, new_dev(client), make_zip(manifest)).status_code == 422


def test_zip_slip_and_garbage_rejected(client):
    dev = new_dev(client)
    assert publish(client, dev, make_zip(extra={"../evil.py": "x"})).status_code == 422
    assert publish(client, dev, b"not a zip").status_code == 422


def test_oversize_package_rejected(client):
    big = make_zip(extra={"data.bin": "0" * (3 * 1024 * 1024)})
    assert publish(client, new_dev(client), big).status_code == 413


def test_zip_bomb_rejected(client):
    buf = io.BytesIO()
    with zipfile.ZipFile(buf, "w", zipfile.ZIP_DEFLATED) as z:
        z.writestr("manifest.json", json.dumps({
            "id": "bomb_plugin", "name": "b", "version": "1.0.0", "api_version": 1,
            "description": "d", "entry": "main.py"}))
        z.writestr("main.py", "x")
        z.writestr("data.bin", "0" * (12 * 1024 * 1024))
    assert len(buf.getvalue()) < 2 * 1024 * 1024
    assert publish(client, new_dev(client), buf.getvalue()).status_code == 422


def test_search_and_rating(client):
    dev = new_dev(client)
    publish(client, dev, make_zip())
    client.post("/api/v1/admin/plugins/ghost_mode/versions/1.0.0/approve", headers=admin(client))
    assert client.get("/api/v1/plugins", params={"q": "ghost"}).json()["total"] == 1
    assert client.get("/api/v1/plugins", params={"q": "%"}).json()["total"] == 0
    assert client.get("/api/v1/plugins", params={"category": "media"}).json()["total"] == 0
    for dev_id, stars in (("device-0001", 5), ("device-0002", 3), ("device-0001", 4)):
        assert client.post("/api/v1/plugins/ghost_mode/rating",
                           json={"device_id": dev_id, "stars": stars}).status_code == 200
    info = client.get("/api/v1/plugins/ghost_mode").json()
    assert info["rating_count"] == 2 and info["rating"] == 3.5
    assert client.post("/api/v1/plugins/ghost_mode/rating",
                       json={"device_id": "device-0001", "stars": 9}).status_code == 422
