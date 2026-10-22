"""Static compatibility check of exteraGram .plugin files against our compat layer. Never executes plugin code.

Usage: python3 -I tools/extera_check.py file.plugin [...]
"""
import ast
import os
import sys

ROOT = os.path.join(os.path.dirname(os.path.abspath(__file__)), "..", "TMessagesProj", "src", "main", "python")
STD = set(sys.stdlib_module_names)
JAVA = ("java", "javax", "android", "androidx", "dalvik", "org", "com", "de", "kotlin", "kotlinx", "libcore")
PIP_OK = {"requests", "bs4", "PIL", "numpy", "urllib3", "certifi", "idna", "charset_normalizer"}


def module_path(mod):
    base = os.path.join(ROOT, *mod.split("."))
    for p in (base + ".py", os.path.join(base, "__init__.py")):
        if os.path.exists(p):
            return p
    return None


def exported(path):
    names = set()
    tree = ast.parse(open(path, encoding="utf-8").read())
    for n in tree.body:
        if isinstance(n, (ast.FunctionDef, ast.ClassDef)):
            names.add(n.name)
        elif isinstance(n, ast.Assign):
            for t in n.targets:
                if isinstance(t, ast.Name):
                    names.add(t.id)
        elif isinstance(n, (ast.Import, ast.ImportFrom)):
            for a in n.names:
                names.add((a.asname or a.name).split(".")[0])
    return names, tree


def base_plugin_members():
    names, tree = exported(os.path.join(ROOT, "base_plugin.py"))
    members = set()
    for n in tree.body:
        if isinstance(n, ast.ClassDef) and n.name == "BasePlugin":
            for m in n.body:
                if isinstance(m, ast.FunctionDef):
                    members.add(m.name)
                elif isinstance(m, ast.Assign):
                    members.update(t.id for t in m.targets if isinstance(t, ast.Name))
    return members


def check(path):
    problems, notes = [], []
    src = open(path, encoding="utf-8", errors="replace").read()
    try:
        tree = ast.parse(src)
    except SyntaxError as e:
        return ["синтаксическая ошибка: %s" % e], []
    for n in ast.walk(tree):
        if isinstance(n, ast.ImportFrom) and n.module and n.level == 0:
            top = n.module.split(".")[0]
            mp = module_path(n.module)
            if mp:
                names, _ = exported(mp)
                for a in n.names:
                    if a.name != "*" and a.name not in names:
                        problems.append("строка %d: в %s нет «%s»" % (n.lineno, n.module, a.name))
            elif top not in STD and top not in PIP_OK and top not in JAVA:
                problems.append("строка %d: модуль %s не найден" % (n.lineno, n.module))
        elif isinstance(n, ast.Import):
            for a in n.names:
                top = a.name.split(".")[0]
                if not module_path(a.name) and top not in STD and top not in PIP_OK and top not in JAVA:
                    problems.append("строка %d: модуль %s не найден" % (n.lineno, a.name))
    members = base_plugin_members()
    classes = [n for n in tree.body if isinstance(n, ast.ClassDef)]
    for c in classes:
        own = {m.name for m in c.body if isinstance(m, ast.FunctionDef)}
        for n in ast.walk(c):
            if isinstance(n, ast.Attribute) and isinstance(n.value, ast.Name) and n.value.id == "self":
                a = n.attr
                if a.startswith(("add_", "remove_", "hook_", "unhook_")) and a not in members and a not in own:
                    problems.append("строка %d: self.%s — нет в совместимости (вызов молча ничего не сделает)" % (n.lineno, a))
        hooks = sorted(m for m in own if m.endswith("_hook") or m in ("on_plugin_load", "on_plugin_unload", "on_app_event", "create_settings"))
        if hooks:
            notes.append("%s: %s" % (c.name, ", ".join(hooks)))
    return problems, notes


if __name__ == "__main__":
    bad = 0
    for p in sys.argv[1:]:
        problems, notes = check(p)
        bad += bool(problems)
        print(("FAIL " if problems else "OK   ") + os.path.basename(p))
        for x in notes:
            print("     +", x)
        for x in problems:
            print("     !", x)
    print("с проблемами: %d из %d" % (bad, len(sys.argv) - 1))
