import threading

import requests


def on_load(api):
    def ask(text):
        try:
            url = (api.getString("url", "") or "").strip()
            key = (api.getString("key", "") or "").strip()
            model = (api.getString("model", "") or "").strip()
            if not url or not key or not model:
                api.toast("Укажите адрес, ключ и модель в настройках мода")
                return
            api.toast("Спрашиваю ИИ…")
            r = requests.post(url, timeout=30,
                              headers={"Authorization": "Bearer " + key},
                              json={"model": model, "messages": [{"role": "user", "content": text}]})
            data = r.json()
            api.toast(str(data["choices"][0]["message"]["content"])[:400])
        except Exception as e:
            api.log("ask: %s" % e)
            api.toast("Ошибка запроса: %s" % e)

    def menu(m):
        def tap():
            text = str(m.message.messageText or "")
            threading.Thread(target=ask, args=(text,), daemon=True).start()
        m.add("Спросить ИИ", api.icon("bot"), tap)

    api.hook("message.menu", menu)
