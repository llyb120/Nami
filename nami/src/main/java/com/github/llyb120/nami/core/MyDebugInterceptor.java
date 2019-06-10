package com.github.llyb120.nami.core;


import org.beetl.sql.core.InterceptorContext;
import org.beetl.sql.ext.DebugInterceptor;

public class MyDebugInterceptor extends DebugInterceptor {
    public void before(InterceptorContext ctx) {
        String sqlId = ctx.getSqlId();
        if (this.isDebugEanble(sqlId)) {
            ctx.put("debug.time", System.currentTimeMillis());
        }

        if (!this.isSimple(sqlId)) {
            StringBuilder sb = new StringBuilder();
            String lineSeparator = System.getProperty("line.separator", "\n");
            sb.append("┏━━━━━ Debug [").append(this.getSqlId(this.formatSql(sqlId))).append("] ━━━").append(lineSeparator).append("" + this.formatSql(ctx.getSql()) + lineSeparator).append("┣ 参数：\t " + this.formatParas(ctx.getParas())).append(lineSeparator);
            RuntimeException ex = new RuntimeException();
            StackTraceElement[] traces = ex.getStackTrace();
            int index = this.lookBusinessCodeInTrace(traces);
            StackTraceElement bussinessCode = traces[index];
            String className = bussinessCode.getClassName();
            String mehodName = bussinessCode.getMethodName();
            int line = bussinessCode.getLineNumber();
            sb.append("┣ 位置：\t " + className + "." + mehodName + "(" + bussinessCode.getFileName() + ":" + line + ")" + lineSeparator);
            ctx.put("logs", sb);
        }
    }
}
