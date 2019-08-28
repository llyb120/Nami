package com.github.llyb120.nami;

import com.github.llyb120.nami.core.Nami;
import com.github.llyb120.nami.func.Function;
import org.junit.Test;


public class TestFunc {

    @Test
    public void test() throws Exception {
        Nami.dev();
        Function.eval("System.out.println(\"fuck\")");
    }
}
