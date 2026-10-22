"""exteraGram text_formatting: HTML / Markdown -> message text + Telegram entities (UTF-16 offsets)."""
import re
from html.parser import HTMLParser


class TLEntityType:
    CODE = "CODE"
    PRE = "PRE"
    STRIKETHROUGH = "STRIKETHROUGH"
    TEXT_LINK = "TEXT_LINK"
    BOLD = "BOLD"
    ITALIC = "ITALIC"
    UNDERLINE = "UNDERLINE"
    SPOILER = "SPOILER"
    CUSTOM_EMOJI = "CUSTOM_EMOJI"
    BLOCKQUOTE = "BLOCKQUOTE"


class RawEntity:
    def __init__(self, type, offset, length, language=None, url=None, document_id=None, collapsed=False):
        self.type = type
        self.offset = offset
        self.length = length
        self.language = language
        self.url = url
        self.document_id = document_id
        self.collapsed = collapsed

    def __repr__(self):
        return "RawEntity(%s, %d, %d)" % (self.type, self.offset, self.length)


def u16len(s):
    return len(s.encode("utf-16-le")) // 2


# ---- HTML ---------------------------------------------------------------------

_HTML_TAGS = {
    "b": TLEntityType.BOLD, "strong": TLEntityType.BOLD,
    "i": TLEntityType.ITALIC, "em": TLEntityType.ITALIC,
    "u": TLEntityType.UNDERLINE, "ins": TLEntityType.UNDERLINE,
    "s": TLEntityType.STRIKETHROUGH, "del": TLEntityType.STRIKETHROUGH, "strike": TLEntityType.STRIKETHROUGH,
    "code": TLEntityType.CODE, "pre": TLEntityType.PRE,
    "spoiler": TLEntityType.SPOILER, "tg-spoiler": TLEntityType.SPOILER,
    "blockquote": TLEntityType.BLOCKQUOTE, "a": TLEntityType.TEXT_LINK,
}


class _HtmlReader(HTMLParser):
    def __init__(self):
        super().__init__(convert_charrefs=True)
        self.out = []
        self.pos = 0
        self.stack = []
        self.entities = []

    def handle_starttag(self, tag, attrs):
        a = dict(attrs)
        if tag == "emoji":
            self.stack.append(("emoji", self.pos, a))
            return
        if tag in _HTML_TAGS:
            self.stack.append((tag, self.pos, a))

    def handle_endtag(self, tag):
        for i in range(len(self.stack) - 1, -1, -1):
            name, start, attrs = self.stack[i]
            if name == tag:
                del self.stack[i]
                length = self.pos - start
                if length <= 0:
                    return
                if tag == "emoji":
                    try:
                        self.entities.append(RawEntity(TLEntityType.CUSTOM_EMOJI, start, length, document_id=int(attrs.get("id"))))
                    except Exception:
                        pass
                    return
                kind = _HTML_TAGS[tag]
                if tag == "code" and any(n == "pre" for n, _, _ in self.stack):
                    # <pre><code class="language-x"> : carry the language onto the pre entity
                    for n, s, at in self.stack:
                        if n == "pre":
                            cls = attrs.get("class", "")
                            if cls.startswith("language-"):
                                at["language"] = cls[9:]
                    return
                ent = RawEntity(kind, start, length)
                if kind == TLEntityType.TEXT_LINK:
                    ent.url = attrs.get("href")
                    if not ent.url:
                        return
                elif kind == TLEntityType.PRE:
                    ent.language = attrs.get("language") or ""
                elif kind == TLEntityType.BLOCKQUOTE:
                    ent.collapsed = "expandable" in attrs or "collapsed" in attrs
                self.entities.append(ent)
                return

    def handle_data(self, data):
        self.out.append(data)
        self.pos += u16len(data)


def _parse_html(text):
    r = _HtmlReader()
    r.feed(text)
    r.close()
    return "".join(r.out), sorted(r.entities, key=lambda e: (e.offset, -e.length))


# ---- Markdown -------------------------------------------------------------------

_INLINE = [
    ("pre", re.compile(r"```(?:([\w+#.-]+)\n)?(.*?)```", re.S)),
    ("code", re.compile(r"`([^`\n]+)`")),
    ("emoji", re.compile(r"!\[([^\]]*)\]\(tg://emoji\?id=(\d+)\)")),
    ("link", re.compile(r"\[([^\]]+)\]\(([^)\s]+)\)")),
    ("spoiler", re.compile(r"\|\|(.+?)\|\|", re.S)),
    ("underline", re.compile(r"__(.+?)__", re.S)),
    ("bold", re.compile(r"\*(.+?)\*", re.S)),
    ("italic", re.compile(r"(?<![\w])_(.+?)_(?![\w])", re.S)),
    ("strike", re.compile(r"~(.+?)~", re.S)),
]

_KINDS = {
    "underline": TLEntityType.UNDERLINE, "bold": TLEntityType.BOLD, "italic": TLEntityType.ITALIC,
    "strike": TLEntityType.STRIKETHROUGH, "spoiler": TLEntityType.SPOILER,
}


def _md_inline(text):
    out = []
    ents = []
    pos = 0
    i = 0
    while i < len(text):
        best = None
        for name, rx in _INLINE:
            m = rx.search(text, i)
            if m and (best is None or m.start() < best[1].start()):
                best = (name, m)
        if best is None:
            break
        name, m = best
        chunk = text[i:m.start()]
        out.append(chunk)
        pos += u16len(chunk)
        start = pos
        if name == "pre":
            body = m.group(2)
            out.append(body)
            pos += u16len(body)
            ents.append(RawEntity(TLEntityType.PRE, start, pos - start, language=m.group(1) or ""))
        elif name == "code":
            body = m.group(1)
            out.append(body)
            pos += u16len(body)
            ents.append(RawEntity(TLEntityType.CODE, start, pos - start))
        elif name == "emoji":
            body = m.group(1) or "\U0001F600"
            out.append(body)
            pos += u16len(body)
            ents.append(RawEntity(TLEntityType.CUSTOM_EMOJI, start, pos - start, document_id=int(m.group(2))))
        else:
            inner = m.group(1) if name != "link" else m.group(1)
            plain, sub = _md_inline(inner)
            out.append(plain)
            for e in sub:
                e.offset += start
                ents.append(e)
            pos += u16len(plain)
            if name == "link":
                ents.append(RawEntity(TLEntityType.TEXT_LINK, start, pos - start, url=m.group(2)))
            else:
                ents.append(RawEntity(_KINDS[name], start, pos - start))
        i = m.end()
    tail = text[i:]
    out.append(tail)
    return "".join(out), ents


def _parse_markdown(text):
    lines = text.split("\n")
    out = []
    ents = []
    pos = 0
    i = 0
    first = True
    while i < len(lines):
        if lines[i].startswith(">") or lines[i].startswith("**>"):
            expandable = lines[i].startswith("**>")
            block = []
            while i < len(lines) and (lines[i].startswith(">") or (lines[i].startswith("**>") and not block) or (expandable and block and lines[i].startswith(">"))):
                line = lines[i]
                line = line[3:] if line.startswith("**>") else line[1:]
                block.append(line[1:] if line.startswith(" ") else line)
                i += 1
            plain, sub = _md_inline("\n".join(block))
            if not first:
                out.append("\n")
                pos += 1
            for e in sub:
                e.offset += pos
                ents.append(e)
            ents.append(RawEntity(TLEntityType.BLOCKQUOTE, pos, u16len(plain), collapsed=expandable))
            out.append(plain)
            pos += u16len(plain)
        else:
            group = []
            while i < len(lines) and not (lines[i].startswith(">") or lines[i].startswith("**>")):
                group.append(lines[i])
                i += 1
            plain, sub = _md_inline("\n".join(group))
            if not first:
                out.append("\n")
                pos += 1
            for e in sub:
                e.offset += pos
                ents.append(e)
            out.append(plain)
            pos += u16len(plain)
        first = False
    return "".join(out), sorted(ents, key=lambda e: (e.offset, -e.length))


class HTML:
    @staticmethod
    def parse(text):
        return _parse_html(text)

    @staticmethod
    def unparse(text, entities):
        return _unparse(text, entities, html=True)


class Markdown:
    @staticmethod
    def parse(text):
        return _parse_markdown(text)

    @staticmethod
    def unparse(text, entities):
        return _unparse(text, entities, html=False)


def _unparse(text, entities, html):
    units = text.encode("utf-16-le")
    opens, closes = {}, {}
    for e in entities or []:
        tag = {TLEntityType.BOLD: ("b", "*"), TLEntityType.ITALIC: ("i", "_"), TLEntityType.UNDERLINE: ("u", "__"),
               TLEntityType.STRIKETHROUGH: ("s", "~"), TLEntityType.CODE: ("code", "`"), TLEntityType.SPOILER: ("spoiler", "||")}.get(e.type)
        if tag is None:
            continue
        o, c = ("<%s>" % tag[0], "</%s>" % tag[0]) if html else (tag[1], tag[1])
        opens.setdefault(e.offset, []).append(o)
        closes.setdefault(e.offset + e.length, []).insert(0, c)
    out = []
    for i in range(len(units) // 2 + 1):
        out.extend(closes.get(i, []))
        out.extend(opens.get(i, []))
        if i < len(units) // 2:
            out.append(units[i * 2:i * 2 + 2].decode("utf-16-le", "surrogatepass") if True else "")
    return "".join(out)


def to_java_entities(raw_entities):
    """RawEntity list -> java.util.ArrayList<TLRPC.MessageEntity>."""
    from java import jclass
    TL = "org.telegram.tgnet.TLRPC$TL_messageEntity"
    names = {
        TLEntityType.BOLD: "Bold", TLEntityType.ITALIC: "Italic", TLEntityType.UNDERLINE: "Underline",
        TLEntityType.STRIKETHROUGH: "Strike", TLEntityType.CODE: "Code", TLEntityType.PRE: "Pre",
        TLEntityType.TEXT_LINK: "TextUrl", TLEntityType.SPOILER: "Spoiler",
        TLEntityType.CUSTOM_EMOJI: "CustomEmoji", TLEntityType.BLOCKQUOTE: "Blockquote",
    }
    result = jclass("java.util.ArrayList")()
    for e in raw_entities:
        cls = names.get(e.type)
        if cls is None:
            continue
        obj = jclass(TL + cls)()
        obj.offset = int(e.offset)
        obj.length = int(e.length)
        if e.type == TLEntityType.PRE:
            obj.language = e.language or ""
        elif e.type == TLEntityType.TEXT_LINK:
            obj.url = e.url
        elif e.type == TLEntityType.CUSTOM_EMOJI:
            obj.document_id = int(e.document_id)
        elif e.type == TLEntityType.BLOCKQUOTE:
            obj.collapsed = bool(e.collapsed)
        result.add(obj)
    return result


def parse_text(text, parse_mode="HTML", is_caption=False):
    mode = (parse_mode or "").upper()
    if mode in ("MARKDOWN", "MD"):
        plain, raw = _parse_markdown(text)
    elif mode == "HTML":
        plain, raw = _parse_html(text)
    else:
        plain, raw = text, []
    return {"caption" if is_caption else "message": plain, "entities": to_java_entities(raw)}
