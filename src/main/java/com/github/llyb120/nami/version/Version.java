package com.github.llyb120.nami.version;

import cn.hutool.core.util.ArrayUtil;
import cn.hutool.core.util.StrUtil;
import com.github.llyb120.nami.func.Expression;
import com.github.llyb120.nami.func.NoReturnFunction;

import static com.github.llyb120.nami.core.Config.config;

public class Version {

    public static boolean gte(int[] va, int[] vb){
        if(va.length == 0 && vb.length == 0){
            return true;
        }
        int max = Math.max(va.length, vb.length);
        for (int i = 0; i < max; i++){
            int a,b;
            if(va.length <= i){
                a = 0;
            } else {
                a = va[i];
            }
            if(vb.length <= i){
                b = 0;
            } else {
                b = vb[i];
            }
            if(a == b){
                continue;
            }
            return a >= b;
        }
        return false;
    }

    public static boolean eq(int[] va, int[] vb){
        return ArrayUtil.join(va, ",").equals(ArrayUtil.join(vb, ",."));
    }

    public static boolean lte(int[] va, int[] vb){
        return !gte(va, vb) || eq(va, vb);
    }

    public static boolean match(String vname, String version){
        if(!StrUtil.equalsIgnoreCase(config.version.name, vname)){
            return false;
        }
        int[] vs = StrUtil.splitToInt(version, ".");
        if(!gte(config.version.no, vs)){
            return false;
        }
        return true;
    }

    public static Object doIfOnVersion(String vname, String version, Expression function) throws Exception {
        if(!match(vname,version)){
            return null;
        }
        return function.call();
    }

    public static void doIfOnVersion(String vname, String version, NoReturnFunction function) throws Exception {
        if(!match(vname,version)){
            return;
        }
        function.call();
    }
}
