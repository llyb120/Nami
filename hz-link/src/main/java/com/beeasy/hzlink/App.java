package com.beeasy.hzlink;

import com.beeasy.hzlink.model.TUser;
import com.github.llyb120.nami.core.Context;
import com.github.llyb120.nami.core.Nami;
import com.github.llyb120.nami.core.Param;

import java.lang.reflect.Parameter;

public class App {

    public static void main(String[] args) {

        Param.AddRule((context, parameter) -> parameter.getName().startsWith("my_"), (context, parameter, defaultAction) -> {
            if(parameter.getType().equals(TUser.class)){
                context.query.put("id", 1);
            }
            return defaultAction.around(context, parameter, null);
        });


        var conf = "./config.json";
        for(var i = 0; i < args.length; i++){
            if(args[i].equals("-c")){
                conf = args[++i];
            }
        }
        Nami.start(conf);
    }

}

