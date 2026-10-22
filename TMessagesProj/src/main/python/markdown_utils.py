"""exteraGram markdown_utils."""
from extera_utils.text_formatting import _parse_markdown, to_java_entities


class ParsedMessage:
    def __init__(self, text, entities):
        self.text = text
        self.entities = entities


def parse_markdown(markdown):
    plain, raw = _parse_markdown(markdown)
    return ParsedMessage(plain, to_java_entities(raw))
