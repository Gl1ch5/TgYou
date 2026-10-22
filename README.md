# Telegram You

Telegram You — форк официального Android-клиента Telegram (на базе [DrKLO/Telegram](https://github.com/DrKLO/Telegram)).

- Application ID: `com.tgyou.app`
- Название приложения: **Telegram You**
- Лицензия: GPL v2 (см. `LICENSE`), исходный код форка открыт.

## Сборка

Нужны собственные `api_id` и `api_hash` с https://my.telegram.org. Они **не хранятся в репозитории** — передаются переменными окружения:

```bash
export TG_API_ID=123456
export TG_API_HASH=xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
./gradlew :TMessagesProj_App:assembleAfatRelease
```

Требования: JDK 21, Android SDK (platform 36, build-tools 36.0.0, NDK 27.2.12479018, CMake).

## GitHub Actions

Workflow `Build beta` собирает APK и публикует его как артефакт (и как prerelease при пуше тега `v*`).
Добавьте в Settings → Secrets and variables → Actions секреты `TG_API_ID` и `TG_API_HASH`.

## Лицензия и благодарности

Основано на Telegram for Android. Исходный код распространяется под GPL v2.
