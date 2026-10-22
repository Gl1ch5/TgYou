package com.tgyou.core;

public interface HookHandler<I, O> {

    /**
     * @param input   read-only context of the hook
     * @param current value produced by the previous handler (or the initial value)
     * @return the new value
     */
    O handle(I input, O current);
}
