package com.github.llyb120.nami.server;

import cn.hutool.core.util.StrUtil;
import com.github.llyb120.nami.json.Obj;

import java.util.*;

public interface Vars{
    Obj $get = new Obj();
    Obj $post = new Obj();
    Obj $request = new Obj();
    
}
