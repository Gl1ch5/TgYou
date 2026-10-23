from java import jclass


def on_load(api):
    TextView = jclass("android.widget.TextView")
    AndroidUtilities = jclass("org.telegram.messenger.AndroidUtilities")

    def names(view):
        out = [str(view.getClass().getSimpleName())]
        try:
            desc = view.getContentDescription()
            if desc is not None:
                out.append(str(desc))
        except Exception:
            pass
        try:
            if view.getId() != -1:
                out.append(str(view.getResources().getResourceEntryName(view.getId())))
        except Exception:
            pass
        try:
            if view.isClickable() and TextView.isInstance(view):
                out.append(str(view.getText()))
        except Exception:
            pass
        return [n.lower() for n in out]

    def walk(view, patterns):
        try:
            if view.getVisibility() != 8:
                hay = names(view)
                for p in patterns:
                    if any(p in h for h in hay):
                        view.setVisibility(8)
                        return
            for i in range(view.getChildCount()):
                walk(view.getChildAt(i), patterns)
        except Exception:
            pass

    def apply(view):
        try:
            if not api.getBool("enabled", True):
                return
            patterns = [p.strip().lower() for p in api.getString("patterns", "").split(",") if p.strip()]
            if patterns:
                walk(view, patterns)
        except Exception as e:
            api.log("hide_buttons: %s" % e)

    def created(fragment, view):
        apply(view)
        AndroidUtilities.runOnUIThread(lambda: apply(view), 400)
        AndroidUtilities.runOnUIThread(lambda: apply(view), 1500)

    api.hook("fragment.created", created)
