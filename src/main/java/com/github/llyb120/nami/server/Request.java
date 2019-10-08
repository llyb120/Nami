package com.github.llyb120.nami.server;

import com.github.llyb120.nami.core.MultipartFile;
import com.github.llyb120.nami.json.Json;
import com.github.llyb120.nami.json.Obj;
import com.github.llyb120.nami.util.Util;

import java.io.*;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import static com.github.llyb120.nami.json.Json.o;
import static com.github.llyb120.nami.server.AbstractServer.CRLF;

public class Request implements AutoCloseable {
    public Obj headers = o();
    public Obj query = o();
    public Obj params = o();
    public Method method = null;
    public String path;
    public String version;
    public DataInputStream is;
//    public ReadableByteChannel channel;
    public Json body;
    public Cookie cookie = new Cookie();


    //以下解析用
//    private LinkedBlockingQueue<ByteBuffer> taskList = new LinkedBlockingQueue<>();
    volatile AnalyzePhase phase = AnalyzePhase.DECODING_HEAD;
    //    private FormDataTemp temp;
    private StringBuilder sb = new StringBuilder();
    private String formDataStart;
    private byte[] formDataTokenBs;
    private String formDataEnd;
    private String[] formDataKeys;
    private int formDataPtr = 0;
    private OutputStream fdos;
    private MultipartFile formDataFile;


    @Override
    public void close() throws Exception {
        Util.close(is);
        params.forEach((k, v) -> {
            Util.closeIfPosible(v);
        });
    }

    enum Method {
        GET,
        POST,
        OPTIONS,
        HEAD,
        DELETE
    }

    enum AnalyzePhase {
        DECODING_HEAD,
        DECODING_BODY,
        DECODING_FORM_DATA,
        FORM_DATA_READ_START_END,
        FORM_DATA_READ_PROPERTY,
        FORM_DATA_READ_EMPTY,
        FORM_DATA_READ_VALUE,
        FORM_DATA_READ_FILE,
        END;
    }

//    enum FormDataStep {
//        //等待读出头
//        WAIT_FOR_START,
//        WAIT_FOR_READ_PROPERTY,
//        WAIT_FOR_END,
//        WAIT_FOR_READ_VALUE,
//        ;
//    }
//
//
//    static class FormDataTemp {
//        String start = null;
//        String end = null;
//        byte[] limit = null;
//        FormDataStep step;
//        OutputStream tempOs;
//        String name;
//        MultipartFile file;
//
//        public void release() {
//            if (tempOs != null) {
//                try {
//                    tempOs.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            name = null;
//            file = null;
//            tempOs = null;
//            step = FormDataStep.WAIT_FOR_START;
//        }
//    }


    private Json decodeQuery(String query, Obj ret) {
        String qs = query + "&";
        try{
            qs = URLDecoder.decode(qs, StandardCharsets.UTF_8.name());
            qs = URLDecoder.decode(qs, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e) {
        }
        int len = qs.length();
        int ptr = 0;
        String key = "";
        String value = "";
        //0 - readkey
        //1 - readvalue
        int mode = 0;
        StringBuilder sb = new StringBuilder();
        while (ptr < len) {
            char ch = qs.charAt(ptr);
            switch (ch) {
                case '=':
                    if (mode == 0) {
                        key = sb.toString();
                        sb.setLength(0);
                        mode = 1;
                    } else {
                        sb.append(ch);
                    }
                    break;

                case '&':
                    //如果直接被终结了,类似?aaa&
                    if (mode == 0) {
                        key = sb.toString();
                    } else {
                        mode = 0;
                        value = sb.toString();
                    }
                    //无论如何,都要清空缓冲
                    sb.setLength(0);
                    if (key.isEmpty()) {
                        break;
                    }
                    ret.put(key, value);
                    key = "";
                    value = "";
                    break;

                default:
                    sb.append(ch);
                    break;
            }
            ptr++;
        }
        return ret;
    }

    /**
     * 解析query
     *
     * @param path
     */
    private void decodePath(String path) {
        int qmark = path.indexOf("?");
        if (qmark == -1) {
            this.path = path;
        } else {
            this.path = path.substring(0, qmark);
            decodeQuery(path.substring(qmark + 1), this.query);
        }
    }

    public void analyzeEnd() {
        phase = AnalyzePhase.END;

        if (null != body) {
            if (body instanceof Map) {
                params.putAll((Map<? extends String, ?>) body);
            }
        }
    }

    void decodeBody() throws IOException {
        //如果足够
        int clen = getContentLength();
        byte[] bodybs = new byte[clen];
//        System.arraycopy(bs, start, bodybs, 0, len);
//        if(len >= clen){
//        } else {
        is.read(bodybs);
//        }
        String str = new String(bodybs, StandardCharsets.UTF_8);
        if ((str.startsWith("{") && str.endsWith("}")) || (str.startsWith("[") && str.endsWith("]"))) {
            body = Json.parse(str);
        } else {
            body = o();
            decodeQuery(str, (Obj) body);
        }
    }

    void decodeFormData() throws IOException {
        body = o();
        String ctype = getContentType();
        int idex = ctype.indexOf("boundary=");
        if (idex == -1) {
            return;
        }
        String token = ctype.substring(idex + 9);
        formDataStart = ("--" + token + CRLF);
        formDataEnd = ("--" + token + "--");
        formDataTokenBs = ("--" + token).getBytes(StandardCharsets.UTF_8);
        int clen = getContentLength();
        byte[] bodybs = new byte[clen];
        is.read(bodybs);
        phase = AnalyzePhase.FORM_DATA_READ_START_END;
        AnalyzePhase preparePhase = null;
        int ptr = 0;
        loop:while(true){
            System.out.println(phase.name());
            switch (phase){
                case FORM_DATA_READ_START_END:
                    idex = byteArrayIndexOf(bodybs, formDataTokenBs, ptr);
                    if(idex == -1){
                        break loop;
                    }
                    Util.close(fdos);
                    //检查接下来两个
                    if(bodybs[idex + formDataTokenBs.length + 0] == '\r' && bodybs[idex + formDataTokenBs.length + 1] == '\n'){
                        ptr = idex + formDataTokenBs.length + 2;
                        phase = AnalyzePhase.FORM_DATA_READ_PROPERTY;
                    } else if(bodybs[idex + formDataTokenBs.length + 0] == '-' && bodybs[idex + formDataTokenBs.length + 1] == '-'){
                        break loop;
                    }
                    break;

                case FORM_DATA_READ_PROPERTY:
                    idex = byteArrayIndexOf(bodybs, CRLF.getBytes(), ptr);
                    if(idex == -1){
                        break loop;
                    }
                    //准备读取值
                    if(idex == ptr){
                        ptr += 2;
                        phase = preparePhase;//AnalyzePhase.FORM_DATA_READ_VALUE;
                        preparePhase = null;
                        break;
                    }
                    //读取属性
                    formDataKeys = new String[]{"", ""};
                    getFormDataKeys(new String(bodybs, ptr, idex - ptr), formDataKeys);
                    if(preparePhase == null){
                        if (!formDataKeys[1].isEmpty()) {
                            preparePhase = AnalyzePhase.FORM_DATA_READ_FILE;
                        } else {
                            preparePhase = AnalyzePhase.FORM_DATA_READ_VALUE;
                        }
                    }
                    if(!formDataKeys[0].isEmpty() && !formDataKeys[1].isEmpty()){
                        File file = File.createTempFile("nami","nami");
                        fdos = new FileOutputStream(file);
                        formDataFile = new MultipartFile(formDataKeys[1], file);
                        ((Obj)body).put(formDataKeys[0], formDataFile);
                    }
                    ptr = idex + 2;
                    break;

                case FORM_DATA_READ_VALUE:
                    idex = byteArrayIndexOf(bodybs, CRLF.getBytes(), ptr);
                    if(idex == -1){
                        break loop;
                    }
                    String value = new String(bodybs, ptr, idex - ptr);
                    if(!formDataKeys[0].isEmpty()){
                        ((Obj)body).put(formDataKeys[0], value);
                    }
                    ptr = idex + 2;
                    phase = AnalyzePhase.FORM_DATA_READ_START_END;
                    break;


                case FORM_DATA_READ_FILE:
                    idex = byteArrayIndexOf(bodybs, formDataTokenBs, ptr);
                    if(idex == -1){
                        break loop;
                    }
                    //需要排除掉最后的\r\n
                    fdos.write(bodybs, ptr, idex - ptr - 2);
                    phase = AnalyzePhase.FORM_DATA_READ_START_END;
                    ptr = idex;
                    break;

            }
            if(ptr >= clen){
                break loop;
            }
        }
//        buf.append(bs, start, len);
////        byte[] endFlag = formDataEnd.getBytes(StandardCharsets.UTF_8);
//        phase = AnalyzePhase.FORM_DATA_READ_START_END;
//        int clen = getContentLength();
//        formDataStep(bs, start, len);
//        System.out.println("fuck");
//        while(true){
//            if(clen >= len){
//                break;
//            }
//            int n = is.read(bs);
//            if(n < 1){
//                break;
//            }
//        }
    }

    private int byteArrayIndexOf(byte[] src, byte[] target, int from){
        int ptr = 0;
        for (int i = from; i < src.length; i++) {
            if(src[i] == target[ptr]){
                ptr++;
            } else {
                ptr = 0;
            }
            if(ptr >= target.length){
                return i - ptr + 1;
            }
        }
        return -1;
    }

//    void formDataStep(byte[] bs, int start, int len){
//        for (int i = start; i < len; i++) {
//            if(bs[i] == formDataTokenBs[formDataPtr]){
//                formDataPtr++;
//            } else {
//                formDataPtr = 0;
//            }
//            if(formDataPtr == formDataTokenBs.length){
//                formDataPtr = 0;
//            }
//            System.out.println(formDataTokenBs.length + "  " + formDataPtr);
////            if(ptr > formDataStart.getBytes().length){
////                int d = 2;
////            }
//        }
//    }

    /**
     * @param byteBuffer 应处于读模式的bytebuffer
     * @return 是否已经解析完毕, true表示不需要再解析
     * @throws InterruptedException
     */
    public boolean analyze(byte[] bs, int start, int max) {
        if (phase == AnalyzePhase.END) {
            return true;
        }
        sb.append(new String(bs, start, max));
//        sb.append(charBuffer.toString());
//        byte[] bs = new byte[byteBuffer.remaining()];
//        byteBuffer.get(bs);
//        if (phase == AnalyzePhase.DECODING_HEAD) {
//            int i = sb.indexOf(CRLF + CRLF);
//            if(i > -1){
//                String str = sb.substring(0, i);
//                sb.delete(0, i + CRLF.length() + CRLF.length()); //                new StringTokenizer(str, CRLF).nextToken();
//                String[] lines = StrUtil.split(str, CRLF);
//                for (String line : lines) {
//                    decodeHeader(line);
//                }
//                phase = AnalyzePhase.DECODING_BODY;
//                params.putAll(query);
//
//                if (method == Method.HEAD || method == Method.GET || method == Method.OPTIONS) {
//                    return true;
//                }
//            }
//        }


        if (phase == AnalyzePhase.DECODING_BODY) {
            //解析剩余的
            String ctype = getContentType();
            int clen = getContentLength();
            if (ctype.contains("multipart/form-data")) {
                body = o();
                phase = AnalyzePhase.DECODING_FORM_DATA;
                formDataKeys = new String[]{"",""};
                int idex = ctype.indexOf("boundary=");
                if (idex == -1) {
                    return true;
                }
                String token = ctype.substring(idex + 9);
                formDataStart = ("--" + token + CRLF);
                formDataEnd = ("--" + token + "--");
            } else if (sb.length() >= clen) {
                String str = sb.toString();
                if ((str.startsWith("{") && str.endsWith("}")) || (str.startsWith("[") && str.endsWith("]"))) {
                    body = Json.parse(str);
                } else {
                    body = o();
                    decodeQuery(str, (Obj) body);
                }
                return true;
            }
        }

        if(phase.ordinal() > 1) {
            while (true) {
                //end
                int startPos = sb.indexOf(formDataStart);
                if (startPos == 0) {
                    //删掉头
                    sb.delete(0, formDataStart.length());
                    //切换为读属性
                    phase = AnalyzePhase.FORM_DATA_READ_PROPERTY;
                    Util.close(fdos);
                }
                int endPos = sb.indexOf(formDataEnd);
                if (endPos == 0) {
                    sb.setLength(0);
                    Util.close(fdos);
                    phase = AnalyzePhase.END;
                    return true;
                }
                if(phase == AnalyzePhase.DECODING_FORM_DATA){
                    if(startPos == -1 && endPos == -1){
                        break;
                    }
                }
                if (phase == AnalyzePhase.FORM_DATA_READ_PROPERTY) {
                    int i = sb.indexOf(CRLF);
                    if (i == -1) {
                        break;
                    }
                    if(i == 0){
                        sb.delete(0, i + CRLF.length());
                        if (!formDataKeys[1].isEmpty()) {
                            phase = AnalyzePhase.FORM_DATA_READ_FILE;
                        } else {
                            phase = AnalyzePhase.FORM_DATA_READ_VALUE;
                        }
                        continue;
                    }
                    String line = sb.substring(0, i);
                    sb.delete(0, i + CRLF.length());
                    getFormDataKeys(line, formDataKeys);
                    if(!formDataKeys[0].isEmpty() && !formDataKeys[1].isEmpty()){
                        try {
                            File file = File.createTempFile("nami","nami");
                            fdos = new FileOutputStream(file);
                            formDataFile = new MultipartFile(formDataKeys[1], file);
                            ((Obj)body).put(formDataKeys[0], formDataFile);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }

                if (phase == AnalyzePhase.FORM_DATA_READ_VALUE) {
                    int i = sb.indexOf(CRLF);
                    if (i == -1) {
                        break;
                    }
                    String value = sb.substring(0, i);
                    if(!formDataKeys[0].isEmpty()){
                        ((Obj)body).put(formDataKeys[0], value);
                    }
                    sb.delete(0, i + CRLF.length());
                    phase = AnalyzePhase.FORM_DATA_READ_PROPERTY;
                }
                if (phase == AnalyzePhase.FORM_DATA_READ_FILE) {
                    if(sb.length() < formDataStart.length() || sb.length() < formDataEnd.length()){
                        break;
                    }
                    int i;
                    int delI;
                    if (startPos > 0 && endPos > 0) {
                        i = delI = Math.min(startPos, endPos) - CRLF.length();
                    } else if(startPos > 0){
                        i = delI = startPos - CRLF.length();
                    } else if(endPos > 0){
                        i = delI = endPos - CRLF.length();
                    } else {
                        i = delI = sb.length();
                        delI -= CRLF.length();
                    }
                    if(i == 0){
                        break;
                    }
                    try {
                        fdos.write(sb.substring(0, i).getBytes());
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        sb.delete(0, delI + CRLF.length());
                    }
                }
                //end
            }

        }
        return false;
    }

    private void getFormDataKeys(String line, String[] formDataKeys){
        if (!line.contains("=")) {
            return;
        }
        formDataKeys[0] = formDataKeys[1] = "";
        int len = line.length();
        int i = 0;
        int left = -1;
        String key = "";
        while(i < len){
            char c = line.charAt(i);
            if(Util.isBlankChar(c) && key.isEmpty()) {
                left = i + 1;
            }
            else if(c == '=' && left > -1){
                key = line.substring(left, i);
                left = -1;
                //check next
                int next = i + 1;
                if(next < len){
                    if(line.charAt(i + 1) == '\"'){
                        left = next + 1;
                    } else {
                        left = i;
                    }
                }
            } else if((i == len - 1 || c == ';') && !key.isEmpty()){
                //如果前面是"
                String val = "";
                if(line.charAt(i - 1) == '"'){
                    val = line.substring(left, i - 1);
                } else {
                    val = line.substring(left, i);
                }
                if(key.equalsIgnoreCase("name")){
                    formDataKeys[0] = val;
                } else {
                    formDataKeys[1] = val;
                }
                left = -1;
                key = "";
            }
            i++;
        }
    }

//    private String[] getFormDataKV(String str) {
//        int eq = str.indexOf("=");
//        String left = str.substring(0, eq);
//        String right = str.substring(eq + 1);
//        int first = right.indexOf("\"");
//        int last = right.lastIndexOf("\"");
//        String key = right.substring(first + 1, last);
//        return new String[]{left, key};
//    }

//    private void decodeFormDataOnce() throws IOException {
////        ByteArrayBuffer byteArrayBuffer = new ByteArrayBuffer();
////        byteArrayBuffer.
//        ByteArrayOutputStream byteArrayOutputStream;
////        ByteArrayInputStream byteArrayInputStream =new ByteArrayInputStream();
////        byteArrayInputStream.
////        byteArrayOutputStream.toByteArray()
//        if (temp == null) {
//            temp = new FormDataTemp();
//        }
//        if (body == null) {
//            body = o();
//        }
//        if (temp.start == null) {
//            String ctype = getContentType();
//            int idex = ctype.indexOf("boundary=");
//            if (idex == -1) {
//                return;
//            }
//            String token = ctype.substring(idex + 9);
//            temp.start = ("--" + token);
//            temp.end = ("--" + token + "--");
//            temp.limit = ("\r\n" + temp.start).getBytes();
//            temp.step = FormDataStep.WAIT_FOR_START;
//        }
//        if (temp.step != FormDataStep.WAIT_FOR_READ_VALUE) {
//            String line = null;
//            scan:
//            while ((line = buffer.readLineStr()) != null) {
//                switch (temp.step) {
//                    case WAIT_FOR_START:
//                        if (line.equals(temp.start)) {
//                            temp.step = FormDataStep.WAIT_FOR_READ_PROPERTY;
//                        } else if (line.equals(temp.end)) {
//                            return;
//                        }
//                        break;
//
//                    case WAIT_FOR_READ_PROPERTY:
//                        if (line.isEmpty()) {
//                            temp.step = FormDataStep.WAIT_FOR_READ_VALUE;
//                            break scan;
//                        }
//                        //todo: 需要解析不正确的情况, 增加容错处理
//                        String[] Json = line.split("; ");
//                        for (int i = 0; i < Json.length; i++) {
//                            if (i > 0) {
//                                String[] strs = getFormDataKV(Json[i]);
//                                switch (strs[0]) {
//                                    case "name":
//                                        temp.name = strs[1];
//                                        break;
//
//                                    case "filename":
//                                        File file = File.createTempFile("nami", "nami");
//                                        temp.file = new MultipartFile(strs[1], file, true);
//                                        temp.tempOs = new FileOutputStream(file);
//                                        break;
//                                }
//                            }
//                        }
//                        break;
//
//                    case WAIT_FOR_END:
//                        if (line.equals(temp.end)) {
//                            temp.step = FormDataStep.WAIT_FOR_START;
//                        }
//                        break;
//                }
//            }
//        } else {
//            //读取value
//            if (temp.tempOs == null) {
//                temp.tempOs = new ByteArrayOutputStream();
//            }
//            int i = buffer.indexOf(temp.limit);
//            if (i > -1) {
//                byte[] bs = buffer.readNBytes(i);
//                if (bs != null) {
//                    temp.tempOs.write(bs);
//                }
//                if (temp.tempOs instanceof ByteArrayOutputStream) {
//                    ((Obj) body).put(temp.name, ((ByteArrayOutputStream) temp.tempOs).toString(StandardCharsets.UTF_8.name()));
//                } else if (temp.tempOs instanceof FileOutputStream) {
//                    ((Obj) body).put(temp.name, temp.file);
//                }
//                buffer.readNBytes(2);
//                temp.release();
//            } else {
//                byte[] bs = buffer.readBytes();
//                if (bs != null) {
//                    temp.tempOs.write(bs);
//                }
//            }
//        }
//
//    }


    int getContentLength() {
        return headers.i("Content-Length", headers.i("content-length", 0));
    }

    String getContentType() {
        return getHeader("Content-Type");
    }


    void decodeHeaders() throws IOException {
        String line;
        while((line = is.readLine()) != null){
            if(line.isEmpty()){
                break;
            }
            decodeHeader(line);
        }
//        String[] lines = Util.splitToArray(headers, CRLF);
//        for (String line : lines) {
//            decodeHeader(line);
//        }
        phase = AnalyzePhase.DECODING_BODY;
        params.putAll(query);
//                if (method == Method.HEAD || method == Method.GET || method == Method.OPTIONS) {
//                    return;
//                }
    }

    private void decodeHeader(String line) {
//        var i = line.lastIndexOf("\r\n");
//        if(i > -1){
//            line = line.substring(0, i);
//        }
        if (null == method) {
            String[] Json = line.split("\\s+");
            if (Json.length < 3) {
                throw new RuntimeException();
            }
            method = Request.Method.valueOf(Json[0]);
            version = Json[2];
            decodePath(Json[1]);
        } else {
            int comma = line.indexOf(":");
            String key = line.substring(0, comma);
            String value;
            if (line.charAt(comma + 1) == ' ') {
                value = line.substring(comma + 2);
            } else {
                value = line.substring(comma + 1);
            }
            headers.put(key, value);
            if (key.equalsIgnoreCase("Cookie")) {
                decodeCookies(value);
            }
        }
    }

    /**
     * cookie解析器
     */
    private void decodeCookies(String value) {
        if (value.length() == 0) {
            return;
        }
        try {
            value = URLDecoder.decode(value, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e) {
        }
        String[] Json = Util.splitToArray(value, "; ");//value.split("; ");
        for (String s : Json) {
            int i = s.indexOf("=");
            if (i > -1) {
                cookie.set(s.substring(0, i), s.substring(i + 1), false);
            }
        }

    }


    /**
     * 无脑取值
     *
     * @param name
     * @param type
     * @return
     */
    public <T> T getParam(String name, Class<T> type) {
        try {
            Object value = params.get(name, type);
            if (value != null && type.isAssignableFrom(value.getClass())) {
                return (T) value;
            } else if(type.getName().startsWith("java.")){
                return (T) value;
            }
            throw new RuntimeException();
        } catch (Exception e) {
            try {
                return (T) params.to(type);
            } catch (Exception ee) {
            }
        }
        return null;
    }

    /**
     * 得到单一的header
     * 如果取不到的话，则用小写重新取
     *
     * @param key
     * @return
     */
    public String getHeader(String key) {
        String val = headers.s(key, "");
        if (val.isEmpty()) {
            val = headers.s(key.toLowerCase(), "");
        }
        return val;
    }


}
