package com.beeasy.web.core;

import cn.hutool.core.io.IoUtil;
import cn.hutool.core.thread.ThreadUtil;
import com.sun.jna.*;
import com.sun.jna.Native;
import com.sun.jna.ptr.NativeLongByReference;
import com.sun.jna.ptr.PointerByReference;

import static com.beeasy.web.core.Config.config;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
public class ChakraCore {

    public ChakraCore(boolean async) {
        start(async);
    }

    /**
     * 运行时，每个线程一个
     */
    private Pointer runtime;
    private Pointer context;
//    private Pointer module;

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
        int JsInitializeModuleRecord(PointerByReference module, Pointer p, PointerByReference ret);
        int JsSetModuleHostInfo(Pointer module, int code, Pointer hostInfo);

        int JsSetCurrentContext(Pointer context);

        int JsRunScript(WString a, int b, WString c, PointerByReference d);
        int JsParseScript(WString script, int contextIdex, WString url, PointerByReference ret);
        int JsParseModuleSource(Pointer module, int ctxId, byte[] script, int length, int flag, PointerByReference ret);

        int JsRun(Pointer source, int contextIdex, Pointer url, int attr, PointerByReference ret);

        int JsConvertValueToString(Pointer a, PointerByReference b);

        int JsStringToPointer(Pointer value, WString[] ret, long[] len);

        int JsHasException(boolean[] a);

        int JsGetAndClearException(PointerByReference a);

        int JsCreateString(String content, long len, PointerByReference ret);

        int JsCreateNamedFunction(Pointer name, FunctionCallback fun, Pointer callbackState, PointerByReference ret);

        int JsCreateFunction(Callback fun, Pointer callbackState, PointerByReference ret);

        int JsGetGlobalObject(PointerByReference p);

        int JsCreateObject(PointerByReference p);
        int JsCreateObject(String str, long len, PointerByReference ret);

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
            File file = new File(config.ext.getString("chakra"), "ChakraCore");
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

//        PointerByReference modulePtr = new PointerByReference();
//        int state = instance.JsInitializeModuleRecord(null, createString("1.js").getValue(), modulePtr);
//        module = modulePtr.getValue();
//        instance.JsSetModuleHostInfo(module, 0x2, createString("1.js").getValue());

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
        map.put("_require", new Callback() {
            public Pointer _require(PointerByReference callee, boolean isConstructcall, PointerByReference arguments, short argumentCount, PointerByReference callbackState) {
                Pointer[] ps = arguments.getPointer().getPointerArray(0, argumentCount);
                if(ps.length < 3){
                    System.out.println("");
                    return null;
                }
                Pointer par = ps[1];
                Pointer file = ps[2];
                String parStr = convertToString(par);
                String fileStr = convertToString(file);
                Pointer exports = eval(new File(parStr, fileStr));
                return exports;

//                short i = -1;
//                for (Pointer p : ps) {
//                    i++;
//                    if (i == 0) continue;
//                    System.out.print(convertToString(p));
//                    if (i != argumentCount - 1) {
//                        System.out.print(",");
//                    }
//                }
//                System.out.println("");
            }
        });
        defineGlobalObject("console", map);
    }

    private void parse(String str){
    }

    public Pointer eval(File file){
        String str = "";
        try(
            FileInputStream fis = new FileInputStream(file);
            ){
            str = IoUtil.read(fis, StandardCharsets.UTF_8);

        } catch (IOException e) {
            e.printStackTrace();
        }
        str = String.format("(function($$path,exports){ %s; return exports; })('%s', {})", str, file.getParent().replaceAll("\\\\", "/"));
//        Pointer fun = eval("(function($$path,exports){ %s; return exports; })");
        return eval(str, file.getPath());
//        WString code = new WString(str);
//        PointerByReference ret = new PointerByReference();
//        int state = instance.JsParseScript(code, 0, new WString(file.getParent()), ret);
//
//        instance.JsSetModuleHostInfo(module, 0x6, createString("1.js").getValue());
//        PointerByReference ret2 = new PointerByReference();
////        int state = instance.JsParseModuleSource(module, 0, str.getBytes(), str.getBytes().length, 1, ret2);
////        int state = instance.JsRunScript(code, 0, new WString(file.getParent()), ret);
//        PointerByReference errorPtr = new PointerByReference();
//        instance.JsGetAndClearException(errorPtr);
//        String errStr = convertToString(errorPtr);
////                free(errorPtr);
//        System.out.println("");
//        System.out.println("ChakraCore: error-start");
//        System.out.println(errStr);
//        System.out.println("ChakraCore: error-end");
//        System.out.println("");
////        PointerByReference strPtr = createString(file.getParent());
////        ret = new PointerByReference();
////        state = instance.JsRun(ret.getValue(), 0, strPtr.getValue(),0 , ret);
//        return "";
    }


    public Pointer eval(String str, String path){
            WString code = new WString(str);
            PointerByReference ret = new PointerByReference();
            int state = instance.JsRunScript(code, 0, new WString(path), ret);
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
                return ret.getValue();
//                String retStr = convertToString(ret);
//                free(ret.getPointer());
//                return retStr;
            }
        return null;
//        return "";
    }

    public Pointer eval(String str) {
        return eval(str ,"");
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

    private PointerByReference createString(String str){
        PointerByReference ret = new PointerByReference();
        instance.JsCreateString(str, str.length(), ret);
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

    private void debug(Pointer p){
        PointerByReference global = getGlobalObject();

    }


//    private void free(Pointer p){
//        Native.free(Pointer.nativeValue(p));
//    }

//    private void free(PointerByReference p){
//        free(p.getValue());
//    }

}
