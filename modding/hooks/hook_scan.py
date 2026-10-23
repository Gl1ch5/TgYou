#!/usr/bin/env python3
"""Сканер мест, куда можно поставить хук (Pine hook_method) в исходниках Telegram.

Разбирает .java regexp-ом (без полноценного парсера, поэтому результат эвристический),
находит методы с телом и раскладывает их по категориям:
  visual   — рисование, вёрстка, цвета, тексты в вью (то, что видно глазом)
  function — отправка, удаление, сеть, обновления, настройки (логика)
У каждого метода есть подкатегория (chat, message, media, call, network, settings, ...).

Примеры:
  python3 modding/hooks/hook_scan.py --summary
  python3 modding/hooks/hook_scan.py --kind function --find send --limit 30
  python3 modding/hooks/hook_scan.py --kind visual --cat chat --find onDraw
  python3 modding/hooks/hook_scan.py --json build/hook_catalog.json
  python3 modding/hooks/hook_scan.py --markdown modding/hooks/HOOKS_CATALOG.md
"""
import argparse
import collections
import json
import os
import re
import sys

ROOT = os.path.join(os.path.dirname(os.path.abspath(__file__)), "..", "..", "TMessagesProj", "src", "main", "java")
SCAN = ["org/telegram"]

KEYWORDS = {"if", "for", "while", "switch", "catch", "return", "new", "else", "synchronized", "try", "do", "throw", "super", "this"}
METHOD_RE = re.compile(
    r"^[ \t]*((?:(?:public|protected|private|static|final|synchronized|abstract|native)[ \t]+)*)"
    r"(?:<[^>\n]+>[ \t]+)?([\w<>\[\],.?]+(?:[ \t]+[\w<>\[\],.?]+)?)[ \t]+(\w+)[ \t]*\(([^)\n]*)\)[ \t]*(?:throws[ \t]+[\w., ]+)?[ \t]*\{",
    re.M)
CLASS_RE = re.compile(r"^[ \t]*(?:public |protected |private |static |final |abstract )*(?:class|interface|enum)\s+(\w+)(?:\s+extends\s+([\w.<>]+))?", re.M)

VIEW_BASES = ("View", "ViewGroup", "FrameLayout", "LinearLayout", "RelativeLayout", "TextView", "ImageView", "RecyclerView",
              "Drawable", "BaseFragment", "Cell", "Dialog", "BottomSheet", "Button", "EditText", "Layout")
VISUAL_NAMES = re.compile(r"^(onDraw|dispatchDraw|draw\w*|onMeasure|onLayout|setText\w*|set\w*Color\w*|set\w*Drawable|set\w*Alpha|"
                          r"update\w*(View|Color|Theme|Ui|Layout)\w*|bind\w*|createView|setupView|onThemeChanged|getThemeColor|getColor|"
                          r"animate\w*|show\w*(Hint|Toast|Bulletin)\w*|measure\w*|layout\w*|invalidate\w*)$")
FUNCTION_NAMES = re.compile(r"^(send\w*|delete\w*|process\w*|save\w*|load\w*|fetch\w*|request\w*|on\w*Update\w*|"
                            r"put\w*|get\w*(Chat|Message|User|Dialog)\w*|mark\w*|read\w*|edit\w*|forward\w*|pin\w*|ban\w*|"
                            r"add\w*|remove\w*|set\w*(Chat|Message|User|Setting|Config)\w*|check\w*|is\w+|can\w+|should\w+|has\w+)$")

CATEGORIES = [
    ("chat", ("ChatActivity", "ChatMessageCell", "ChatActivityEnterView", "ChatAttach", "ChatListItem", "MessageObject")),
    ("dialogs", ("DialogsActivity", "DialogCell", "DialogsAdapter", "FiltersView", "FolderTabs")),
    ("media", ("PhotoViewer", "MediaController", "VideoPlayer", "Pip", "Gallery", "Camera", "Audio", "Voice", "Sticker", "Gif")),
    ("call", ("VoIP", "Voip", "Call", "GroupCall", "Calls")),
    ("profile", ("ProfileActivity", "UserCell", "Profile", "ProfileGift")),
    ("settings", ("SettingsActivity", "Settings", "Preferences", "ThemeActivity", "SharedConfig", "NotificationsSettings")),
    ("theme", ("Theme", "ActionBar", "Color", "Blur", "Glass")),
    ("network", ("ConnectionsManager", "tgnet", "RequestDelegate", "TLRPC", "MessagesController", "MessagesStorage")),
    ("notifications", ("NotificationsController", "NotificationCenter", "Notification")),
    ("stories", ("Stories", "Story")),
    ("emoji", ("Emoji", "Reaction", "Animated")),
    ("login", ("LoginActivity", "Login", "Passcode", "Auth")),
]


def category(path, cls):
    key = path + "/" + cls
    for name, words in CATEGORIES:
        if any(w.lower() in key.lower() for w in words):
            return name
    return "other"


def kind_of(path, cls, base, name, body_head):
    visual_class = bool(base) and any(base.endswith(b) or b in base for b in VIEW_BASES)
    in_ui = "/ui/" in path or "ActionBar" in path or "/Components/" in path or "/Cells/" in path
    if VISUAL_NAMES.match(name):
        return "visual"
    if "Canvas " in body_head or "Paint " in body_head:
        return "visual"
    if FUNCTION_NAMES.match(name) and not (visual_class and name.startswith(("set", "get", "is"))):
        return "function"
    if visual_class or in_ui:
        return "visual"
    return "function"


STRIP_RE = re.compile(r'//[^\n]*|/\*.*?\*/|"(?:\\.|[^"\\\n])*"|\'(?:\\.|[^\'\\\n])*\'', re.S)


def blank(m):
    return re.sub(r"[^\n]", " ", m.group(0))


def scan_file(full, rel):
    try:
        with open(full, encoding="utf-8", errors="replace") as f:
            text = f.read()
    except OSError:
        return []
    text = STRIP_RE.sub(blank, text)  # комментарии и строки не должны ломать подсчёт скобок
    events = []
    for m in CLASS_RE.finditer(text):
        events.append((m.start(), "class", m.group(1), m.group(2) or ""))
    for m in re.finditer(r"[{}]", text):
        events.append((m.start(), m.group(0), "", ""))
    methods = {}
    for m in METHOD_RE.finditer(text):
        methods[m.end() - 1] = m  # позиция открывающей скобки тела
    events.sort(key=lambda e: e[0])
    out = []
    stack = []  # (имя, база, глубина, на_каком_уровне_открыт)
    depth = 0
    pending = None
    for pos, kind, name, base in events:
        if kind == "class":
            pending = (name, base)
        elif kind == "{":
            m = methods.get(pos)
            if m is not None and stack:
                mname = m.group(3)
                ret = m.group(2).strip()
                cls, cbase = stack[-1][0], stack[-1][1]
                if (mname not in KEYWORDS and mname != cls and ret not in KEYWORDS
                        and not ret.startswith(("new ", "return ", "else ", "throw "))
                        and depth == stack[-1][2] + 1):
                    mods = m.group(1)
                    chain = "$".join(c[0] for c in stack)
                    top = rel[:-5].replace("/", ".")
                    cname = top if len(stack) == 1 and stack[0][0] == os.path.basename(rel)[:-5] else top.rsplit(".", 1)[0] + "." + chain
                    out.append({
                        "class": cname,
                        "method": mname,
                        "params": " ".join(m.group(4).split()),
                        "returns": ret,
                        "static": "static" in mods,
                        "private": "private" in mods,
                        "kind": None,
                        "category": None,
                        "_base": cbase,
                        "_head": text[m.end():m.end() + 400],
                        "_path": rel,
                        "_cls": cls,
                    })
            elif pending is not None:
                stack.append((pending[0], pending[1], depth))
                pending = None
            depth += 1
        elif kind == "}":
            depth -= 1
            if stack and depth == stack[-1][2]:
                stack.pop()
    return out


def collect():
    items = []
    for sub in SCAN:
        base = os.path.join(ROOT, sub)
        for dp, _, files in os.walk(base):
            for fn in files:
                if not fn.endswith(".java"):
                    continue
                full = os.path.join(dp, fn)
                rel = os.path.relpath(full, ROOT).replace(os.sep, "/")
                items.extend(scan_file(full, rel))
    for it in items:
        it["kind"] = kind_of(it["_path"], it["_cls"], it["_base"], it["method"], it["_head"])
        it["category"] = category(it["_path"], it["_cls"])
        for k in ("_base", "_head", "_path", "_cls"):
            del it[k]
    return items


def existing_hook_points():
    path = os.path.join(ROOT, "com", "tgyou", "core", "Hooks.java")
    try:
        with open(path, encoding="utf-8") as f:
            return re.findall(r'new HookPoint<[^>]*>+\("([^"]+)"\)', f.read())
    except OSError:
        return []


def summary(items):
    by = collections.Counter((i["kind"], i["category"]) for i in items if not i["private"])
    lines = ["Всего методов с телом: %d (публичных/пакетных: %d)" % (len(items), sum(1 for i in items if not i["private"])), ""]
    for kind in ("visual", "function"):
        total = sum(c for (k, _), c in by.items() if k == kind)
        lines.append("%s: %d" % (kind, total))
        for (k, cat), c in sorted(by.items(), key=lambda x: -x[1]):
            if k == kind:
                lines.append("   %-14s %d" % (cat, c))
    pts = existing_hook_points()
    lines += ["", "Готовых именованных хуков (Hooks.java): %d" % len(pts)]
    return "\n".join(lines)


def markdown(items):
    pts = existing_hook_points()
    out = ["# Каталог мест для хуков", "",
           "Сгенерировано `modding/hooks/hook_scan.py` (эвристика по regexp, не компилятор: категории и сигнатуры могут быть неточными).",
           "Любой метод из каталога доступен модам через `hook_method(класс, метод)` (Pine). Готовые именованные хуки — в разделе ниже.", "",
           "## Готовые именованные хуки (`Hooks.java`)", ""]
    out += ["- `%s`" % p for p in pts]
    out += ["", "## Сводка найденных мест", "", "```", summary(items), "```", "",
            "Полный список: `python3 modding/hooks/hook_scan.py --json build/hook_catalog.json` или поиск `--find` / `--kind` / `--cat`.", ""]
    return "\n".join(out)


def write_catalog(items, outdir):
    """Полный каталог: catalog/hooks.json (компактный) и по markdown-файлу на пару вид+категория."""
    os.makedirs(outdir, exist_ok=True)
    pub = [i for i in items if not i["private"]]
    slim = [[i["class"], i["method"], i["params"], i["returns"], i["kind"], i["category"], int(i["static"])] for i in pub]
    with open(os.path.join(outdir, "hooks.json"), "w", encoding="utf-8") as f:
        json.dump({"fields": ["class", "method", "params", "returns", "kind", "category", "static"], "items": slim}, f, ensure_ascii=False, separators=(",", ":"))
    groups = collections.defaultdict(lambda: collections.defaultdict(list))
    for i in pub:
        groups[(i["kind"], i["category"])][i["class"]].append(i)
    index = ["# Полный каталог мест для хуков", "",
             "Сгенерировано `hook_scan.py --catalog`. Каждый метод можно перехватить: `api.hook_by_name(класс, имя, before, after, replace)`.",
             "Для вложенных классов имя через `$` (так его понимает Java). Приватные методы не включены. Классификация эвристическая.", "",
             "Машинный вид: [hooks.json](hooks.json) (поля: class, method, params, returns, kind, category, static).", "",
             "| Вид | Категория | Методов | Файл |", "|---|---|---|---|"]
    for (kind, cat), classes in sorted(groups.items()):
        name = "%s_%s.md" % (kind, cat)
        total = sum(len(v) for v in classes.values())
        index.append("| %s | %s | %d | [%s](%s) |" % (kind, cat, total, name, name))
        lines = ["# %s / %s (%d методов)" % (kind, cat, total), ""]
        for cls in sorted(classes):
            lines.append("## `%s`" % cls)
            for i in sorted(classes[cls], key=lambda x: x["method"]):
                lines.append("- `%s%s(%s)` -> `%s`" % ("static " if i["static"] else "", i["method"], i["params"], i["returns"]))
            lines.append("")
        with open(os.path.join(outdir, name), "w", encoding="utf-8") as f:
            f.write("\n".join(lines))
    with open(os.path.join(outdir, "README.md"), "w", encoding="utf-8") as f:
        f.write("\n".join(index) + "\n")
    print("каталог: %d методов в %s" % (len(pub), outdir))


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--kind", choices=["visual", "function"])
    ap.add_argument("--cat")
    ap.add_argument("--find", help="подстрока в имени класса или метода (без регистра)")
    ap.add_argument("--limit", type=int, default=50)
    ap.add_argument("--all", action="store_true", help="включая private")
    ap.add_argument("--summary", action="store_true")
    ap.add_argument("--json")
    ap.add_argument("--markdown")
    ap.add_argument("--catalog", help="папка для полного каталога (json + markdown по категориям)")
    a = ap.parse_args()

    items = collect()
    if not items:
        print("Исходники не найдены: " + os.path.normpath(ROOT), file=sys.stderr)
        return 1
    if a.json:
        os.makedirs(os.path.dirname(os.path.abspath(a.json)), exist_ok=True)
        with open(a.json, "w", encoding="utf-8") as f:
            json.dump(items, f, ensure_ascii=False, indent=1)
        print("записано %d записей в %s" % (len(items), a.json))
    if a.markdown:
        with open(a.markdown, "w", encoding="utf-8") as f:
            f.write(markdown(items))
        print("записано " + a.markdown)
    if a.catalog:
        write_catalog(items, a.catalog)
    if a.summary or not (a.catalog or a.json or a.markdown or a.kind or a.cat or a.find):
        print(summary(items))
        return 0
    if a.kind or a.cat or a.find:
        shown = 0
        needle = (a.find or "").lower()
        for i in items:
            if i["private"] and not a.all:
                continue
            if a.kind and i["kind"] != a.kind:
                continue
            if a.cat and i["category"] != a.cat:
                continue
            if needle and needle not in (i["class"] + "." + i["method"]).lower():
                continue
            print("[%s/%s] %s.%s(%s) -> %s" % (i["kind"], i["category"], i["class"], i["method"], i["params"], i["returns"]))
            shown += 1
            if shown >= a.limit:
                break
        print("показано %d" % shown)
    return 0


if __name__ == "__main__":
    sys.exit(main())
