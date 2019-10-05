package com.github.llyb120.nami.core;

import com.github.llyb120.nami.json.Arr;
import com.github.llyb120.nami.json.Json;
import com.github.llyb120.nami.server.Cookie;
import com.github.llyb120.nami.server.Request;
import com.github.llyb120.nami.server.Response;
import com.github.llyb120.nami.util.Util;
import org.beetl.sql.core.annotatoin.Table;

import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import static com.github.llyb120.nami.json.Json.a;

public class Param {
    private static List<Rule> ruleList = new Vector<>();

    public static Object[] AutoWiredParams(Parameter[] parameters, Response resp, Map<Class, Object> staticArgs) {
//        var context = Context.holder.g();
//        Parameter[] parameters = method.getParameters();
        Object[] ret = new Object[parameters.length];
        int idex = -1;
        int i = 0;

        for (Parameter parameter : parameters) {
            //特殊字段
            String name = parameter.getName();
            Class<?> type = parameter.getType();
//            name = names.g(i);
            ret[i] = null;
            //如果有静态，则直接使用
            if (null != staticArgs && staticArgs.containsKey(type)) {
                ret[i++] = staticArgs.get(type);
                continue;
            }

            if(type == Cookie.class){
                ret[i++] = resp.request.cookie;
                continue;
            }
//            if(type == FullHttpRequest.class){
//                ret[i++] = request;
//                continue;
//            }

            switch (name) {
                case "query":
                    ret[i] = resp.request.query.to(type);
                    break;

                case "body":
                    if (resp.request.body != null) {
                        if(type == String.class){
                            ret[i] = Json.stringify(resp.request.body);
                        }
                        if(resp.request.body instanceof Json){
                            ret[i] = ((Json)resp.request.body).to(type);
                        } else if(resp.request.body instanceof Json){
                            ret[i] = ((Json)resp.request.body).to(type);
                        }
                    }
                    break;

                case "params":
                    ret[i] = resp.request.params.to(type);
                    break;

                case "headers":
                    ret[i] = resp.request.headers.to(type);
                    break;

                default:
                    //必然为JSONOBJECT
                    idex = type.getTypeName().indexOf("[]");
                    //是数组的情况
                    if (idex > -1) {
                        String source = resp.request.params.s(name);
                        if (Util.isNotEmpty(source)) {
                            if (source.startsWith("[") && source.endsWith("]")) {
                                Json array = a(name);
                                ret[i] = array.to(type);
                            }
                            //只有一个的情况，直接尝试拆分
                            else {
//                                if (source.contains(",")) {
                                String[] split = source.split(",");
                                Arr array = a((split));
                                try {
                                    ret[i] = array.to(type);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    } else if (type == MultipartFile.class) {
                        ret[i] = resp.request.params.get(name);
                    } else if (type == Request.class){
                        ret[i] = resp.request;
                    } else if(type == Response.class){
                        ret[i] = resp;
                    }
                    else{
                        /**
                         * 从这里开始，因为类是动态加载的，所以对自定义的类要判定名字
                         */
                        Action action = null;
//                        if(PageQuery.class.isAssignableFrom(type)){
//                            Class gen = getGenericType(parameter);
//                            if (isModel(parameter, gen)) {
//                                action = (ctx, p, ac) -> pageQuery(ctx,p, gen, 0);
//                            }
//                        }
//                        else if(Collection.class.isAssignableFrom(type)){
//                            Class gen = getGenericType(parameter);
//                            if(isModel(parameter, gen)){
//                                action = (ctx,p,ac) -> pageQuery(ctx,p, gen, 1);
//                            }
//                        }
//                        else if(isModel(parameter, parameter.getType())){
//                            action = (ctx,p,ac) -> pageQuery(ctx, p, parameter.getType(), 2);
//                        }
                        rule:{
                            for (Rule rule : ruleList) {
                                if(rule.condition.canRule(resp, parameter)){
                                    ret[i] = rule.action.around(resp, parameter, action);
                                    break rule;
                                }
                            }
                            if (action != null) {
                                ret[i] = action.around(resp, parameter, null);
                            }
                        }
                    }
                    if (ret[i] == null) {
                        ret[i] = resp.request.getParam(name, type);
                    }
                    break;
            }
            i++;
        }
        return ret;
    }


    private static Class getGenericType(Parameter parameter){
        ParameterizedType p = (ParameterizedType) parameter.getParameterizedType();
        return (Class) p.getActualTypeArguments()[0];
    }

    private static boolean isModel(Parameter p, Class clz){
        return clz.getAnnotation(Table.class) != null;
//        return (config.model != null && config.model.stream()
//            .anyMatch(e -> clz.getName().startsWith(e))) || (p.getAnnotation(SqlBoost.class) != null);
    }


//    private static Object pageQuery(Response response, Parameter parameter, Class gType, int flag){
//        //如果这个字段有注解
//        SqlBoost boost = parameter.getAnnotation(SqlBoost.class);
//        String as = "b";
//        Class retType = gType;
//        if (boost != null && boost.model().length > 0) {
//            retType = boost.model()[0];
//        }
//
//        //查看有没有字段
//        LambdaQuery q = sqlManager.lambdaQuery(retType);
//        q.appendSql(" as " + as + " ");
//
//        HashMap<String, Field> fields = new HashMap<String, Field>();
//        for (Field field : retType.getDeclaredFields()) {
//            if(Modifier.isStatic(field.getModifiers())){
//                continue;
//            }
//            fields.put(field.getName(), field);
//        }
//        int page = 1;
//        int size = 10;
////        q.appendSql("m left join ra_store store on m.member_id = store.member_id ");
//
//        for (Map.Entry<String, ?> entry : response.request.query.entrySet()) {
//            if(flag == 0){
//                if(entry.getKey().equalsIgnoreCase("page")) {
//                    try{
//                        page = Integer.parseUnsignedInt(String.valueOf(entry.getValue())) ;
//                    } catch (Exception e){
//                    }
//                } else if(entry.getKey().equalsIgnoreCase("length")) {
//                    try {
//                        size = Integer.parseUnsignedInt(String.valueOf(entry.getValue()));
//                    } catch (Exception e) {
//                    }
//                }
//            }
//
//            String[] ops = {">>","<<", ">", "<" ,"%"};
//            String finalop = Stream.of(ops)
//                    .filter(e -> entry.getKey().endsWith(e))
//                    .findFirst()
//                    .orElse("=");
//            String key = entry.getKey().replace(finalop, "");
//            //否定判断
//            boolean flip = false;
//            if(key.endsWith("!")){
//                flip = true;
//                key = key.substring(0, key.length() - 1);
//            }
//
//            //多个字段或
//            String[] ks = null;
//            String ktype = "and";
//            if(key.contains("|")){
//                ks = key.split("\\|");
//                ktype = "or";
//            } else if(key.contains("&")){
//                ks = key.split("\\&");
//            } else {
//                ks = new String[]{key};
//            }
//            LambdaQuery con = q.condition();
//            boolean used = false;
//            for (String k : ks) {
//                //判断有没有这个字段
//                Field f = fields.get(k);
//                if (f == null) {
//                    continue;
//                }
//                String val = String.valueOf(entry.getValue());
//                if (StrUtil.isNotBlank(val) && !"null".equals(val)) {
//                    used = true;
//                    String fname = (as + ".") + f.getName();
//                    switch (finalop){
//                        case "=":
//                            if(ktype.equals("and")){
//                                if(flip){
//                                    con.andNotEq(fname, entry.getValue());
//                                } else {
//                                    con.andEq(fname, entry.getValue());
//                                }
//                            } else {
//                                if(flip){
//                                    con.orNotEq(fname, val);
//                                } else {
//                                    con.orEq(fname, val);
//                                }
//                            }
//                            break;
//
//                        case ">>":
//                            if(ktype.equals("and")){
//                                if(flip){
//                                    con.andLess(fname, entry.getValue());
//                                } else {
//                                    con.andGreatEq(fname, entry.getValue());
//                                }
//                            } else {
//                                if(flip){
//                                    con.orLess(fname, entry.getValue());
//                                } else {
//                                    con.orGreatEq(fname, entry.getValue());
//                                }
//                            }
//                            break;
//
//                        case "<<":
//                            if (ktype.equals("and")) {
//                                if(flip){
//                                    con.andGreat(fname, val);
//                                } else {
//                                    con.andLessEq(fname, val);
//                                }
//                            } else {
//                                if(flip){
//                                    con.orGreat(fname, val);
//                                } else {
//                                    con.orLessEq(fname, val);
//                                }
//                            }
//                            break;
//
//                        case ">":
//                            if(ktype.equals("and")){
//                                if(flip){
//                                    con.andLessEq(fname, val);
//                                } else {
//                                    con.andGreat(fname, val);
//                                }
//                            } else {
//                                if(flip){
//                                    con.orLessEq(fname, val);
//                                } else {
//                                    con.orGreat(fname, val);
//                                }
//                            }
//                            break;
//
//                        case "<":
//                            if(ktype.equals("and")){
//                                if(flip){
//                                    con.andGreatEq(fname, val);
//                                } else {
//                                    con.andLess(fname, val);
//                                }
//                            } else {
//                                if(flip){
//                                    con.orGreatEq(fname, val);
//                                } else {
//                                    con.orLess(fname, val);
//                                }
//                            }
//                            break;
//
//                        case "%":
//                            if(ktype.equals("and")){
//                                if(flip){
//                                    con.andNotLike(fname, val);
//                                } else {
//                                    con.andLike(fname, val);
//                                }
//                            } else {
//                                if(flip){
//                                    con.orNotLike(fname, val);
//                                } else {
//                                    con.orLike(fname, val);
//                                }
//                            }
//                            break;
//                    }
//                }
//            }
//            if(used){
//                q.and(con);
//            }
//        }
//
//        //补充关联字段
//        Table table = (Table) retType.getAnnotation(Table.class);
//        List<Config.Link> links = new ArrayList<>();
//
//        Set<String> nfs = fields.keySet()
//                .stream()
//                .map(e -> as + "." + e)
//                .collect(Collectors.toSet());
//        if (boost != null && boost.appendField().length > 0) {
//            String key = table.name();
//            int idex = key.indexOf(".");
//            if(idex > -1){
//                key = key.substring(idex + 1);
//            }
//            for (String s : boost.appendField()) {
//                if(StrUtil.isEmpty(s)){
//                    continue;
//                }
//                Config.Link link = config.links.get(key + s);
//                if (link == null) {
//                    nfs.add(s);
//                } else {
//                    links.add(link);
//                }
//            }
//        }
//
//
//        if(flag == 0){
//            PageQuery ret = q.page(page, size, gType, nfs.toArray(new String[nfs.size()]));
//            addLinks(ret.getList(), links);
//            return ret;
//        } else if(flag == 1){
//            List ret = q.select(gType, nfs.toArray(new String[nfs.size()]));
//            addLinks(ret, links);
//            return ret;
//        } else if(flag == 2){
//            if(Json.class.isAssignableFrom(gType)){
//                //todo: fix this !!!!!!!!!!!
//                Json ret = null; //Json.parse(q.single());
//                addLinks(Arrays.asList((Json)ret), links);
//                return ret;
//            } else {
//                Object ret = q.single();
//                return ret;
//            }
//        } else {
//            return null;
//        }
//    }
//
//    private static void addLinks(Collection<Json> ret, List<Config.Link> links){
//        for (Config.Link link : links) {
//            Obj map = o();
//            String ids = ret
//                    .stream()
//                    .peek(e -> map.put(((Obj) e).s(link.fromField), e))
//                    .map(e -> ((Obj) e).s(link.fromField))
//                    .map(e -> StrUtil.wrap((CharSequence) e, "'"))
//                    .collect(Collectors.joining(","));
//            if(StrUtil.isEmpty((CharSequence) ids)){
//                continue;
//            }
//            List<Obj> items = sqlManager.execute(String.format("select * from %s where %s in (%s)", link.toClz, link.toField, ids), Obj.class, o());
//            for (Obj item : items) {
//                Obj target = o(item.s(link.toField));
//                if (target == null) {
//                    continue;
//                }
//                Object Json = target.get(link.name);
//                if (Json == null) {
//                    if(link.many){
//                        Json = a();
//                    } else {
//                        Json = o();
//                    }
//                    target.put(link.name, Json);
//                }
//                if(link.many){
//                    ((Arr)Json).add(item);
//                } else {
//                    ((Map)Json).putAll(item.map());
//                }
//            }
//        }
//    }

    public static void AddRule(Condition condition,  Action action){
        ruleList.add(new Rule(condition,  action));
    }


    public static interface Condition{
        boolean canRule(Response context, Parameter parameter);
    }

    public static interface Action{
        Object around(Response context, Parameter parameter, Action defaultAction);
    }

    public static class Rule{
        public Condition condition;
        public Action action;

        public Rule(Condition condition, Action action) {
            this.condition = condition;
            this.action = action;
        }
    }


}
