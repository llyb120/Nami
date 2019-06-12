package com.beeasy.hzlink;

import cn.hutool.core.io.IoUtil;
import org.junit.Test;
import org.jxls.common.Context;
import org.jxls.util.JxlsHelper;

import java.io.*;

import static com.github.llyb120.nami.core.Json.a;
import static com.github.llyb120.nami.core.Json.o;

public class ExcelTest {

    @Test
    public void test() throws IOException {
        Context context = new Context();
        context.putVar("values", a(
            o("name", "fuck")
        ));
        var bs = IoUtil.read(new FileInputStream("d:/template.xls"));
        var sw = new StringWriter();
        var baos = new ByteArrayOutputStream();
        JxlsHelper.getInstance().processTemplate(new FileInputStream("d:/template.xls"), new FileOutputStream("d:/export.xls"), context);
//        XLSTransformer transformer = new XLSTransformer();
//        var bean = o();
//        bean.put("values",
//        transformer.transformXLS("C:\\Users\\bin\\Documents\\WeChat Files\\llyb120\\FileStorage\\File\\2019-06\\软需附件(1)\\软需附件\\附件7-股东关联明细导出模板.xls", bean, ("d:/export.xls"));
    }
}
