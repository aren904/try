package BatTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ProjectName: try
 * @Package: BatTest
 * @ClassName: FileRestore
 * @Author: zxcdr
 * @Description:
 * @Date: 2021/1/13 17:38
 * @Version: 1.0
 */
public class FileRestore {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\zxcdr\\Desktop\\学习笔记\\bat脚本学习\\start2.bat");
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String str = "@echo off\n" +
                "\n" +
                "start/d \"C:\\Users\\zxcdr\\AppData\\Local\\Google\\Chrome\\Application\\\" chrome.exe\n";
        byte[] bytes = str.getBytes();
        try {
            if (fileOutputStream != null) {
                fileOutputStream.write(bytes);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
