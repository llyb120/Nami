package com.github.llyb120.nami.util;

import java.io.*;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;


/**
 * util包下所有代码基本源于 https://github.com/looly/hutool
 * 官网 https://www.hutool.cn/
 */
public class Util {

    public static boolean isBlankChar(char c) {
        return isBlankChar((int) c);
    }

    public static boolean isBlankChar(int c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c) || c == '\ufeff' || c == '\u202a';
    }

    public static boolean isLetterUpper(final char ch) {
        return ch >= 'A' && ch <= 'Z';
    }

    public static boolean isEmpty(CharSequence str) {
        return str == null || str.length() == 0;
    }

    public static boolean isNotEmpty(CharSequence str) {
        return !isEmpty(str);
    }

    public static boolean isEmptyIfStr(Object obj) {
        if (null == obj) {
            return true;
        } else if (obj instanceof CharSequence) {
            return 0 == ((CharSequence) obj).length();
        }
        return false;
    }

    public static boolean isBlankIfStr(Object obj) {
        if (null == obj) {
            return true;
        } else if (obj instanceof CharSequence) {
            return isBlank((CharSequence) obj);
        }
        return false;

    }

    public static boolean isBlank(CharSequence str) {
        int length;

        if ((str == null) || ((length = str.length()) == 0)) {
            return true;
        }

        for (int i = 0; i < length; i++) {
            // 只要有一个非空字符即为非空字符串
            if (false == isBlankChar(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * 关闭<br>
     * 关闭失败不会抛出异常
     *
     * @param closeable 被关闭的对象
     */
    public static void close(Closeable closeable) {
        if (null != closeable) {
            try {
                closeable.close();
            } catch (Exception e) {
                // 静默关闭
            }
        }
    }

    /**
     * 关闭<br>
     * 关闭失败不会抛出异常
     *
     * @param closeable 被关闭的对象
     */
    public static void close(AutoCloseable closeable) {
        if (null != closeable) {
            try {
                closeable.close();
            } catch (Exception e) {
                // 静默关闭
            }
        }
    }

    public static void closeIfPosible(Object object){
        if(object instanceof Closeable){
            close((Closeable) object);
        }
        else if(object instanceof AutoCloseable){
            close((AutoCloseable) object);
        }
    }


    public static List<String> readLines(String path){
        List<String> ret = new ArrayList<>();
        try(
                BufferedReader reader = new BufferedReader(new FileReader(path));
        ) {
            String line;
            while((line = reader.readLine()) != null){
                ret.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ret;
    }


    public static String readString(File file){
        byte[] bs = readBytes(file);
        if (bs == null) {
            return "";
        }
        return new String(bs);
    }

    public static byte[] readBytes(InputStream is){
        FastByteArrayOutputStream bos = new FastByteArrayOutputStream();
        copy(is, bos);
        return bos.toByteArray();
    }

    public static byte[] readBytes(File file){
        byte[] bs = new byte[(int) file.length()];
        try(
                InputStream reader = new BufferedInputStream(new FileInputStream(file));
        ){
            int n = reader.read(bs);
            if(n != file.length()){
                throw new RuntimeException();
            }
            return bs;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 将下划线方式命名的字符串转换为驼峰式。如果转换前的下划线大写方式命名的字符串为空，则返回空字符串。<br>
     * 例如：hello_world=》helloWorld
     *
     * @param name 转换前的下划线大写方式命名的字符串
     * @return 转换后的驼峰式命名的字符串
     */
    public static String toCamelCase(CharSequence name) {
        if (null == name) {
            return null;
        }
        String name2 = name.toString();
        if (name2.contains("_")) {
            final StringBuilder sb = new StringBuilder(name2.length());
            boolean upperCase = false;
            for (int i = 0; i < name2.length(); i++) {
                char c = name2.charAt(i);

                if (c == '_') {
                    upperCase = true;
                } else if (upperCase) {
                    sb.append(Character.toUpperCase(c));
                    upperCase = false;
                } else {
                    sb.append(Character.toLowerCase(c));
                }
            }
            return sb.toString();
        } else {
            return name2;
        }

    }


    private static List<String> split(String str, char c, boolean trim){
        int i = 0;
        int len = str.length();
        List<String> ret = new ArrayList<>();
        while(i < len){
            int idex = str.indexOf(c, i);
            if(idex == -1){
                break;
            }
            String sub = str.substring(i, idex);
            if(trim){
                sub = sub.trim();
            }
            ret.add(sub);
            i = idex + 1;
        }
        return ret;
    }

    public static List<String> split(String str, String c, boolean trim){
        int i = 0;
        int len = str.length();
        int step = c.length();
        List<String> ret = new ArrayList<>();
        while(i < len){
            int idex = str.indexOf(c, i);
            if(idex == -1){
                idex = len;
            }
            String sub = str.substring(i, idex);
            if(trim){
                sub = sub.trim();
            }
            ret.add(sub);
            i = idex + step;
        }
        return ret;
    }

    public static String[] splitToArray(String str, String c){
        return split(str, c, false).toArray(new String[0]);
    }

    public static String[] splitToArray(String str, char c){
        return split(str, c, false).toArray(new String[0]);
    }

    public static List<String> splitTrim(String str, char c){
        return split(str, c, true);
    }

    public static int[] splitToInt(String str, char c){
        List<Integer> list = split(str, c, true)
                .stream()
                .map(e -> {
                    try{
                        return Integer.parseInt(e);
                    } catch (RuntimeException ee){
                        return 0;
                    }
                })
                .collect(Collectors.toList());
        int[] ret = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ret[i] = list.get(i);
        }
        return ret;
    }

    /**
     * 将一个时间格式化为yyyy-MM-dd hh:mm:ss的格式
     * @param date
     * @return
     */
    public static String formatDateTime(Date date){
        LocalDateTime dateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        return dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public static String fastSimpleUUID(){
        final Random ng = ThreadLocalRandom.current();
        byte[] randomBytes = new byte[16];
        ng.nextBytes(randomBytes);
        randomBytes[6] &= 0x0f; /* clear version */
        randomBytes[6] |= 0x40; /* set to version 4 */
        randomBytes[8] &= 0x3f; /* clear variant */
        randomBytes[8] |= 0x80; /* set to IETF variant */

        long msb = 0;
        long lsb = 0;
        for (int i = 0; i < 8; i++) {
            msb = (msb << 8) | (randomBytes[i] & 0xff);
        }
        for (int i = 8; i < 16; i++) {
            lsb = (lsb << 8) | (randomBytes[i] & 0xff);
        }
        return new UUID(msb, lsb).toString();
    }


    public static long copy(InputStream is, OutputStream os){
        byte[] buffer = new byte[4096];
        long total = 0;
        int n;
        try {
            while ((n = is.read(buffer)) > 0) {
                os.write(buffer, 0, n);
                total += n;
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return total;
    }

    public static long copy(ReadableByteChannel is, WritableByteChannel os){
        return copy(Channels.newInputStream(is), Channels.newOutputStream(os));
    }

    /**
     * 序列化<br>
     * 对象必须实现Serializable接口
     *
     * @param <T> 对象类型
     * @param obj 要被序列化的对象
     * @return 序列化后的字节码
     */
    public static <T> byte[] serialize(T obj) {
        if (null == obj || false == (obj instanceof Serializable)) {
            return null;
        }

        FastByteArrayOutputStream byteOut = new FastByteArrayOutputStream();
        try (
                ObjectOutputStream oos = new ObjectOutputStream(byteOut);
                ){
            oos.writeObject(obj);
            oos.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return byteOut.toByteArray();
    }


    /**
     * 反序列化<br>
     * 对象必须实现Serializable接口
     *
     * @param <T> 对象类型
     * @param bytes 反序列化的字节码
     * @return 反序列化后的对象
     */
    @SuppressWarnings("unchecked")
    public static <T> T unserialize(byte[] bytes) {
        ObjectInputStream ois = null;
        try {
            ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
            ois = new ObjectInputStream(bais);
            return (T) ois.readObject();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static String md5(String dataStr) {
        try {
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(dataStr.getBytes(StandardCharsets.UTF_8));
            byte s[] = m.digest();
            String result = "";
            for (int i = 0; i < s.length; i++) {
                result += Integer.toHexString((0x000000FF & s[i]) | 0xFFFFFF00).substring(6);
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
