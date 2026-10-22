package com.tgyou.core;

import android.text.Editable;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/** «Результаты вычислений»: после «=» в поле ввода выражение перед знаком заменяется ответом. */
public final class TgYouCalc {

    private static boolean busy;
    private static int lastLength;

    private TgYouCalc() {
    }

    /** Hook for the message field's afterTextChanged. */
    public static void process(Editable editable) {
        if (editable == null || busy) {
            return;
        }
        int length = editable.length();
        boolean grew = length > lastLength;
        lastLength = length;
        if (!grew || length < 3 || editable.charAt(length - 1) != '=' || !TgYouPrefs.bool(TgYouChatTweaks.CALC, false)) {
            return;
        }
        int start = length - 1;
        while (start > 0 && "0123456789+-*/^().,% x×÷−".indexOf(editable.charAt(start - 1)) >= 0) {
            start--;
        }
        String result = null;
        for (int i = start; i < length - 1 && result == null; i++) {
            String expression = editable.subSequence(i, length - 1).toString().trim();
            if (expression.isEmpty() || !expression.matches(".*\\d.*") || !expression.matches(".*[-+*/^x×÷−%].*")) {
                continue;
            }
            result = evaluate(expression);
        }
        if (result == null) {
            return;
        }
        busy = true;
        try {
            editable.replace(length - 1, length, "= " + result);
            lastLength = editable.length();
        } finally {
            busy = false;
        }
    }

    /** @return the formatted value or null when the text is not a valid expression */
    public static String evaluate(String expression) {
        try {
            Parser parser = new Parser(expression.replace('×', '*').replace('x', '*').replace('÷', '/').replace('−', '-').replace(',', '.').replace(" ", ""));
            double value = parser.parse();
            if (Double.isNaN(value) || Double.isInfinite(value)) {
                return null;
            }
            if (value == Math.rint(value) && Math.abs(value) < 1e15) {
                return String.valueOf((long) value);
            }
            BigDecimal decimal = new BigDecimal(value).round(new MathContext(12, RoundingMode.HALF_UP)).stripTrailingZeros();
            return decimal.toPlainString();
        } catch (Throwable t) {
            return null;
        }
    }

    private static final class Parser {
        private final String s;
        private int pos;

        Parser(String s) {
            this.s = s;
        }

        double parse() {
            double v = expr();
            if (pos != s.length()) {
                throw new IllegalArgumentException();
            }
            return v;
        }

        private double expr() {
            double v = term();
            while (pos < s.length()) {
                char c = s.charAt(pos);
                if (c == '+') {
                    pos++;
                    v += term();
                } else if (c == '-') {
                    pos++;
                    v -= term();
                } else {
                    break;
                }
            }
            return v;
        }

        private double term() {
            double v = power();
            while (pos < s.length()) {
                char c = s.charAt(pos);
                if (c == '*') {
                    pos++;
                    v *= power();
                } else if (c == '/') {
                    pos++;
                    v /= power();
                } else {
                    break;
                }
            }
            return v;
        }

        private double power() {
            double base = unary();
            if (pos < s.length() && s.charAt(pos) == '^') {
                pos++;
                return Math.pow(base, power());
            }
            return base;
        }

        private double unary() {
            if (pos < s.length() && s.charAt(pos) == '-') {
                pos++;
                return -unary();
            }
            if (pos < s.length() && s.charAt(pos) == '+') {
                pos++;
                return unary();
            }
            double v = atom();
            while (pos < s.length() && s.charAt(pos) == '%') {
                pos++;
                v /= 100;
            }
            return v;
        }

        private double atom() {
            if (pos < s.length() && s.charAt(pos) == '(') {
                pos++;
                double v = expr();
                if (pos >= s.length() || s.charAt(pos) != ')') {
                    throw new IllegalArgumentException();
                }
                pos++;
                return v;
            }
            int start = pos;
            while (pos < s.length() && (Character.isDigit(s.charAt(pos)) || s.charAt(pos) == '.')) {
                pos++;
            }
            if (start == pos) {
                throw new IllegalArgumentException();
            }
            return Double.parseDouble(s.substring(start, pos));
        }
    }
}
