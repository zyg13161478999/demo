package com.restructure.demo.utils;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/**
 * @author .gang
 * @date 2022/5/24
 */
public class DESEncrypt {
    public static void main(String args[]) {
        //要加密的明文
        String codeStringBegin = "Tomcat";
        //加密后的密文
        String codeStringEnd = null;
        //密文解密后得到的明文
        String decodeString = null;
        //加密算法类型，可设置为DES、DESede、AES等字符串
        String cipherType = "DESede";
        try {
            //获取密钥生成器
            KeyGenerator keyGen = KeyGenerator.getInstance(cipherType);
            //初始化密钥生成器，不同的加密算法其密钥长度可能不同
            keyGen.init(112);
            //生成密钥
            SecretKey key = keyGen.generateKey();

            //得到密钥字节码
            byte[] keyByte = key.getEncoded();
            //输出密钥的字节码
            System.out.println("密钥是：");
            for (int i = 0; i < keyByte.length; i++) {
                System.out.print(keyByte[i] + ",");
            }
            System.out.println("");
            //创建密码器
            Cipher cp = Cipher.getInstance(cipherType);
            //初始化密码器
            cp.init(Cipher.ENCRYPT_MODE, key);
            System.out.println("要加密的字符串是：" + codeStringBegin);
            byte[] codeStringByte = codeStringBegin.getBytes("UTF8");
            System.out.println("要加密的字符串对应的字节码是：");
            for (int i = 0; i < codeStringByte.length; i++) {
                System.out.print(codeStringByte[i] + ",");
            }
            System.out.println("");
            //开始加密
            byte[] codeStringByteEnd = cp.doFinal(codeStringByte);
            System.out.println("加密后的字符串对应的字节码是：");
            for (int i = 0; i < codeStringByteEnd.length; i++) {
                System.out.print(codeStringByteEnd[i] + ",");
            }
            System.out.println("");
            codeStringEnd = new String(codeStringByteEnd);
            System.out.println("加密后的字符串是：" + codeStringEnd);
            System.out.println("");
            //重新初始化密码器
            cp.init(Cipher.DECRYPT_MODE, key);
            //开始解密
            byte[] decodeStringByteEnd = cp.doFinal(codeStringByteEnd);
            System.out.println("解密后的字符串对应的字节码是：");
            for (int i = 0; i < decodeStringByteEnd.length; i++) {
                System.out.print(decodeStringByteEnd[i] + ",");
            }
            System.out.println("");
            decodeString = new String(decodeStringByteEnd);
            System.out.println("解密后的字符串是：" + decodeString);
            System.out.println("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

