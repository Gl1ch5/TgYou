from java import jclass

DENSITY = {"Мало": 15, "Средне": 35, "Много": 70, "Метель": 140}


def on_load(api):
    FallingView = jclass("com.tgyou.mods.FallingView")

    def created(fragment, view):
        try:
            if not api.getBool("enabled", True):
                return
            snow = api.getString("mode", "Листопад") == "Снег"
            count = DENSITY.get(api.getString("density", "Средне"), 35)
            FallingView.attach(view, "snow" if snow else "leaves", count, 1.3 if snow else 1.0)
        except Exception as e:
            api.log("falling: %s" % e)

    api.hook("fragment.created", created)
