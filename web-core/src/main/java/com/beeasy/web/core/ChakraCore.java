package com.beeasy.web.core;

import cn.hutool.core.thread.ThreadUtil;
import com.alibaba.fastjson.JSONObject;
import com.sun.jna.*;
import com.sun.jna.Native;
import com.sun.jna.ptr.NativeLongByReference;
import com.sun.jna.ptr.PointerByReference;
import jdk.nashorn.internal.ir.FunctionCall;

import static com.beeasy.web.core.Config.config;

import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChakraCore {

    public ChakraCore(boolean async) {
        start(async);
    }

    /**
     * 运行时，每个线程一个
     */
    private Pointer runtime;
    private Pointer context;

//    public List<Holder> holders = new ArrayList<>();
//    private ThreadLocal<Holder> localHolder = new ThreadLocal(){
//
//        @Override
//        protected Object initialValue() {
//            Pointer pointer = createRuntime();
//            initContext();
//            Holder holder = new Holder();
//            holder.
//
//            runtimePtrs.add(pointer);
//            return pointer;
//        }
//
//    };

    private Dll instance;
    private static WString emptyString = new WString("");
    private boolean fatal = false;

//    private static class Holder{
//        public Pointer runtiem;
//        public Pointer context;
//    }

    public interface Dll extends Library {

        int JsCreateContext(Pointer a, PointerType b);

        int JsCreateRuntime(int a, PointerType b, PointerByReference c);

        int JsSetCurrentContext(Pointer context);

        int JsRunScript(WString a, int b, WString c, PointerByReference d);

        int JsConvertValueToString(Pointer a, PointerByReference b);

        int JsStringToPointer(Pointer value, WString[] ret, long[] len);

        int JsHasException(boolean[] a);

        int JsGetAndClearException(PointerByReference a);

        int JsCreateString(String content, long len, PointerByReference ret);

        int JsCreateNamedFunction(Pointer name, FunctionCallback fun, Pointer callbackState, PointerByReference ret);

        int JsCreateFunction(Callback fun, Pointer callbackState, PointerByReference ret);

        int JsGetGlobalObject(PointerByReference p);

        int JsCreateObject(PointerByReference p);

        int JsCreatePropertyId(String name, long len, PointerByReference ret);

        int JsSetProperty(Pointer object, Pointer propertyId, Pointer fun, boolean useStrict);

        int JsDisposeRuntime(Pointer object);

        void printf(String format, Object... args);

        int substract(int a, int b);

        void printHello();

        interface FunctionCallback extends Callback {
            Pointer log(PointerByReference callee, boolean isConstructcall, PointerByReference arguments, short argumentCount, PointerByReference callbackState);
        }
    }


    public void start(boolean async) {
        if (async) {
            ThreadUtil.execAsync(() -> {
                start();
            });
        } else {
            start();
        }
    }

    public void await() {
        while (!fatal && instance == null) {
            ThreadUtil.sleep(100);
        }
    }

    public void destroy() {
        if (fatal) return;
        fatal = true;
        instance.JsDisposeRuntime(runtime);
    }

    private void start() {
        try {
            File file = new File(config.chakra, "ChakraCore");
            instance = (Dll) Native.load(file.getPath(), Dll.class);
        } finally {
            if (instance == null) {
                fatal = true;
                System.out.println("ChakraCore boot failed");
                throw new RuntimeException();
            }
        }
        runtime = createRuntime();
        context = createContext();
        setContent(context);

        //加载库
        loadLibraries();
//        initContext();
//        PointerByReference runtimePtr = new PointerByReference();
//        int state = instance.JsCreateRuntime(0, null, runtimePtr);
//        assertState(state);
        System.out.println("ChakraCore boot success");
    }

    private void assertState(int state) {
        if (state != 0) {
            throw new RuntimeException();
        }
    }

    private Pointer createRuntime() {
        PointerByReference runtimePtr = new PointerByReference();
        int state = instance.JsCreateRuntime(0, null, runtimePtr);
        if (state != 0) {
            System.out.println("ChakraCore: create runtime failed");
        }
        return runtimePtr.getValue();
    }

    private void loadLibraries() {
        //init runtime
        Map<String, Callback> map = new HashMap<>();
        map.put("log", new Callback() {
            public void log(PointerByReference callee, boolean isConstructcall, PointerByReference arguments, short argumentCount, PointerByReference callbackState) {
                Pointer[] ps = arguments.getPointer().getPointerArray(0, argumentCount);
                short i = -1;
                for (Pointer p : ps) {
                    i++;
                    if (i == 0) continue;
                    System.out.print(convertToString(p));
                    if (i != argumentCount - 1) {
                        System.out.print(",");
                    }
                }
                System.out.println("");
            }
        });
        defineGlobalObject("console", map);
    }

    public String eval(String str) {
        try {
//           initContext();
            WString code = new WString(str);
            PointerByReference ret = new PointerByReference();
            int state = instance.JsRunScript(code, 0, emptyString, ret);
            if (state != 0) {
                PointerByReference errorPtr = new PointerByReference();
                instance.JsGetAndClearException(errorPtr);
                String errStr = convertToString(errorPtr);
//                free(errorPtr);
                System.out.println("");
                System.out.println("ChakraCore: error-start");
                System.out.println(errStr);
                System.out.println("ChakraCore: error-end");
                System.out.println("");
            } else {
                String retStr = convertToString(ret);
//                free(ret.getPointer());
                return retStr;
            }
        } finally {
//            resetContext();
        }
        return "";
    }

//    private Pointer createContext(){
//        Pointer runtime = runtimes.get();
//        PointerByReference contextPtr = new PointerByReference();
//        instance.JsCreateContext(runtime, contextPtr);
//    }


    private Pointer createContext() {
        PointerByReference contextPtr = new PointerByReference();
        instance.JsCreateContext(runtime, contextPtr);
        return contextPtr.getValue();
    }

    private void setContent(Pointer context) {
        int state = instance.JsSetCurrentContext(context);
        if (state != 0) {
            System.out.println("ChakraCore: set context fialed");
        }
    }

    private void resetContext() {
        instance.JsSetCurrentContext(null);
    }

    private PointerByReference getGlobalObject() {
        PointerByReference p = new PointerByReference();
        instance.JsGetGlobalObject(p);
        return p;
    }

    private Pointer createPropertyId(String name) {
        PointerByReference ret = new PointerByReference();
        int state = instance.JsCreatePropertyId(name, name.length(), ret);
//        if (state != 0) {
//            return null;
//        }
        return ret.getValue();
//        return ret;
    }


    private String convertToString(PointerByReference p) {
        return convertToString(p.getValue());
    }

    private String convertToString(Pointer p) {
        WString[] resultWC = new WString[1];
        PointerByReference ret = new PointerByReference();
        int state = instance.JsConvertValueToString(p, ret);
        if (state != 0) {

        }
        state = instance.JsStringToPointer(ret.getValue(), resultWC, new long[1]);
        if (state != 0) {

        }
//        free(ret.getPointer());
        return resultWC[0].toString();
    }

    private void defineGlobalObject(String name, Map<String, Callback> callbackMap) {
        PointerByReference objectPtr = createObject();
        callbackMap.forEach((k, v) -> {
            setProperty(objectPtr.getValue(), k, createFunction(v));
        });
        PointerByReference globalPtr = getGlobalObject();
        setProperty(globalPtr.getValue(), name, objectPtr.getValue());
    }

    private PointerByReference createObject() {
        PointerByReference ret = new PointerByReference();
        instance.JsCreateObject(ret);
        return ret;
    }

    private void setProperty(Pointer object, String name, Pointer value) {
        if (value == null) {
            return;
        }
        instance.JsSetProperty(object, createPropertyId(name), value, true);
    }

    private Pointer createFunction(Callback callback) {
        PointerByReference funPtr = new PointerByReference();
        int state = instance.JsCreateFunction(callback, null, funPtr);
        if (state != 0) {
            System.out.println("ChakraCore: cannot create function");
        }
        return funPtr.getValue();
    }

//    private void free(Pointer p){
//        Native.free(Pointer.nativeValue(p));
//    }

//    private void free(PointerByReference p){
//        free(p.getValue());
//    }

}
