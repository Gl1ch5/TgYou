import time

started = time.time()
counters = {"menu": 0}


def rows():
    up = int(time.time() - started)
    return [
        ("Мод запущен", time.strftime("%H:%M:%S", time.localtime(started))),
        ("Работает", "%d мин %d с" % (up // 60, up % 60)),
        ("Нажатий в меню сообщения", str(counters["menu"])),
    ]


def on_load(api):
    api.add_page("Статистика", rows)

    def menu(m):
        def tap():
            counters["menu"] += 1
            api.toast("Статистика: нажатий %d" % counters["menu"])
        m.add("Посчитать в статистике", api.icon("stats"), tap)

    api.hook("message.menu", menu)
