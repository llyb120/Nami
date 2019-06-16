package com.github.llyb120.nami.core;


import cn.hutool.core.util.StrUtil;
import org.apache.xmlbeans.impl.regex.Match;
import org.beetl.sql.core.InterceptorContext;
import org.beetl.sql.core.engine.SQLParameter;
import org.beetl.sql.ext.DebugInterceptor;

import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyDebugInterceptor extends DebugInterceptor {
    private Pattern pattern = Pattern.compile("\\?");

    public void before(InterceptorContext ctx) {
        String sqlId = ctx.getSqlId();
        if (this.isDebugEanble(sqlId)) {
            ctx.put("debug.time", System.currentTimeMillis());
        }

        if (!this.isSimple(sqlId)) {
            StringBuilder sb = new StringBuilder();
            var sql = this.formatSql(ctx.getSql());
            var args = ctx.getParas();


            String lineSeparator = System.getProperty("line.separator", "\n");
            sb.append("[")
                .append(this.getSqlId(this.formatSql(sqlId)))
                .append("]")
                .append(lineSeparator);

            Matcher matcher = pattern.matcher(sql);
            var idex = -1;
            while(matcher.find()){
                idex++;
                matcher.appendReplacement(sb, StrUtil.wrap(String.valueOf(args.get(idex).value), "'"));
            }
            matcher.appendTail(sb);
            sb.append(lineSeparator);
//                .append();
//                .append("" + this.formatSql(ctx.getSql()) + lineSeparator)
//                加上自己解析后的sql
//                .append(lineSeparator)
//                .append("┣ 参数：\t " + this.formatParas(ctx.getParas()))
//                .append(lineSeparator);
            RuntimeException ex = new RuntimeException();
            StackTraceElement[] traces = ex.getStackTrace();
            int index = this.lookBusinessCodeInTrace(traces);
            StackTraceElement bussinessCode = traces[index];
            String className = bussinessCode.getClassName();
            String mehodName = bussinessCode.getMethodName();
            int line = bussinessCode.getLineNumber();
            sb.append("位置：" + className + "." + mehodName + "(" + bussinessCode.getFileName() + ":" + line + ")" + "    ");
            ctx.put("logs", sb);
        }
    }


    @Override
    public void after(InterceptorContext ctx) {
        String sqlId = ctx.getSqlId();
        if (this.isSimple(sqlId)) {
            this.simpleOut(ctx);
            return;
        }
        long time = System.currentTimeMillis();
        long start = (Long) ctx.get("debug.time");
        String lineSeparator = System.getProperty("line.separator", "\n");
        StringBuilder sb = (StringBuilder) ctx.get("logs");
        sb.append("时间：" + (time - start) + "ms").append("  ");
        if (ctx.isUpdate()) {
            sb.append("更新：[");
            if (ctx.getResult().getClass().isArray()) {
                int[] ret = (int[]) ctx.getResult();
                for (int i = 0; i < ret.length; i++) {
                    if (i > 0)
                        sb.append(",");
                    sb.append(ret[i]);
                }
            } else {
                sb.append(ctx.getResult());
            }
            sb.append("]").append(lineSeparator);
        } else {
            if (ctx.getResult() instanceof Collection) {
                sb.append("结果：[").append(((Collection) ctx.getResult()).size()).append("]").append(lineSeparator);
            } else {
                sb.append("结果：[").append(ctx.getResult()).append("]").append(lineSeparator);
            }

        }
        println(sb.toString());
    }
}
