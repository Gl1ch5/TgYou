"""exteraGram file_utils."""
import os

from java import jclass


def _app():
    return jclass("org.telegram.messenger.ApplicationLoader").applicationContext


def _dir(path):
    os.makedirs(path, exist_ok=True)
    return path


def get_plugins_dir():
    return _dir(os.path.join(str(_app().getFilesDir().getAbsolutePath()), "tgyou_mods"))


def get_files_dir():
    return _dir(str(_app().getFilesDir().getAbsolutePath()))


def get_cache_dir():
    return _dir(str(_app().getCacheDir().getAbsolutePath()))


def _media(name):
    ext = _app().getExternalFilesDir(None)
    base = str(ext.getAbsolutePath()) if ext is not None else get_cache_dir()
    return _dir(os.path.join(base, name))


def get_images_dir():
    return _media("Images")


def get_videos_dir():
    return _media("Videos")


def get_audios_dir():
    return _media("Audios")


def get_documents_dir():
    return _media("Documents")


def read_file(path, encoding="utf-8"):
    with open(path, "r", encoding=encoding) as f:
        return f.read()


def read_file_bytes(path):
    with open(path, "rb") as f:
        return f.read()


def write_file(path, content, encoding="utf-8"):
    ensure_dir_exists(os.path.dirname(path))
    with open(path, "w", encoding=encoding) as f:
        f.write(content)
    return True


def write_file_bytes(path, content):
    ensure_dir_exists(os.path.dirname(path))
    with open(path, "wb") as f:
        f.write(content)
    return True


def delete_file(path):
    try:
        os.remove(path)
        return True
    except OSError:
        return False


def ensure_dir_exists(path):
    if path:
        os.makedirs(path, exist_ok=True)
    return path


def list_dir(path, recursive=False, include_files=True, include_dirs=False, extensions=None):
    found = []
    exts = tuple(e.lower() if e.startswith(".") else "." + e.lower() for e in extensions) if extensions else None
    for root, dirs, files in os.walk(path):
        if include_dirs:
            found.extend(os.path.join(root, d) for d in dirs)
        if include_files:
            for f in files:
                if exts is None or f.lower().endswith(exts):
                    found.append(os.path.join(root, f))
        if not recursive:
            break
    return found
