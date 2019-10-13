package com.github.llyb120.test;

import com.github.llyb120.nami.bean.OnCreate;
import com.github.llyb120.nami.bean.OnDestroy;
import com.github.llyb120.nami.bean.OnVersion;

import static com.github.llyb120.nami.log.Log.info;

@OnVersion(name = "dev", version = "1.0")
@com.github.llyb120.nami.bean.Server(packages = "com.github.llyb120", port = 8084)
public class Server {

    @OnVersion(name = "dev", version = "1.0")
    @OnCreate
    public void start(){
        info("我是调试环境");
    }

    @OnVersion(name = "prod", version = "2.0")
    @OnCreate
    public void start2(){
        info("我是生产环境");
    }

    @OnDestroy
    public void end(){

    }
}
