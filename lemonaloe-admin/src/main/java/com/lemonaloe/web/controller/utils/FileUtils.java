package com.lemonaloe.web.controller.utils;

import java.io.*;

public class FileUtils {

    public static void main(String[] args) {
        File oldDir = new File("E:\\记录.txt");
        File newDir = new File("E:\\记录copyFileEncryption.txt");
        copyFileEncryption(oldDir,newDir);
    }

    /**
     * 复制文件
     * @param oldDir 原来的文件
     * @param newDir 复制到的文件
     */
    public static void copyFile(File oldDir, File newDir) {
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        byte[] b = new byte[1024];
        try {
            // 将要复制文件输入到缓冲输入流
            bufferedInputStream = new BufferedInputStream(new FileInputStream(oldDir));
            // 将复制的文件定义为缓冲输出流
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(newDir));
            // 定义字节数
            int len;
            while ((len = bufferedInputStream.read(b)) > -1) {
                // 写入文件
                bufferedOutputStream.write(b, 0, len);
            }
            //刷新此缓冲输出流
            bufferedOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedInputStream != null) {
                try {
                    // 关闭流
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedOutputStream != null) {
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 复制文件并加密
     * @param oldDir 原来的文件
     * @param newDir 复制到的文件
     */
    public static void copyFileEncryption(File oldDir, File newDir) {
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        byte[] byteArray = new byte[1024];
        try {
            // 将要复制文件输入到缓冲输入流
            bufferedInputStream = new BufferedInputStream(new FileInputStream(oldDir));
            // 将复制的文件定义为缓冲输出流
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(newDir));
            // 定义字节数
            int len;
            while ((len = bufferedInputStream.read(byteArray)) > -1) {

                for (int number =0 ;number <byteArray.length;number++){
                    byteArray[number] = (byte) (byteArray[number]+805);
                }
                // 写入文件
                bufferedOutputStream.write(byteArray, 0, len);
            }
            //刷新此缓冲输出流
            bufferedOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedInputStream != null) {
                try {
                    // 关闭流
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedOutputStream != null) {
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }



    /**
     * 复制文件并解密
     * @param oldDir 原来的文件
     * @param newDir 复制到的文件
     */
    public static void copyFileDecrypt(File oldDir, File newDir) {
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        byte[] byteArray = new byte[1024];
        try {
            // 将要复制文件输入到缓冲输入流
            bufferedInputStream = new BufferedInputStream(new FileInputStream(oldDir));
            // 将复制的文件定义为缓冲输出流
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(newDir));
            // 定义字节数
            int len;
            while ((len = bufferedInputStream.read(byteArray)) > -1) {

                for (int number =0 ;number <byteArray.length;number++){
                    byteArray[number] = (byte) (byteArray[number]-805);
                }
                // 写入文件
                bufferedOutputStream.write(byteArray, 0, len);
            }
            //刷新此缓冲输出流
            bufferedOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedInputStream != null) {
                try {
                    // 关闭流
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedOutputStream != null) {
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
