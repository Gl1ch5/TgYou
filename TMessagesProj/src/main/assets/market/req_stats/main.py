counts = {}


def rows():
    top = sorted(counts.items(), key=lambda kv: -kv[1])[:30]
    return [(name, str(n)) for name, n in top] or [("Пока нет данных", "")]


def on_load(api):
    def outgoing(class_name, request):
        try:
            counts[class_name] = counts.get(class_name, 0) + 1
        except Exception:
            pass
        return False

    api.hook("request.outgoing", outgoing)
    api.add_page("Запросы", rows)
