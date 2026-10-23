def on_load(api):
    counter = {"n": 0}

    def hello():
        counter["n"] += 1
        api.toast("Список чатов: нажатий %d" % counter["n"])

    # экран, заголовок, действие, иконка, позиция
    api.add_button("DialogsActivity", "Привет", hello, "info", "bottom_left")
    api.add_button("ChatActivity", "Чат", lambda: api.toast("Кнопка в чате"), "reply", "center_right")
    api.add_button("*", "Везде", lambda: api.toast("Кнопка в шапке"), "stats", "action_bar")
