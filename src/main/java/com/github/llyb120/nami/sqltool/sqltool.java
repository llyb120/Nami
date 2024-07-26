//package com.github.llyb120.nami.sqltool;
//
//import cn.hutool.core.util.StrUtil;
//import com.github.llyb120.nami.core.R;
//import com.github.llyb120.nami.core.Route;
//import com.github.llyb120.nami.json.Arr;
//import com.github.llyb120.nami.json.Obj2;
//import org.beetl.sql.core.SQLReady;
//
//import java.util.Comparator;
//import java.util.LinkedHashMap;
//import java.util.List;
//import java.util.stream.Collectors;
//
//import static com.github.llyb120.nami.ext.beetlsql.BeetlSql.sqlManager;
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
//    public String test(Obj2 body){
//        return "ok";
////        return body.toJSONString();
//    }
//
//
//    public Object getTables(){
//        LinkedHashMap<String, Obj2> map = new LinkedHashMap<String, Obj2>();
//        String sql = "select tabname from syscat.tables where tabschema='DB2INST1' and tabname not like 'EXPLAIN_%'";
//        sqlManager.execute(new SQLReady(sql), Obj2.class)
//        .stream()
//        .forEachOrdered(e -> {
//            Obj2 table = o("name", e.s("tabname"), "fields", a());
//            map.set(e.s("tabname"), table);
//        });
//        sql = "SELECT tabname,colname,colno,typename,length,remarks FROM SYSCAT.COLUMNS  where TABSCHEMA= #schema#";
//        sqlManager.execute(sql, Obj2.class, o("schema", "DB2INST1"))
//            .each(e -> {
//                Obj2 table = map.g(e.s("tabname"));
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
//        map.each((k,obj) -> {
//            List<Obj2> li = obj.oa("fields")
//                    .stream()
//                    .sorted(Comparator.comparing(a -> a.i("no")))
//                    .peek(e -> e.remove("no"))
//                    .collect(Collectors.toList());
//            obj.set("fields", li);
//        });
//        return map;
//    }
//
//
//    public Object preview(Obj2 body){
//        String sql = buildSql(body.a("table"));
////        var ret = sqlManager.execute(new SQLReady(sql), Obj2.class);
//        return R.ok(sql);
//    }
//
//
//    private String buildSql(Arr<Obj2> tables){
//        boolean main = true;
//        StringBuilder sb = new StringBuilder();
//        StringBuilder sup = new StringBuilder();
//        sb.append("select");
//        for (Obj2 obj : tables.oa()) {
//            field:{
//                for (Obj2 fields : obj.oa("fields")) {
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
//                for (Obj2 join : obj.oa("join")) {
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
