package com.beeasy.easyshop;

import cn.hutool.core.thread.ThreadUtil;
import com.beeasy.web.core.ChakraCore;
import com.beeasy.web.core.EasyShop;
import com.sun.jna.*;
import com.sun.jna.ptr.NativeLongByReference;
import com.sun.jna.ptr.PointerByReference;
import jdk.nashorn.internal.ir.FunctionCall;

import java.nio.charset.StandardCharsets;

public class App {




//    private static void createFun() {
//        PointerByReference namePtr = new PointerByReference();
//        Dll.instance.JsCreateString("log", 3, namePtr);
//
//        PointerByReference ret = new PointerByReference();
//        int state = Dll.instance.JsCreateNamedFunction(namePtr.getValue(), new Dll.FunctionCallback() {
//            @Override
//            public void log(PointerByReference callee, boolean isConstructcall, PointerByReference argument, short argumentCount, PointerByReference callbackState) {
//                System.out.println("rilegou");
//            }
//        }, null, ret);
//
//        PointerByReference global = getGlobalObject();
//        PointerByReference propertyId = createPropertyId("log");
//        Dll.instance.JsSetProperty(global.getValue(), propertyId.getValue(), ret.getValue(), true);
//        int c = 1;
//    }
//
//
//    private static String convertToString(PointerByReference p) {
//        WString[] resultWC = new WString[1];
//        PointerByReference ret = new PointerByReference();
//        int state = Dll.instance.JsConvertValueToString(p.getValue(), ret);
//        state = Dll.instance.JsStringToPointer(ret.getValue(), resultWC, new NativeLongByReference());
//        return resultWC[0].toString();
//    }



    public static void main(String[] args) {
//
//        Pointer runtime = new Pointer(0);
//        Pointer context = new Pointer(0);
//        Pointer result = new Pointer(0);
//
//        WString wString = new WString("(() => {log(1); return \"123003民法典33hhh\"})();");
//
//        PointerByReference pp = new PointerByReference(runtime);
//
//        int a = Dll.instance.JsCreateRuntime(0, null, pp);
//        runtime = pp.getValue();
//        PointerByReference pp2 = new PointerByReference(context);
//        a = Dll.instance.JsCreateContext(runtime, pp2);
//        context = pp2.getValue();
//        a = Dll.instance.JsSetCurrentContext(context);
//
//        createFun();
//
//        PointerByReference pp3 = new PointerByReference(result);
//        a = Dll.instance.JsRunScript(wString, 0, new WString(""), pp3);
//
//        boolean[] b = new boolean[1];
//        a = Dll.instance.JsHasException(b);
//        if (b[0]) {
//            PointerByReference p = new PointerByReference();
//            Dll.instance.JsGetAndClearException(p);
//            String str = convertToString(p);
//            int c = 1;
//            System.out.println(str);
////            JsGetAndClearException
//        }


//        result = pp3.getValue();
//        PointerByReference pp4 = new PointerByReference();
//        a = Dll.instance.JsConvertValueToString(result, pp4);

//        System.out.println(convertToString(pp3));
//        Callback callback = new Callback() {
//
//        };

        new Thread(() -> {
            ThreadUtil.sleep(500);
            ChakraCore chakra = new ChakraCore(false);
            String str = chakra.eval("(() => { console.log(1,2,3); var a = [1,2,3]; a = a.map(i => ++i); return a.join(',') })()");
            System.out.println(str);
        }).start();

        //注册控制器
        EasyShop.start();


    }


}
