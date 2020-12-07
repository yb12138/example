package com.heeexy.example.winit.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {


    /**
     * 取得字符串的摘要信息
     *
     * @param input
     * @return
     */
    public static String getMd5(String input) {
        byte[] out = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(input.getBytes("UTF-8"));
            out = md.digest();
        } catch (NoSuchAlgorithmException e) {
            return null;
        } catch (UnsupportedEncodingException e) {
            return null;
        }
        return toHexString(out);
    }

    /**
     * 转换成16进制
     *
     * @param out
     * @return
     */
    private static String toHexString(byte[] out) {
        StringBuffer buf = new StringBuffer();
        for (byte b : out) {
            buf.append(String.format("%02X", b));
        }
        return buf.toString();
    }

}
