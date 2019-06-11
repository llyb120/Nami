package com.github.llyb120.nami.core;

import cn.hutool.core.io.IoUtil;
import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.core.util.CharsetUtil;
import cn.hutool.core.util.StrUtil;
import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Tag;
import org.beetl.core.Template;
import cn.hutool.core.io.resource.ClassPathResource;
import org.beetl.core.resource.StringTemplateResourceLoader;


import java.io.IOException;
import java.io.Reader;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

import static com.github.llyb120.nami.core.Json.a;
import static com.github.llyb120.nami.core.Json.o;

public class Macro {

    private static GroupTemplate gt = null;
    private static Pattern codePattern = Pattern.compile("//@code\\((.+?)\\)\\{([\\w\\W]+?)//@}");
    private static Pattern usePattern = Pattern.compile("//@use\\((.+?)\\)\\{([\\w\\W]+?)//@}");
    private static Map<String,Obj> macros = new ConcurrentHashMap<>();

    static {
        StringTemplateResourceLoader resourceLoader = new StringTemplateResourceLoader();
        Configuration cfg = null;
        try {
            cfg = Configuration.defaultConfiguration();
        } catch (IOException e) {
            e.printStackTrace();
        }
        cfg.setStatementStart("//@");
        cfg.setStatementEnd(null);
        cfg.setPlaceholderStart("_{");
        gt = new GroupTemplate(resourceLoader, cfg);
        gt.registerTag("code", CodeTag.class);
    }

    public static class CodeTag extends Tag {

        @Override
        public void render() {
            var a = 1;
        }

    }

    private static char readNextChar(String str, int ptr) {
        return str.charAt(ptr + 1);
    }

    private static int readUntil(String str, int ptr, char limit) {
        do {
            ptr++;
        } while (ptr < str.length() && str.charAt(ptr) != limit);
        return ptr;
    }

    public static String prepareRender(String str){
        var matcher = usePattern.matcher(str);
        var sb = new StringBuilder();
        while(matcher.find()){
            var args = StrUtil.splitTrim(matcher.group(1), ",");
            var code = matcher.group(2);
            var names = args.get(0).trim().split("\\.");
            loadMacro(names[0]);
            if(names.length != 2){
                matcher.appendReplacement(sb, matcher.group(0));
                continue;
            }
            var map = macros.get(names[0]);
            if (map == null) {
                matcher.appendReplacement(sb, matcher.group(0));
                continue;
            }
            if(!map.containsKey(names[1])){
                matcher.appendReplacement(sb, matcher.group(0));
                continue;
            }
            matcher.appendReplacement(sb, map.getStr(names[1]));
        }
        matcher.appendTail(sb);
        return sb.toString();
    }

    public static String render(String template){
        var tmpl = gt.getTemplate(template);
        tmpl.binding("a", "cubucu");
        return tmpl.render();
    }

    public static void loadMacro(String name) {
        //加载模板
        var resource = new ClassPathResource("macro/" + name + ".java");
        try (
            Reader reader = resource.getReader(CharsetUtil.charset(CharsetUtil.UTF_8));
        ) {
            var map = o();
            var str = IoUtil.read(reader);
//            var ptr = 0;
//            var len = str.length();
//            var tagName = "";
//            var bodyStart = -1;

            var matcher = codePattern.matcher(str);
            while(matcher.find()){
                map.put(matcher.group(1).trim(), matcher.group(2));
            }

//            while (ptr < len) {
//                var c = str.charAt(ptr);
//                if (c == '/') {
//                    var slice = str.substring(ptr, ptr + 8);
//                    if (slice.equals("//@code(")) {
//                        ptr = ptr + 8;
//                        var endptr = readUntil(str, ptr, ')');
//                        tagName = str.substring(ptr, endptr).trim();
//                        endptr = readUntil(str, ptr, '{');
//                        bodyStart = endptr + 1;
//                    } else {
//                        slice = str.substring(ptr, ptr + 4);
//                        if(slice.equals("//@}")){
//                            map.put(tagName, str.substring(bodyStart, ptr));
//                        }
//                    }
//                }
//                ptr++;
//            }

            if(map.isNotEmpty()){
                macros.put(name, map);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
