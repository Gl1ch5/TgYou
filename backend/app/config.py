import os
from dataclasses import dataclass
from pathlib import Path


@dataclass(frozen=True)
class Settings:
    data_dir: Path
    admin_token: str
    auto_approve: bool
    max_package_bytes: int = 2 * 1024 * 1024
    max_unpacked_bytes: int = 10 * 1024 * 1024
    max_files: int = 50
    api_version: int = 1

    @property
    def db_path(self) -> Path:
        return self.data_dir / "market.sqlite3"

    @property
    def packages_dir(self) -> Path:
        return self.data_dir / "packages"


def load_settings() -> Settings:
    admin_token = os.environ.get("MARKET_ADMIN_TOKEN", "")
    if len(admin_token) < 24:
        raise RuntimeError("MARKET_ADMIN_TOKEN must be set and at least 24 characters long")
    return Settings(
        data_dir=Path(os.environ.get("MARKET_DATA_DIR", "./data")).resolve(),
        admin_token=admin_token,
        auto_approve=os.environ.get("MARKET_AUTO_APPROVE", "0") == "1",
    )
