package com.github.llyb120.nami.json;

public interface FlexAction<T> {
    boolean canFlex(String k, T v);
    Object call(String k, T v);
}
