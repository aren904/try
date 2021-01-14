package process;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Process {
    //java启动脚本
    public static void main(String[] args) throws IOException {

        String exec = ProcessTest.exec("\"D:\\WeChat\\WeChat.exe");
        System.out.println(exec);
//        Runtime.getRuntime().exec("D:\\WeChat\\WeChat.exe");

    }
}
