package com.github.llyb120.nami.excel;

import com.github.llyb120.nami.core.MultipartFile;
import com.github.llyb120.nami.core.Obj;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.jxls.common.Context;
import org.jxls.transform.Transformer;
import org.jxls.transform.poi.PoiTransformer;
import org.jxls.util.JxlsHelper;

import java.io.*;

public class ExportUtil {

    public static MultipartFile toXls(String fileName, InputStream template, Obj obj) throws IOException, InvalidFormatException {
        File temp = File.createTempFile("123", ".xls");
        try(
            var is = template;
            var fos = new FileOutputStream(temp);
            ){
              var context = new Context();
              obj.forEach((k,v) -> context.putVar(String.valueOf(k),v));
            JxlsHelper
                .getInstance()
                .setUseFastFormulaProcessor(false)
                .processTemplate(template, fos, context);
            return new MultipartFile(fileName, temp, true);
        }
    }
}
