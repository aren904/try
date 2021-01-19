package process;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//使用java指令操作应用,别的操作系统应该也可以
public class Process {
    //java启动脚本
    public static void main(String[] args) throws IOException {

        String exec = ProcessTest.exec("\"D:\\WeChat\\WeChat.exe");
        System.out.println(exec);
//        Runtime.getRuntime().exec("D:\\WeChat\\WeChat.exe");

    }
}
