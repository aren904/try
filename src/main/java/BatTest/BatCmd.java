package BatTest;

import java.io.IOException;

/**
 * @ProjectName: try
 * @Package: PACKAGE_NAME
 * @ClassName: BatCmd
 * @Author: zxcdr
 * @Description:
 * @Date: 2021/1/13 17:34
 * @Version: 1.0
 */

public class BatCmd {
    public static void main(String[] args) {
        try {
            Process exec = Runtime.getRuntime().exec("C:\\Users\\zxcdr\\Desktop\\学习笔记\\bat脚本学习\\start2.bat");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
