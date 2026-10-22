"""Validation of an uploaded plugin package (a zip archive with manifest.json)."""
import hashlib
import json
import re
import zipfile
from dataclasses import dataclass
from io import BytesIO

ID_RE = re.compile(r"^[a-z][a-z0-9_]{2,39}$")
VERSION_RE = re.compile(r"^\d+\.\d+\.\d+(-[0-9A-Za-z.]+)?$")
CATEGORIES = {"privacy", "chat", "media", "ui", "tools", "ai", "other"}


class PackageError(ValueError):
    pass


@dataclass
class Manifest:
    id: str
    name: str
    version: str
    api_version: int
    description: str
    category: str
    entry: str
    changelog: str
    sha256: str
    size: int


def version_key(version: str):
    core = version.split("-", 1)[0]
    return tuple(int(part) for part in core.split("."))


def parse_package(data: bytes, max_unpacked: int, max_files: int) -> Manifest:
    try:
        archive = zipfile.ZipFile(BytesIO(data))
    except zipfile.BadZipFile:
        raise PackageError("not a valid zip archive")
    infos = archive.infolist()
    if not infos or len(infos) > max_files:
        raise PackageError(f"archive must contain 1..{max_files} files")
    total = 0
    names = set()
    for info in infos:
        name = info.filename
        if name.startswith("/") or ".." in name.split("/") or "\\" in name or ":" in name:
            raise PackageError(f"unsafe path in archive: {name!r}")
        total += info.file_size
        names.add(name)
    if total > max_unpacked:
        raise PackageError("unpacked size is too large")
    if "manifest.json" not in names:
        raise PackageError("manifest.json is missing")
    try:
        raw = json.loads(archive.read("manifest.json").decode("utf-8"))
    except (UnicodeDecodeError, json.JSONDecodeError):
        raise PackageError("manifest.json is not valid JSON")
    except (zipfile.BadZipFile, NotImplementedError, RuntimeError, OSError):
        raise PackageError("archive cannot be read")
    if not isinstance(raw, dict):
        raise PackageError("manifest.json must be an object")

    def text(key: str, limit: int, required: bool = True) -> str:
        value = raw.get(key, "")
        if not isinstance(value, str) or (required and not value.strip()):
            raise PackageError(f"manifest field {key!r} is required")
        if len(value) > limit:
            raise PackageError(f"manifest field {key!r} is too long")
        return value.strip()

    plugin_id = text("id", 40)
    if not ID_RE.match(plugin_id):
        raise PackageError("id must match ^[a-z][a-z0-9_]{2,39}$")
    version = text("version", 32)
    if not VERSION_RE.match(version):
        raise PackageError("version must look like 1.2.3")
    api_version = raw.get("api_version")
    if not isinstance(api_version, int) or isinstance(api_version, bool) or api_version < 1:
        raise PackageError("api_version must be a positive integer")
    category = text("category", 20, required=False) or "other"
    if category not in CATEGORIES:
        raise PackageError(f"category must be one of {sorted(CATEGORIES)}")
    entry = text("entry", 100)
    if not entry.endswith(".py") or entry not in names:
        raise PackageError("entry must be a .py file present in the archive")
    return Manifest(
        id=plugin_id,
        name=text("name", 60),
        version=version,
        api_version=api_version,
        description=text("description", 500),
        category=category,
        entry=entry,
        changelog=text("changelog", 1000, required=False),
        sha256=hashlib.sha256(data).hexdigest(),
        size=len(data),
    )
