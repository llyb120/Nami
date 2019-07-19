//package com.github.llyb120.nami.sqltool;
//
//import cn.hutool.core.util.StrUtil;
//import com.github.llyb120.nami.core.R;
//import com.github.llyb120.nami.core.Route;
//import com.github.llyb120.nami.json.Arr;
//import com.github.llyb120.nami.json.Obj;
//import org.beetl.sql.core.SQLReady;
//
//import java.util.Comparator;
//import java.util.LinkedHashMap;
//import java.util.List;
//import java.util.stream.Collectors;
//
//import static com.github.llyb120.nami.ext.BeetlSql.sqlManager;
//import static com.github.llyb120.nami.json.Json.a;
//import static com.github.llyb120.nami.json.Json.o;
//
//public class sqltool {
//
//
//    public static void init(){
//        Route.routes.add(new Route("/sqltool/:c/:a -> com.github.llyb120.nami.sqltool"));
//    }
//
//    public String test(Obj body){
//        return "fuck";
////        return body.toJSONString();
//    }
//
//
//    public Object getTables(){
//        LinkedHashMap<String, Obj> map = new LinkedHashMap<String, Obj>();
//        String sql = "select tabname from syscat.tables where tabschema='DB2INST1' and tabname not like 'EXPLAIN_%'";
//        sqlManager.execute(new SQLReady(sql), Obj.class)
//        .stream()
//        .forEachOrdered(e -> {
//            Obj table = o("name", e.s("tabname"), "fields", a());
//            map.put(e.s("tabname"), table);
//        });
//        sql = "SELECT tabname,colname,colno,typename,length,remarks FROM SYSCAT.COLUMNS  where TABSCHEMA= #schema#";
//        sqlManager.execute(sql, Obj.class, o("schema", "DB2INST1"))
//            .forEach(e -> {
//                Obj table = map.get(e.s("tabname"));
//                if (table == null) {
//                    return;
//                }
//                table.a("fields").add(o(
//                    "name", e.s("colname"),
//                    "no", e.i("colno"),
//                    "type", e.s("typename"),
//                    "length", e.i("length"),
//                    "comment", e.s("remarks")
//                ));
//            });
//        map.forEach((k,obj) -> {
//            List<Obj> li = obj.oa("fields")
//                    .stream()
//                    .sorted(Comparator.comparing(a -> a.i("no")))
//                    .peek(e -> e.remove("no"))
//                    .collect(Collectors.toList());
//            obj.put("fields", li);
//        });
//        return map;
//    }
//
//
//    public Object preview(Obj body){
//        String sql = buildSql(body.a("table"));
////        var ret = sqlManager.execute(new SQLReady(sql), Obj.class);
//        return R.ok(sql);
//    }
//
//
//    private String buildSql(Arr<Obj> tables){
//        boolean main = true;
//        StringBuilder sb = new StringBuilder();
//        StringBuilder sup = new StringBuilder();
//        sb.append("select");
//        for (Obj obj : tables.oa()) {
//            field:{
//                for (Obj fields : obj.oa("fields")) {
//                    String field = fields.s("name", "");
//                    sb.append(" ");
//                    sb.append(obj.s("as"));
//                    sb.append(".");
//                    sb.append(field);
//                    sb.append(",");
//                    //如果出现了*
//                    if(field.equals("*")){
//                        break field;
//                    }
//                }
//            }
//            if(main){
//               main = false;
//                sup.append(" from ");
//                sup.append(obj.s("name"));
//                sup.append(" as ");
//                sup.append(obj.s("as"));
//            } else {
//                sup.append(" left join ");
//                sup.append(obj.s("name"));
//                sup.append(" as ");
//                sup.append(obj.s("as"));
//                sup.append(" on ");
//                //on
//                for (Obj join : obj.oa("join")) {
//                    sup.append(join.s("left_value"));
//                    sup.append(join.s("op"));
//                    String rtype = join.s("right_type", "field");
//                    String rvalue = join.s("right_value");
//                    if(rtype.equals("field")){
//                        sup.append(rvalue);
//                    } else {
//                        sup.append(StrUtil.wrap(rvalue, "'"));
//                    }
//                    sup.append(" and ");
//                }
//                sup.delete(sup.length() - 5, sup.length() - 1);
//            }
//        }
//        if(sb.charAt(sb.length() - 1) == ','){
//            sb.deleteCharAt(sb.length() - 1);
//        }
//        sb.append(sup);
//        return sb.toString();
//    }
//
//
//}
