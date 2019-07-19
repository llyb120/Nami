package com.github.llyb120.nami.server;

import cn.hutool.core.util.StrUtil;
import com.github.llyb120.nami.json.Json;

import java.util.*;

public interface Vars{
    Json $get = new Json(true);
    Json $post = new Json(true);
    Json $request = new Json(true);
}
