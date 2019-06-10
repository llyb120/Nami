package com.beeasy.hzlink;

import com.github.llyb120.nami.core.Nami;

public class App {

    public static void main(String[] args) {
        var conf = "./config.json";
        for(var i = 0; i < args.length; i++){
            if(args[i].equals("-c")){
                conf = args[++i];
            }
        }
        Nami.start(conf);
    }

}

