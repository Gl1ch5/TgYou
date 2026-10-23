from java import jclass

STYLED = ("ImageView", "AppCompatImageView", "ImageButton", "ActionBarMenuItem")


def parse_color(text):
    t = (text or "").strip().lstrip("#")
    if len(t) != 6:
        return None
    return 0xFF000000 | int(t, 16)


def on_load(api):
    PorterDuff = jclass("android.graphics.PorterDuff$Mode")
    Filter = jclass("android.graphics.PorterDuffColorFilter")
    ImageView = jclass("android.widget.ImageView")
    AndroidUtilities = jclass("org.telegram.messenger.AndroidUtilities")

    def walk(view, color, scale):
        try:
            name = view.getClass().getSimpleName()
            if name in STYLED and ImageView.isInstance(view):
                if color is not None:
                    view.setColorFilter(Filter(color, PorterDuff.MULTIPLY))
                if scale != 1.0:
                    view.setScaleX(scale)
                    view.setScaleY(scale)
            for i in range(view.getChildCount()):
                walk(view.getChildAt(i), color, scale)
        except Exception:
            pass

    def apply(view):
        try:
            if not api.getBool("enabled", True):
                return
            color = parse_color(api.getString("color", "#FF8A3D"))
            scale = float(api.getString("scale", "100%").rstrip("%")) / 100.0
            walk(view, color, scale)
        except Exception as e:
            api.log("button_style: %s" % e)

    def created(fragment, view):
        apply(view)
        AndroidUtilities.runOnUIThread(lambda: apply(view), 400)

    api.hook("fragment.created", created)
