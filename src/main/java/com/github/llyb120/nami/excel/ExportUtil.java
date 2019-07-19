package com.github.llyb120.nami.excel;

import com.github.llyb120.nami.core.MultipartFile;
import com.github.llyb120.nami.json.Json;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.jxls.common.Context;
import org.jxls.util.JxlsHelper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ExportUtil {

    public static MultipartFile toXls(String fileName, InputStream template, Json Json) throws IOException, InvalidFormatException {
        File temp = File.createTempFile("123", ".xls");
        try(
            InputStream is = template;
            FileOutputStream fos = new FileOutputStream(temp);
            ){
              Context context = new Context();
              Json.forEach((k,v) -> context.putVar(String.valueOf(k),v));
            JxlsHelper
                .getInstance()
                .setUseFastFormulaProcessor(false)
                .processTemplate(template, fos, context);
            return new MultipartFile(fileName, temp, true);
        }
    }
}
