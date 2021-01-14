package iotest;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class iotest {
    public static void main(String[] args) throws IOException {

        String filename = "C:\\Users\\zxcdr\\Desktop\\学习笔记\\bat脚本学习\\start.bat";
        File file = new File("C:\\Users\\zxcdr\\Desktop\\学习笔记\\bat脚本学习\\start.bat");
        //1.使用管道去读取文件内容
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String re;
        while ((re=bufferedReader.readLine())!=null){
            System.out.println(re);
        }

//        -----------------------------------------------------------------------

//        2.Files.lines (Java 8)读取可以全部读取

//        Stream<String> lines = Files.lines(Paths.get(filename));
//        lines.forEach(www -> System.out.println(www));
//-----------------------------------------------------------
//         3.Files.readAllLines
//        List<String> lines1 = Files.readAllLines(Paths.get(filename));
//        lines1.forEach(System.out::println);

    }
}
