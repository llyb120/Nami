package com.github.llyb120.nami.core;

import cn.hutool.core.io.IoUtil;
import cn.hutool.core.io.resource.ClassPathResource;
import cn.hutool.core.util.CharsetUtil;
import cn.hutool.core.util.StrUtil;
import com.github.llyb120.nami.json.Obj;
import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.core.resource.StringTemplateResourceLoader;
import org.beetl.core.tag.Tag;

import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.github.llyb120.nami.json.Json.o;

public class Macro {

    private static GroupTemplate gt = null;
    private static Pattern codePattern = Pattern.compile("//@code\\((.+?)\\)\\{([\\w\\W]+?)//@}");
    private static Pattern usePattern = Pattern.compile("//@use\\((.+?)\\)\\{([\\w\\W]+?)//@}");
    private static Map<String, Obj> macros = new ConcurrentHashMap<>();

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
            int a = 1;
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
        Matcher matcher = usePattern.matcher(str);
        StringBuffer sb = new StringBuffer();
        while(matcher.find()){
            List<String> args = StrUtil.splitTrim(matcher.group(1), ",");
            String code = matcher.group(2);
            String[] names = args.get(0).trim().split("\\.");
            loadMacro(names[0]);
            if(names.length != 2){
                matcher.appendReplacement(sb, matcher.group(0));
                continue;
            }
            Obj map = macros.get(names[0]);
            if (map == null) {
                matcher.appendReplacement(sb, matcher.group(0));
                continue;
            }
            if(!map.containsKey(names[1])){
                matcher.appendReplacement(sb, matcher.group(0));
                continue;
            }
            matcher.appendReplacement(sb, map.s(names[1]));
        }
        matcher.appendTail(sb);
        return sb.toString();
    }

    public static String render(String template){
        Template tmpl = gt.getTemplate(template);
        tmpl.binding("a", "cubucu");
        return tmpl.render();
    }

    public static void loadMacro(String name) {
        //加载模板
        ClassPathResource resource = new ClassPathResource("macro/" + name + ".java");
        try (
            Reader reader = resource.getReader(CharsetUtil.charset(CharsetUtil.UTF_8));
        ) {
            Obj map = o();
            String str = IoUtil.read(reader);
//            var ptr = 0;
//            var len = str.length();
//            var tagName = "";
//            var bodyStart = -1;

            Matcher matcher = codePattern.matcher(str);
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

            if(!map.isEmpty()){
                macros.put(name, map);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
