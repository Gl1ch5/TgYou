package com.tgyou.core;

/**
 * A named extension point. {@code I} is the read-only input handed to every handler,
 * {@code O} is the value that flows through the handler chain.
 */
public final class HookPoint<I, O> {

    public final String name;

    public HookPoint(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
