package com.github.llyb120.nami.json;

import org.apache.commons.logging.impl.WeakHashtable;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class JsonPool {

    public static final Map<Object,Map> MapPool = new WeakHashtable();
}
