package Stream;

import Asynchronized.main.*;
import FutureTask.FutureTest;
import sun.java2d.pipe.SpanShapeRenderer;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * @ProjectName: try
 * @Package: Stream
 * @ClassName: Animal_Test
 * @Author: zxcdr
 * @Description:
 * @Date: 2021/2/3 9:10
 * @Version: 1.0
 */
public class Animal_Test {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<animal> animals = Arrays.asList(new Cat(), new Duck(),new snake(),new mouse());
        List<CompletableFuture<String>> collect = animals.stream().map(animal -> CompletableFuture.supplyAsync(animal::test)).collect(Collectors.toList());
        List<String> list = collect.stream().map(CompletableFuture::join).collect(Collectors.toList());
        System.out.println(list);
        long time = System.currentTimeMillis() - start;
        System.out.println("运行时间为" + time + "毫秒");

//        long start = System.currentTimeMillis();
//        List<animal> remoteLoaders = Arrays.asList( new Cat(),new Duck(),new snake(),new mouse());
//        List<String> customerDetail = remoteLoaders.stream().map(animal::test).collect(toList());
//        System.out.println(customerDetail);
//        long end = System.currentTimeMillis();
//        System.out.println("总共花费时间:" + (end - start)+"毫秒");
    }
}
