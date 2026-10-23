package com.tgyou.ui;

import com.tgyou.update.Updater;

/** The version line shown under the settings list: «Telegram You · beta39», then what it is based on. */
public final class TgYouVersion {

    private TgYouVersion() {
    }

    /** "beta39" for release builds, "dev" for CI builds without a release tag. */
    public static String beta() {
        String tag = Updater.installedTag();
        java.util.regex.Matcher m = java.util.regex.Pattern.compile("beta(\\d+)").matcher(tag == null ? "" : tag);
        return m.find() ? "beta" + m.group(1) : "dev";
    }

    /** Two lines: our name and beta, then the Telegram base version, build code and ABI. */
    public static String full(String versionName, int code, String abi) {
        String base = versionName == null ? "" : versionName.replaceAll("-tgyou.*$", "");
        String arch = abi == null ? "" : abi.replaceAll("^(?:store bundled|direct|universal)\\s+", "").split("\\s+")[0];
        return "Telegram You · " + beta() + "\nна базе Telegram " + base + " · " + code + (arch.isEmpty() ? "" : " · " + arch);
    }
}
