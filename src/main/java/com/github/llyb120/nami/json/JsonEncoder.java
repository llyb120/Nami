package com.github.llyb120.nami.json;

import com.github.llyb120.nami.util.Util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.Set;

public class JsonEncoder {
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
        } else if (obj instanceof Collection) {
            encodeCollection((Iterable) obj);
        } else if(obj.getClass().isArray()){
            encodeArray((Object[]) obj);
        }
        //基本类型
        else if (obj instanceof Boolean) {
            if ((Boolean) obj) {
                sb.append("true");
            } else {
                sb.append("false");
            }
        } else if (obj instanceof Integer || obj instanceof Double || obj instanceof Float || obj instanceof BigDecimal) {
//            sb.append("\"");
            sb.append(obj);
//            sb.append("\"");
        } else if(obj instanceof String){
            sb.append("\"");
            String str = (String) obj;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if(c == '\\'){
                    sb.append(c);
                    i++;
                    if(i < str.length()){
                        sb.append(str.charAt(i));
                    }
                    continue;
                }
                if(c == '"'){
                    sb.append("\\");
                }
                sb.append(c);
            }
            sb.append("\"");

        } else if(obj instanceof Long){
            sb.append("\"");
            sb.append(obj);
            sb.append("\"");
        } else if (obj instanceof Date) {
            sb.append("\"");
            sb.append(Util.formatDateTime((Date) obj));
            sb.append("\"");
        } else {
            encodeEntity(obj);
        }
    }

    private void encodeEntity(Object obj) {
//        FieldAccess fa = FieldAccess.get(obj.getClass());
//        MethodAccess ma = MethodAccess.get(obj.getClass());
        int i = 0;
        sb.append("{");
        for (Field field : obj.getClass().getDeclaredFields()) {

            sb.append("\"");
            sb.append(field.getName());
            sb.append("\"");
            sb.append(":");
            Object val = null; //.get(obj, i++);
            try {
                val = field.get(obj);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            encode(val);
            sb.append(",");
        }
//        String[] names = ma.getMethodNames();
//        for (i = 0; i < names.length; i++) {
        for (Method method : obj.getClass().getDeclaredMethods()) {
            String methodName = method.getName();
            if(methodName.length() <= 3){
                continue;
            }
            int idex = methodName.indexOf("get");
            if (idex == -1) {
                continue;
            }
            String key = methodName.substring(idex + 3, idex + 4).toLowerCase() + methodName.substring(idex + 4);
            Class[] types = method.getParameterTypes();
            Class retType = method.getReturnType();
            if (types.length == 0 && !"void".equals(retType.getName())) {
                sb.append("\"");
                sb.append(key);
                sb.append("\"");
                sb.append(":");
                try {
                    Object val = method.invoke(obj);
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

    private void encodeArray(Object[] objects){
        sb.append("[");
        for (Object o : objects) {
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

    private static String addSlashes(String s) {
//        s = s.replaceAll("\\\\", "\\\\\\\\");
//        s = s.replaceAll("\\n", "\\\\n");
//        s = s.replaceAll("\\r", "\\\\r");
////        s = s.replaceAll("\\00", "\\\\0");
//        s = s.replaceAll("'", "\\\\'");
//        s = s.replaceAll("\"", "\\\\\"");
        return s;
    }
}
