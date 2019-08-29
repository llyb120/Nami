package com.github.llyb120.nami;

import com.github.llyb120.nami.core.Nami;
import com.github.llyb120.nami.json.Obj;
import org.junit.Test;

import static com.github.llyb120.nami.func.Function.eval;
import static com.github.llyb120.nami.json.Json.o;


public class TestFunc {

    @Test
    public void test() throws Exception {
        Nami.dev();
        int a = eval("return 1");
        eval("System.out.println(123321)");
        System.out.println(a);
    }


    @Test
    public void t2(){
        Object a = t3();
        int d = 2;
    }

    public Object t3(){
        Obj obj = o();
        try{
            return obj;
        } catch (
           Exception e
        ){

        } finally {
        }
        return null;
    }

}
