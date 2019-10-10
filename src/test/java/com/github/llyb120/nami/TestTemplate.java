package com.github.llyb120.nami;

import cn.hutool.core.io.FileUtil;
import com.github.llyb120.nami.template.MonkeyTmpl;
import com.github.llyb120.nami.util.Util;
import org.junit.Test;

import java.io.File;

import static com.github.llyb120.nami.json.Json.a;
import static com.github.llyb120.nami.json.Json.o;

public class TestTemplate {

    @Test
    public void test(){
        String str = Util.readString(new File("E:\\work\\Nami\\deprecated\\test.txt"));
        MonkeyTmpl parse = new MonkeyTmpl(str);
        String render = parse.render(
                o("keys", a(1,2,3,4),
                        "con1",1,
                        "topcon","fuck"
                )
        );
        FileUtil.writeUtf8String(render, new File("E:\\work\\Nami\\deprecated\\rendered.txt"));
        int d = 2;
    }
}
