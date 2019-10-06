package com.github.llyb120.nami.json;

import com.github.llyb120.nami.util.Util;
import org.bson.Document;

import java.io.Serializable;
import java.lang.reflect.*;
import java.math.BigDecimal;
import java.util.*;

import static com.github.llyb120.nami.core.DBService.fSql;

public abstract class Json<T> implements Serializable {
    public static Undefined undefined = new Undefined();
//    private boolean parallel = false;
//    private ThreadLocal<Holder> local;
//    private Holder holder;

//    public Json(){
//        this(false);
//    }

//    public Json(T[] arr){
//        this(false);
//        holder.list.addAll(Arrays.asList(arr));
//    }
//
//    public Json(boolean parallel){
//        this.parallel = parallel;
//        if(parallel){
//            local = new ThreadLocal<Holder>(){
//                @Override
//                protected Holder initialValue() {
//                    return new Holder();
//                }
//            };
//        } else {
//            holder = new Holder();
//        }
//    }
//
//    public Holder holder() {
//        if(parallel){
//            return local.get();
//        } else {
//            return holder;
//        }
//    }
//
//    public void holder(Holder holder) {
//        if(parallel){
//            local.set(holder);
//        } else {
//            this.holder = holder;
//        }
//    }

    @Override
    public String toString() {
        return stringify(this);
    }

    public Json<T> to(String tableName) {
        fSql.insert(tableName, this);
        return null;
    }


    class Holder {
        public List<Object> list;
        public Map<String, Object> map;
    }


//    Map<Object,Holder> Pool = new WeakHashtable();


//    public Holder holder(){
//        Holder holder = Pool.get(this);
//        if (holder == null) {
//            holder = new Holder() ;
//            Pool.put(this, holder);
//        }
//        return holder;
//    }
//
//    public void holder(Holder holder){
//        Pool.put(this, holder);
//    }

//    public List<Object> list(){
//        Holder holder = holder();
//        if(holder.list != null){
//            return holder.list;
//        }
//        else if(holder.map == null){
//            holder.list = new ArrayList<>();
//            return holder.list;
//        }
//        return null;
//    }
//
//    public Map<String, Object> map(){
//        Holder holder = holder();
//        if(holder.map == null){
//            holder.map = new LinkedHashMap<>();
//        }
//        return holder.map;
//    }
//
//    public boolean isList(){
//        return holder().list != null;
//    }
//
//    public boolean isMap(){
//        return holder().map != null;
//    }
//
//    public boolean add(T arg0){
//        return list().add(arg0);
//    }
//
//    public boolean addAll(Collection arg0){
//        return list().addAll(arg0);
//    }

//    public void putAll(Map<? extends String,? extends T> arg0){
//        map().putAll(arg0);
//    }


//    public Object put(String key, Object value) {
//        return map().put(key ,value);
//    }

//    public void clear(){
//        Holder holder = holder();
//        if (holder.list != null) {
//            holder.list.clear();
//        }
//        if(holder.map != null){
//            holder.map.clear();
//        }
//    }
//
//    public boolean contains(Object arg0){
//        Holder holder = holder();
//        if (holder.list != null) {
//            return holder.list.contains(arg0);
//        }
//        return false;
//    }
//    public int indexOf(Object arg0){
//        Holder holder = holder();
//        if(holder.list != null){
//            return holder.list.indexOf(arg0);
//        }
//        return -1;
//    }
//
//    public int lastIndexOf(Object arg0){
//        Holder holder = holder();
//        if(holder.list != null){
//            return holder.list.lastIndexOf(arg0);
//        }
//        return -1;
//    }
//
//    public boolean isEmpty(){
//        Holder holder = holder();
//        if (holder.list != null) {
//            return holder.list.isEmpty();
//        }
//        if(holder.map != null){
//            return holder.map.isEmpty();
//        }
//        return true;
//    }
//
//    public Iterator<T> iterator(){
//        return (Iterator<T>) list().iterator();
//    }
//
//
//    public Object delete(Object object){
//        Holder holder = holder();
//        if (holder.list != null) {
//            return holder.list.remove(object);
//        }
//        if (holder.map != null){
//            return holder.map.remove(object);
//        }
//        return null;
//    }

//    public Object set(int arg0, Object arg1){
//        return list().set(arg0, arg1);
//    }

//    public Object set(String key, Object value){
//        return map().put(key, value);
//    }

//    public Object get(Object arg0){
//        Holder holder = holder();
//        if(arg0 instanceof String){
//            if (holder.map != null) {
//                return holder.map.get(arg0);
//            }
//        } else {
//            if (holder.list != null) {
//                return holder.list.get((int) arg0);
//            }
//        }
//        return null;
//    }

//    public int size(){
//        Holder holder = holder();
//        if (holder.list != null) {
//            return holder.list.size();
//        }
//        if (holder.map != null) {
//            return holder.map.size();
//        }
//        return 0;
//    }

//    public boolean containsKey(Object arg0){
//        Holder holder = holder();
//        if (holder.map != null) {
//            return holder.map.containsKey(arg0);
//        }
//        return false;
//    }
//
//    public boolean containsValue(Object arg0){
//        Holder holder = holder();
//        if (holder.map != null) {
//            return holder.map.containsValue(arg0);
//        }
//        return false;
//    }

//    public Set<Map.Entry<String,Object>> entrySet(){
//        return map().entrySet();
//    }

//    public Set<String> keySet(){
//        return map().keySet();
//    }


//    public Collection values(){
//        Holder holder = holder();
//        if (holder.list != null) {
//            return holder.list;
//        }
//        if(holder.map != null){
//            return holder.map.values();
//        }
//        return new ArrayList();
//    }


    /**
     * json
     **/
//    abstract public Object get(Object key);


//    public Json j(Object key){
//        Object val = get(key);
//        if (val == null) {
//            return null;
//        }
//        if(val instanceof Json){
//            return (Json) val;
//        }
//        if(val.getClass().isArray()){
//            val = Arrays.asList(val);
//        }
//        if(val instanceof Map){
//            Json ins = o();
//            ins.map().putAll((Map<? extends String, ?>) val);
//            return ins;
//        } else if (val instanceof Collection){
//            Json ins = a();
//            ins.list().addAll((Collection<?>) val);
//            return  ins;
//        }
//        return null;
//    }
    public <T> T to(Class<T> clz) {
        return Json.cast(this, clz);
    }

    public <T> T to(TypeReference<T> reference){
        return Json.cast(this, reference);
    }

//    public <T> T to

    //    public enum ValidateType {
//        notnull,
//        notempty,
//        notblank;
//    }
//
//    public enum ValueType {
//        md5;
//    }
//
//
//    public static interface Property<T, R> extends Function<T, R>, Serializable {
//    }
//
//    public static String getFunctionKey(Function function) {
//        String name = getFunctionName(function);
//        if (name.length() > 1) {
//            return name.substring(0, 1).toLowerCase() + name.substring(1);
//        }
//        return name;
//    }
//
//    public static String getFunctionName(Function function) {
//        try {
//            Method declaredMethod = function.getClass().getDeclaredMethod("writeReplace");
//            declaredMethod.setAccessible(Boolean.TRUE);
//            SerializedLambda serializedLambda = (SerializedLambda) declaredMethod.invoke(function);
//            String method = serializedLambda.getImplMethodName();
//            String attr = null;
//            if (method.startsWith("g")) {
//                attr = method.substring(3);
//            } else {
//                attr = method.substring(2);
//            }
//            return attr;
//
//        } catch (ReflectiveOperationException var6) {
//            throw new RuntimeException(var6);
//        }
//    }

    public static Obj o(Object... objects) {
        Obj json = new Obj();
        for (short i = 0; i < objects.length; i += 2) {
            Object value = objects[i + 1];
            if(value == undefined){
                continue;
            }
            json.put((String) objects[i], objects[i + 1]);
        }
        return json;
    }

    public static Obj ooo(Object ...objects){
        Obj json = new Obj();
        for (short i = 0; i < objects.length; i += 2) {
            if(objects[i] instanceof Map){
                json.putAll((Map)objects[i]);
                continue;
            }
            Object value = objects[i + 1];
            if(value == undefined){
                continue;
            }
            json.put((String) objects[i], objects[i + 1]);
        }
        return json;
    }


    public static Arr<Object> aaa(Object ...objects){
        Arr arr = a();
        for (Object object : objects) {
            if(object instanceof Collection){
                arr.addAll((Collection) object);
            } else {
                arr.add(object);
            }
        }
        return a(arr.toArray()).spread();
    }

    public static <T> Arr<T> a(T ...objects){
        Arr json = new Arr();
        for (Object object : objects) {
            if(object == undefined){
                continue;
            }
            if(object instanceof Arr){
                if(((Arr) object).spread){
                    json.addAll((Arr)object);
                    continue;
                }
            }
            json.add(object);
        }
        return json;
    }


    public static Json tree(Collection<? extends Map> list, String parentKey, String childKey) {
        Map map = new HashMap();
        for (Map map1 : list) {
            Object key = map1.get(childKey);
            if (key == null) {
                continue;
            }
            map.put(key, map1);
        }
        Arr ret = a();
        for (Map map1 : list) {
            Object key = map1.get(parentKey);
            if (key == null) {
                ret.add(map1);
                continue;
            }
            Map par = (Map) map.get(key);
            if (par == null) {
                continue;
            }
            List<Map> child = (List<Map>) par.get("children");
            if (child == null) {
                child = new ArrayList<>();
                par.put("children", child);
            }
            child.add(map1);
        }
//        for (Json json : list) {
//            Json par = map.o(json.s(parentKey));
//            if (par == null) {
//                ret.add(json);
//                continue;
//            }
//            Json child = par.a("children");
//            if (child == null) {
//                child = a();
//                par.set("children", child);
//            }
//            child.add(json);
//        }
        return ret;
    }

    public static <T> T get(List list, String path){
        return _get(list,path);
    }
    public static <T> T get(Map map, String path){
        return _get(map,path);
    }

    private static <T> T _get(Object map, String path){
        Object item = map;
        for (String s : path.split("\\.")) {
            if(item instanceof Map){
                if(!((Map) item).containsKey(s)){
                    return null;
                }
                item = ((Map) item).get(s);
            } else if(item instanceof List){
                try{
                    int i = Integer.parseInt(s);
                    if(((List) item).size() > i){
                        item = ((List) item).get(i);
                    } else {
                        return null;
                    }
                } catch (Exception e){
                    return null;
                }
            } else {
                return null;
            }
        }
        return (T) item;
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

    public static <T> Json<T> toJson(Object source) {
        return cast(source, Json.class);
    }

//    public static Obj2 toObj(Object object){
//       return cast(object, Obj2.class);
//    }

//    public static Arr toArr(Object object){
//        return cast(object, Arr.class);
//    }

//    public static <T> T parse(String str, Class<T> clz){
//    }


//    public static <T> T parse(String str){
//        Arr arr = Json.parse("fuck");
//    }


    /******************************************************/

    public Object toBson() {
        return castBson(this);
    }

    protected static Object fromBson(Object object) {
        if (object instanceof Collection) {
            Arr arr = a();
            Collection list = (Collection) object;
            for (Object o : list) {
                arr.add(fromBson(o));
            }
            ;
            return arr;
        } else if (object instanceof Map) {
            Obj obj = o();
            Map<Object, Object> map = (Map) object;
            for (Map.Entry<Object, Object> entry : map.entrySet()) {
                obj.put((String) entry.getKey(), fromBson(entry.getValue()));
            }
            return obj;
        } else {
            return object;
        }
    }

    protected  <T> T castBson(Object object) {
        if (object == null) return (T) object;
        if (object.getClass().getName().startsWith("org.bson")) {
            return (T) object;
        }
        if (object instanceof Map) {
            Document document = new Document();
            for (Object o : ((Map) object).entrySet()) {
                Map.Entry entry = (Map.Entry) o;
                document.put((String) entry.getKey(), castBson(entry.getValue()));
            }
            return (T) document;
        } else if (object instanceof Collection) {
            List list = new ArrayList();
            for (Object o : ((Collection) object)) {
                list.add(castBson(o));
            }
            return (T) list;
        }
        if (object.getClass().getName().startsWith("java.")) {
            return (T) object;
        } else {
            //尝试转换为Document
            Document document = new Document();
            //字段
            for (Field field : object.getClass().getDeclaredFields()) {
                try {
                    document.put(field.getName(), castBson(field.get(object)));
                } catch (IllegalAccessException e) {
                }
            }
            //getter
            for (Method method : object.getClass().getDeclaredMethods()) {
                String methodName = method.getName();
                if (methodName.length() > 3) {
                    if (methodName.startsWith("get") && Util.isLetterUpper(methodName.charAt(3)) && method.getParameterCount() == 0) {
                        try {
                            document.put(methodName.substring(3, 4).toLowerCase() + methodName.substring(4), castBson(method.invoke(object)));
                        } catch (IllegalAccessException | InvocationTargetException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            return (T) document;
        }
    }

    public static <T> T newInstance(Class<T> clz) {
        try {
            return clz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

//    public static <T> T newInstance(Object context, Class<T> clz){
//        for (Constructor<?> constructor : clz.getDeclaredConstructors()) {
//            Class<?>[] types = constructor.getParameterTypes();
//            if(types.length == 1 && types[0] == context.getClass()){
//                try{
//                    return (T) constructor.newInstance(context);
//                }
//                catch (Exception e){}
//            }
//        }
//        ConstructorAccess<T> ca = ConstructorAccess.get(clz);
//        return ca.newInstance(context);
//    }

    public static <T> T cast(Object source, TypeReference<T> typeReference){
        return cast(source, typeReference.getType());
    }

//    public static <T> T cast(Object source, Object instance){
//
//    }

    public static <T> T cast(Object source, Class<T> clz) {
        return cast(source, (Type) clz);
    }

    public static <T> T cast(Object source, Type targetType) {
        if (source == null) {
            return null;
        }
        Class<?> type = source.getClass();
        //基本类型
        if (targetType == Object.class) {
            return (T) source;
        }
        if (targetType == String.class) {
            if (source instanceof String) {
                return (T) source;
            } else {
                return (T) String.valueOf(source);
            }
        }
        if (targetType == Boolean.class || targetType == boolean.class) {
            if (source instanceof Boolean) {
                return (T) source;
            } else {
                //尝试本身转换
                try {
                    String str = String.valueOf(source);
                    if(str.equalsIgnoreCase("true")){
                        return (T)(Boolean)true;
                    } else if(str.equalsIgnoreCase("false")){
                        return (T)(Boolean)false;
                    } else {
                        //尝试使用数字
                        try {
                            BigDecimal decimal = new BigDecimal(String.valueOf(source));
                            return (T) new Boolean(decimal.intValue() != 0);
                        } catch (Exception e) {
                        }
                    }
                } catch (Exception e) {
                }
                //啥都没有，那就false吧
                return (T) new Boolean(false);
            }
        }
        if (targetType == Integer.class || targetType == int.class) {
            if (source instanceof Integer) {
                return (T) source;
            } else {
                return (T) (Integer) Integer.parseInt(String.valueOf(source));
            }
        }
        if (targetType == Long.class || targetType == long.class) {
            if (source instanceof Long) {
                return (T) source;
            } else {
                return (T) (Long) Long.parseLong(String.valueOf(source));
            }
        }

        //可以返回自身
        Class clz = null;
        if (targetType instanceof ParameterizedType) {
            clz = (Class) ((ParameterizedType) targetType).getRawType();
        } else if (targetType instanceof Class) {
            clz = (Class) targetType;
        }
        if (clz == null) {
            return null;
        }
        if (clz == source.getClass()) {
            return (T) source;
        }
        //目标为List
        if (List.class.isAssignableFrom(clz)) {
//            if(Arr.class.isAssignableFrom(clz)){
//                clz = Arr.class;
//            }
//            else
            if (List.class == clz) {
                clz = (Class<T>) ArrayList.class;
            }
            Type[] types = null;
            if (targetType instanceof ParameterizedType) {
                ParameterizedType p = (ParameterizedType) targetType;
                types = p.getActualTypeArguments();
            }
            List list = (List) Json.newInstance(clz);
            if (type.isArray()) {
                for (int i = 0; i < Array.getLength(source); i++) {
                    list.add(Array.get(source, i));
                }
            } else if(source instanceof List){
                if(null != types && types.length > 0){
                    List collection = (List) source;
                    for (Object o : collection) {
                        list.add(cast(o, types[0]));
                    }
                } else {
                    ((List) list).addAll((Collection) source);
                }
            }
            return (T) list;
        }
        //目标为set类型
        if (Set.class.isAssignableFrom(clz)) {
            if (Set.class == clz) {
                clz = (Class<T>) HashSet.class;
            }
            Set list = (Set) Json.newInstance(clz);
            if (type.isArray()) {
                for (int i = 0; i < Array.getLength(source); i++) {
                    list.add(Array.get(source, i));
                }
            } else {
                list.addAll((Collection) source);
            }
            return (T) list;
        }
        if (clz.isArray()) {
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
            Type[] types = null;
            if (targetType instanceof ParameterizedType) {
                ParameterizedType p = (ParameterizedType) targetType;
                types = p.getActualTypeArguments();
            }
            Map map = (Map) Json.newInstance(clz);
            if (source instanceof Map) {
                if (null != types && types.length > 1) {
                    for (Map.Entry<Object, Object> entry : ((Map<Object, Object>) source).entrySet()) {
                        map.put(entry.getKey(), cast(entry.getValue(), (Class<T>) types[1]));
                    }
                } else {
                    ((Map) map).putAll((Map) source);
                }

            } else {
                //public属性
                for (Field field : source.getClass().getDeclaredFields()) {
                    if(Modifier.isPublic(field.getModifiers())){
                        try {
                            map.put(field, field.get(source));
                        } catch (IllegalAccessException e) {
                        }
                    }
                }
                // TODO: 2019/10/5 需要扫描getter
            }
            return (T) map;
        }
        //把目标当bean转换
        //todo: 使用reflectasm
        if (source instanceof Map) {
            return (T) mapToBean((Map<Object, Object>) source, clz);
        } else if(source.getClass().getName().startsWith("java.")){
            //很明显不是bean的情况
            return null;
        } else {
            return (T) beanToBean(source, clz);
        }

    }

//    private static Map beanToMap(Object source, Class clz){
//        if(clz == Map.class){
//            clz = HashMap.class;
//        }
//        Object ins = newInstance(clz);
//        FieldAccess fa = FieldAccess.get(clz);
//        for (String fieldName : fa.getFieldNames()) {
//
//        }
//    }

    private static Object mapToBean(Map<Object, Object> source, Object ins){
        Class<?> clz = ins.getClass();
//        FieldAccess fa = FieldAccess.get(clz);
//        Class[] types = fa.getFieldTypes();
        for (Field field : clz.getDeclaredFields()) {
            try {
                Type type = field.getType();
                field.set(ins, cast(source.get(field), type));
            } catch (Exception e) {
            }
        }
        return ins;
    }

    private static Object mapToBean(Map<Object, Object> source, Class clz) {
        return mapToBean(source, newInstance(clz));
    }

    private static Object beanToBean(Object source, Object ins){
        Class<?> clz = source.getClass();
        for (Field rightField : ins.getClass().getDeclaredFields()) {
            try {
                Field leftField = clz.getDeclaredField(rightField.getName());
                if (leftField == null) {
                    continue;
                }
                rightField.set(ins, cast(leftField.get(source), rightField.getType()));
            } catch (NoSuchFieldException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
//        FieldAccess leftfa = FieldAccess.get(source.getClass());
//        FieldAccess fa = FieldAccess.get(clz);
//        Class[] types = fa.getFieldTypes();
//        int i = 0;
//        for (String fieldName : fa.getFieldNames()) {
//            try {
//                fa.set(ins, i, cast(leftfa.get(source, fieldName), types[i]));
//            } catch (Exception e) {
//            }
//            i++;
//        }
        return ins;
    }
    private static Object beanToBean(Object source, Class clz) {
        return beanToBean(source, newInstance(clz));
    }
}
