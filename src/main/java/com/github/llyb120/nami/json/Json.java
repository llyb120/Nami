package com.github.llyb120.nami.json;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.CharUtil;
import com.esotericsoftware.reflectasm.ConstructorAccess;
import com.esotericsoftware.reflectasm.FieldAccess;
import com.esotericsoftware.reflectasm.MethodAccess;

import java.io.Serializable;
import java.lang.invoke.SerializedLambda;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;

public class Json {

    public enum ValidateType {
        notnull,
        notempty,
        notblank;
    }

    public enum ValueType {
        md5;
    }


    public static interface Property<T, R> extends Function<T, R>, Serializable {
    }

    public static String getFunctionKey(Function function) {
        String name = getFunctionName(function);
        if (name.length() > 1) {
            return name.substring(0, 1).toLowerCase() + name.substring(1);
        }
        return name;
    }

    public static String getFunctionName(Function function) {
        try {
            Method declaredMethod = function.getClass().getDeclaredMethod("writeReplace");
            declaredMethod.setAccessible(Boolean.TRUE);
            SerializedLambda serializedLambda = (SerializedLambda) declaredMethod.invoke(function);
            String method = serializedLambda.getImplMethodName();
            String attr = null;
            if (method.startsWith("get")) {
                attr = method.substring(3);
            } else {
                attr = method.substring(2);
            }
            return attr;

        } catch (ReflectiveOperationException var6) {
            throw new RuntimeException(var6);
        }
    }

    public static Obj o(Object... objects) {
        Obj object = new Obj();
        for (short i = 0; i < objects.length; i += 2) {
            object.put((String) objects[i], objects[i + 1]);
        }
        return object;
    }

    public static Arr a(Object... objects) {
        Arr array = new Arr();
        for (Object object : objects) {
            array.add(object);
        }
        return array;
    }


    public static Arr tree(Collection<Obj> list, String parentKey, String childKey) {
        Obj map = o();
        for (Obj object : list) {
            String key = object.s(childKey);
            if (key == null) {
                continue;
            }
            map.put(key, object);
//            object.put("children", a());
        }
        Arr ret = a();
        for (Obj object : list) {
            Obj par = map.o(object.s(parentKey));
            if (par == null) {
                ret.add(object);
                continue;
            }
            Arr child = par.a("children");
            if (child == null) {
                child = a();
                par.put("children", child);
            }
            child.add(object);
        }
        return ret;
    }


    public static String stringify(Object obj) {
        return new JsonEncoder().stringify(obj);
    }

    public static <T> T parse(String str) {
//        var s = new com.alibaba.fastjson.TypeReference<List<List>>(){};
//        var t = new TypeReference<List<List>>(){};
        return (T) new JsonParser(str).parse();
    }

    public static <T> T parse(byte[] bs) {
        return parse(new String(bs));
    }

    public static Obj toObj(Object object){
       return cast(object, Obj.class);
    }

    public static Arr toArr(Object object){
        return cast(object, Arr.class);
    }

//    public static <T> T parse(String str, Class<T> clz){
//    }


//    public static <T> T parse(String str){
//        Arr arr = Json.parse("fuck");
//    }


    /******************************************************/
    /**
     * parser
     */

    private static class JsonParser {
        private String str;
        private int ptr = 0;
        private int len = 0;
//        private StringBuilder sb = new StringBuilder();

        private enum JsonTokenType {
            LEFT_LARGE_BLOCK,
            RIGHT_LARGE_BLOCK,
            LEFT_MIDDLE_BLOCK,
            RIGHT_MIDDLE_BLOCK,
            COMMA,
            COLON,
            STRING,
            BOOL,
            NUMBER,
            NULL;
        }

        private static class JsonToken {
            public JsonTokenType type;
            public String value;

            public JsonToken(JsonTokenType type, String value) {
                this.type = type;
                this.value = value;
            }

            @Override
            public String toString() {
                return type.name() + " : " + value;
            }
        }

        public JsonParser(String str) {
            this.str = str;
            this.len = str.length();
        }

        private Object parse() {
            JsonToken token = readToken();
            if (token == null) {
                return null;
            }
            if (token.type == JsonTokenType.LEFT_MIDDLE_BLOCK) {
                return parseArr();
            } else if (token.type == JsonTokenType.LEFT_LARGE_BLOCK) {
                return parseObj();
            } else {
                return token.value;
            }
        }

        private Obj parseObj() {
            Obj obj = o();
            JsonToken token;
            String key = null;
            loop:
            while ((token = readToken()) != null) {
                //skip colon
                switch (token.type) {
                    case LEFT_LARGE_BLOCK:
                        obj.put(key, parseObj());
                        key = null;
                        break;

                    case COLON:
                    case COMMA:
                        break;

                    case RIGHT_LARGE_BLOCK:
                        break loop;

                    case LEFT_MIDDLE_BLOCK:
                        obj.put(key, parseArr());
                        key = null;
                        break;

                    case RIGHT_MIDDLE_BLOCK:
                        throw new RuntimeException();

                    case STRING:
                        if (key == null) {
                            key = token.value;
                        } else {
                            obj.put(key, token.value);
                            key = null;
                        }
                        break;

                    default:
                        if (key == null) {
                            throw new RuntimeException();
                        }
                        obj.put(key, parseValue(token));
                        key = null;
                        break;
                }
            }
            return obj;
        }

        private Object parseValue(JsonToken token) {
            if (token.type == JsonTokenType.NUMBER) {
                return new BigDecimal(token.value);
            } else if (token.type == JsonTokenType.BOOL) {
                return Boolean.parseBoolean(token.value);
            } else if (token.type == JsonTokenType.STRING) {
                return token.value;
            } else {
                return null;
            }
        }

        private Arr parseArr() {
            Arr arr = a();
            JsonToken token;
            loop:
            while ((token = readToken()) != null) {
                switch (token.type) {
                    case LEFT_MIDDLE_BLOCK:
                        arr.add(parseArr());
                        break;

                    case RIGHT_MIDDLE_BLOCK:
                        break loop;

                    case LEFT_LARGE_BLOCK:
                        arr.add(parseObj());
                        break;

                    case RIGHT_LARGE_BLOCK:
                        throw new RuntimeException();

                    case COLON:
                    case COMMA:
                        break;

                    default:
                        arr.add(parseValue(token));
                        break;
                }

            }
            return arr;
        }

        private void assertToken(JsonToken token, JsonTokenType... types) {
            for (JsonTokenType type : types) {
                if (token.type == type) {
                    return;
                }
            }
            throw new RuntimeException();
        }

        private JsonToken readToken() {
            boolean isBlank = false;
            boolean isStr = false;
            int start = -1;
            while (ptr < len) {
                char ch = str.charAt(ptr);
                isBlank = CharUtil.isBlankChar(ch);
                boolean isStrStart = (ch == '"');
                if (start > -1) {
                    if (isStrStart && isStr) {
                        return new JsonToken(JsonTokenType.STRING, str.substring(start, ptr++));
                    } else if (!isStr && (ch == '{' || ch == '}' || ch == '[' || ch == ']' || ch == ':' || ch == ',' || isBlank)) {
                        //强行中断
                        String token = str.substring(start, ptr);
                        if (isBlank) {
                            ptr++;
                        }
                        if (token.equalsIgnoreCase("true") || token.equalsIgnoreCase("false")) {
                            return new JsonToken(JsonTokenType.BOOL, token);
                        }
                        if (token.equalsIgnoreCase("null")) {
                            return new JsonToken(JsonTokenType.NULL, token);
                        }
//                        if(isStr){
//                            return new JsonToken(JsonTokenType.STRING, token);
//                        }
                        return new JsonToken(JsonTokenType.NUMBER, token);
                    } else {
                        //不是空格的情况下才往下走（空格立刻结束）
                        ptr++;
                        continue;
                    }
                } else {
                    if (ch == ':') {
                        ptr++;
                        return new JsonToken(JsonTokenType.COLON, ":");
                    }
                    if (ch == ',') {
                        ptr++;
                        return new JsonToken(JsonTokenType.COMMA, ",");
                    }
                    if (ch == '[') {
                        ptr++;
                        return new JsonToken(JsonTokenType.LEFT_MIDDLE_BLOCK, "[");
                    }
                    if (ch == ']') {
                        ptr++;
                        return new JsonToken(JsonTokenType.RIGHT_MIDDLE_BLOCK, "]");
                    }
                    if (ch == '{') {
                        ptr++;
                        return new JsonToken(JsonTokenType.LEFT_LARGE_BLOCK, "{");
                    }
                    if (ch == '}') {
                        ptr++;
                        return new JsonToken(JsonTokenType.RIGHT_LARGE_BLOCK, "}");
                    }
                    if (isStrStart) {
                        isStr = true;
                        start = ptr + 1;
                    } else if (!isBlank) {
                        start = ptr;
                    }
                }
                ptr++;
            }
            return null;
        }


    }

    /******************************************************/


    /******************************************************/
    /**
     * encoder
     **/
    private static class JsonEncoder {
        StringBuilder sb = new StringBuilder();

        public String stringify(Object obj) {
            sb.setLength(0);
            encode(obj);
            return sb.toString();
        }

        private void encode(Object obj) {
            if (obj == null) {
                sb.append("null");
                return;
            }
            if (obj instanceof Map) {
                encodeMap((Map) obj);
            } else if (obj instanceof Iterable) {
                encodeCollection((Iterable) obj);
            }
            //基本类型
            else if (obj instanceof Boolean) {
                if ((Boolean) obj) {
                    sb.append("true");
                } else {
                    sb.append("false");
                }
            } else if (obj instanceof Integer || obj instanceof Double || obj instanceof Float || obj instanceof String || obj instanceof BigDecimal) {
                sb.append("\"");
                sb.append(obj);
                sb.append("\"");
            } else if (obj instanceof Date) {
                sb.append("\"");
                sb.append(DateUtil.formatDateTime((Date) obj));
                sb.append("\"");
            } else {
                encodeEntity(obj);
            }
        }

        private void encodeEntity(Object obj) {
            FieldAccess fa = FieldAccess.get(obj.getClass());
            MethodAccess ma = MethodAccess.get(obj.getClass());
            int i = 0;
            sb.append("{");
            for (String fieldName : fa.getFieldNames()) {
                sb.append("\"");
                sb.append(fieldName);
                sb.append("\"");
                sb.append(":");
                Object val = fa.get(obj, i++);
                encode(val);
                sb.append(",");
            }
            i = 0;
            for (String methodName : ma.getMethodNames()) {
                int idex = methodName.indexOf("get");
                if (idex == -1) {
                    continue;
                }
                String key = methodName.substring(idex + 3, idex + 4).toLowerCase() + methodName.substring(idex + 4);
                Class[] types = ma.getParameterTypes()[i];
                Class retType = ma.getReturnTypes()[i];
                if (types.length == 0 && !"void".equals(retType.getName())) {
                    sb.append("\"");
                    sb.append(key);
                    sb.append("\"");
                    sb.append(":");
                    try {
                        Object val = ma.invoke(obj, i++);
                        encode(val);
                    } catch (Exception e) {
                        encode(null);
                    }
                    sb.append(",");
                }
            }
            deleteLastComma();
            sb.append("}");
        }


        private void encodeCollection(Iterable iterable) {
            sb.append("[");
            for (Object o : iterable) {
                encode(o);
                sb.append(",");
            }
            deleteLastComma();
            sb.append("]");
        }

        private void encodeMap(Map map) {
            sb.append("{");
            Set eset = map.entrySet();
            for (Object o : eset) {
                Map.Entry entry = (Map.Entry) o;
                Object key = entry.getKey();
                if (key == null) {
                    continue;
                }
                sb.append("\"");
                if (key instanceof String) {
                    sb.append(key);
                } else {
                    sb.append(String.valueOf(key));
                }
                sb.append("\"");
                sb.append(":");
                Object val = entry.getValue();
                encode(val);
                sb.append(",");
            }
            deleteLastComma();
            sb.append("}");
        }

        private void deleteLastComma() {
            if (sb.charAt(sb.length() - 1) == ',') {
                sb.deleteCharAt(sb.length() - 1);
            }
        }

    }

    /******************************************************/


    static <T> T newInstance(Class<T> clz) {
        ConstructorAccess<T> ca = ConstructorAccess.get(clz);
        return ca.newInstance();
    }

    static <T> T cast(Object source, Class<T> clz) {
        if (source == null) {
            return null;
        }
        Class<?> type = source.getClass();
        //基本类型
        if (clz == String.class) {
            if (source instanceof String) {
                return (T) source;
            } else {
                return (T) String.valueOf(source);
            }
        }
        if (clz == Boolean.class) {
            if (source instanceof Boolean) {
                return (T) source;
            } else {
                //尝试本身转换
                try {
                    return (T) new Boolean(String.valueOf(source));
                } catch (Exception e) {
                }
                //尝试使用数字
                try {
                    BigDecimal decimal = new BigDecimal(String.valueOf(source));
                    return (T) new Boolean(decimal.intValue() != 0);
                } catch (Exception e) {
                }
                //啥都没有，那就false吧
                return (T) new Boolean(false);
            }
        }
        if (clz == Integer.class || clz == int.class) {
            if (source instanceof Integer) {
                return (T) source;
            } else {
                return (T) (Integer) Integer.parseInt(String.valueOf(source));
            }
        }
        //可以返回自身
        if (clz.isAssignableFrom(source.getClass())) {
            return (T) source;
        }
        //目标为List
        if (List.class.isAssignableFrom(clz)) {
            if (List.class == clz) {
                clz = (Class<T>) ArrayList.class;
            }
            List list = (List) Json.newInstance(clz);
            if(type.isArray()){
                for (int i = 0; i < Array.getLength(source); i++) {
                    list.add(Array.get(source, i));
                }
            } else {
                ((List) list).addAll((Collection) source);
            }
            return (T) list;
        }
        //目标为set类型
        if (Set.class.isAssignableFrom(clz)) {
            if (Set.class == clz) {
                clz = (Class<T>) HashSet.class;
            }
            Set list = (Set) Json.newInstance(clz);
            if(type.isArray()){
                for (int i = 0; i < Array.getLength(source); i++) {
                    list.add(Array.get(source, i));
                }
            } else {
                list.addAll((Collection) source);
            }
            return (T) list;
        }
        if(clz.isArray()){
            Class<?> arrType = clz.getComponentType();
            Collection collection = (Collection) source;
            Object narr = Array.newInstance(arrType, (collection.size()));
            int i = 0;
            for (Object o : collection) {
                Array.set(narr, i, Json.cast(o, arrType));
                i++;
            }
            return (T) narr;
        }
        //目标为map类型
        if (Map.class.isAssignableFrom(clz)) {
            if (Map.class == clz) {
                clz = (Class<T>) HashMap.class;
            }
            Map map = (Map) Json.newInstance(clz);
            if (source instanceof Map) {
                ((Map) map).putAll((Map) source);
            } else {
                map.putAll(BeanUtil.beanToMap(source));
            }
            return (T) map;
        }
        //把目标当bean转换
        //todo: 使用reflectasm
        T ret = (T) BeanUtil.toBean(source, clz);
        if (ret == null) {
            throw new RuntimeException();
        }
        return ret;
    }
}
