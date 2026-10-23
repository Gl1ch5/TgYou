package com.tgyou.mods;

import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Turns the text a neural network answers with into the bytes of a .mod file. The answer is a list of files,
 * each starting with a line "=== path ===", optionally wrapped in markdown code fences.
 */
public final class ModBundle {

    private static final Pattern HEADER = Pattern.compile("^\\s*={3,}\\s*([A-Za-z0-9_./-]+)\\s*={3,}\\s*$");

    private ModBundle() {
    }

    /** @return the ZIP bytes, or null when the text has no "=== file ===" sections */
    public static byte[] build(String text) throws Exception {
        Map<String, StringBuilder> files = parse(text);
        if (files.isEmpty()) {
            return null;
        }
        if (!files.containsKey("manifest.json")) {
            throw new Exception("В ответе нет файла manifest.json");
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try (ZipOutputStream zip = new ZipOutputStream(out)) {
            for (Map.Entry<String, StringBuilder> e : files.entrySet()) {
                zip.putNextEntry(new ZipEntry(e.getKey()));
                zip.write(clean(e.getValue().toString()).getBytes(StandardCharsets.UTF_8));
                zip.closeEntry();
            }
        }
        return out.toByteArray();
    }

    static Map<String, StringBuilder> parse(String text) throws Exception {
        Map<String, StringBuilder> files = new LinkedHashMap<>();
        if (text == null) {
            return files;
        }
        StringBuilder current = null;
        for (String line : text.replace("\r\n", "\n").replace('\r', '\n').split("\n", -1)) {
            Matcher m = HEADER.matcher(line);
            if (m.matches()) {
                String path = m.group(1);
                if (path.startsWith("/") || path.contains("..") || path.length() > 120) {
                    throw new Exception("Недопустимый путь файла: " + path);
                }
                if (files.containsKey(path)) {
                    throw new Exception("Файл повторяется: " + path);
                }
                current = new StringBuilder();
                files.put(path, current);
            } else if (current != null) {
                current.append(line).append('\n');
            }
        }
        return files;
    }

    /** Cuts a file body to its content: an inner code fence is unwrapped, an outer closing fence ends the file. */
    static String clean(String body) {
        StringBuilder sb = new StringBuilder();
        boolean inFence = false;
        for (String line : body.split("\n", -1)) {
            if (line.trim().startsWith("```")) {
                if (!inFence && sb.toString().trim().isEmpty()) {
                    inFence = true;
                    continue;
                }
                break;
            }
            sb.append(line).append('\n');
        }
        String s = sb.toString().trim();
        return s.isEmpty() ? s : s + "\n";
    }
}
