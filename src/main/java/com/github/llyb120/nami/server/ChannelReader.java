//package com.github.llyb120.nami.server;
//import cn.hutool.core.io.FastByteBuffer;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.LinkedList;
//
//
//public class ChannelReader {
//    private InputStream is;
//    private boolean isEOF = false;
//    private LinkedList<byte[]> bytes = new LinkedList();
//    private int bufSize = 1024;
//    private StringBuilder sb = new StringBuilder();
//
//    public ChannelReader(InputStream is){
//        this.is = is;
//    }
//
//    public void readLine(){
//        //如果缓冲池里有结余的
//        if(!bytes.isEmpty()){
//            var ti = 0;
//            var tj = 0;
//            for (int i = 0; i < bytes.length(); i++) {
//                ti = i;
//                var bs = bytes.g(i);
//                for (int i1 = 0; i1 < bs.length; i1++) {
//                    tj = i1;
//                    switch (bs[i1]){
//                        case '\r':
//                            break;
//                        case '\n':
//                            break;
//                    }
//                }
//            }
//            var bslen = (ti + 1) * bufSize + tj;
//            var bs = new byte[bslen];
//            for (int i = 0; i < ti; i++) {
//                System.arraycopy();
//            }
//        }
//    }
//
//    private byte[] readBuf() {
//        var bs = new byte[1024];
//        int n = 0;
//        try {
//            n = is.read(bs);
//            if(n <= 0){
//                isEOF = true;
//                return null;
//            } else{
//                return bs;
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//            isEOF = false;
//        }
//        return null;
//    }
//}
