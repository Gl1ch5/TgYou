package com.tgyou.mods;

import com.chaquo.python.PyObject;

import org.telegram.messenger.FileLog;

import java.lang.reflect.Member;

import top.canyie.pine.Pine;
import top.canyie.pine.callback.MethodHook;

/** Xposed-style method hooks (exteraGram hook_method) on top of Pine. Every failure is logged, never thrown into the mod. */
public final class PineHooks {

    private static int state;
    private static String failure = "";

    private PineHooks() {
    }

    /** What a Python hook callback receives; mirrors Xposed's MethodHookParam. */
    public static final class Param {
        public final Member method;
        public final Object thisObject;
        public final Object[] args;
        private final Pine.CallFrame frame;

        Param(Pine.CallFrame frame) {
            this.frame = frame;
            this.method = frame.method;
            this.thisObject = frame.thisObject;
            this.args = frame.args;
        }

        public Object getResult() {
            return frame.getResult();
        }

        public void setResult(Object result) {
            frame.setResult(result);
        }

        public Throwable getThrowable() {
            return frame.getThrowable();
        }

        public boolean hasThrowable() {
            return frame.hasThrowable();
        }

        public void setThrowable(Throwable t) {
            frame.setThrowable(t);
        }
    }

    public static synchronized String failure() {
        return failure;
    }

    private static synchronized boolean ready() {
        if (state == 0) {
            try {
                Pine.ensureInitialized();
                state = 1;
            } catch (Throwable t) {
                state = 2;
                failure = String.valueOf(t);
                FileLog.e("tgyou: Pine init failed", t);
            }
        }
        return state == 1;
    }

    /** Returns the Pine Unhook handle, or null when hooking is impossible here. */
    static Object hook(String modId, com.tgyou.core.PluginContext context, Member target, PyObject before, PyObject after, PyObject replace) {
        if (!ready()) {
            ModLog.add(modId, "hook_method недоступен на этом устройстве: " + failure);
            return null;
        }
        try {
            return Pine.hook(target, new MethodHook() {
                @Override
                public void beforeCall(Pine.CallFrame frame) {
                    if (!context.isEnabled()) {
                        return;
                    }
                    Param p = new Param(frame);
                    run(modId, "before", before, p);
                    if (replace != null && context.isEnabled()) {
                        try {
                            PyObject r = replace.call(p);
                            frame.setResult(r == null ? null : r.toJava(Object.class));
                        } catch (Throwable t) {
                            ModLog.add(modId, "replace " + target + ": " + t);
                        }
                    }
                }

                @Override
                public void afterCall(Pine.CallFrame frame) {
                    if (after != null && context.isEnabled()) {
                        run(modId, "after", after, new Param(frame));
                    }
                }
            });
        } catch (Throwable t) {
            ModLog.add(modId, "hook " + target + ": " + t);
            FileLog.e("tgyou: hook failed " + target, t);
            return null;
        }
    }

    private static void run(String modId, String when, PyObject fn, Param p) {
        if (fn == null) {
            return;
        }
        try {
            fn.call(p);
        } catch (Throwable t) {
            ModLog.add(modId, when + " " + p.method + ": " + t);
        }
    }

    static void unhook(Object handle) {
        if (handle instanceof MethodHook.Unhook) {
            try {
                ((MethodHook.Unhook) handle).unhook();
            } catch (Throwable t) {
                FileLog.e("tgyou: unhook", t);
            }
        }
    }
}
