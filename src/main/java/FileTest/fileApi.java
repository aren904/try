package FileTest;

import org.junit.Test;

import java.io.*;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/**
 * @ProjectName: try
 * @Package: FileTest
 * @ClassName: fileApi
 * @Author: zxcdr
 * @Description:
 * @Date: 2021/1/28 19:30
 * @Version: 1.0
 */

public class fileApi {
    @Test
    public void testReadAll() {
        Path path = Paths.get("C:\\Users\\zxcdr\\Desktop\\学习笔记\\123.txt");

        List<String> strings = null;
        try {
            strings = Files.readAllLines(path, Charset.defaultCharset());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(strings);
    }

    @Test
    public void test() {
        Path path = Paths.get("C:\\Users\\zxcdr\\Desktop\\学习笔记\\222.txt");
        try {
            Files.deleteIfExists(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testReadable() {
        Path path = Paths.get("C:\\Users\\zxcdr\\Desktop\\学习笔记\\123.txt");
        boolean readable = Files.isReadable(path);
        System.out.println(readable);
    }

    @Test
    public void test1() {
        Path path = Paths.get("C:\\Users\\zxcdr\\Desktop\\学习笔记\\123.txt");
        try {
            byte[] bytes = Files.readAllBytes(path);
            System.out.println(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void testChannel() {
        File file = new File("C:\\Users\\zxcdr\\Desktop\\学习笔记\\123.txt");
        long len = file.length();
        byte[] ds = new byte[(int) len];

        try {
            MappedByteBuffer mappedByteBuffer = new RandomAccessFile(file, "r")
                    .getChannel()
                    .map(FileChannel.MapMode.READ_ONLY, 0, len);
            for (int offset = 0; offset < len; offset++) {
                byte b = mappedByteBuffer.get();
                ds[offset] = b;
            }

            Scanner scan = new Scanner(new ByteArrayInputStream(ds)).useDelimiter(" ");
            while (scan.hasNext()) {
                System.out.print(scan.next() + " ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}










