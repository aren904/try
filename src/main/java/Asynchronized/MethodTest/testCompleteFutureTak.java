package Asynchronized.MethodTest;

import Asynchronized.main.*;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * @ProjectName: try
 * @Package: Asynchronized.MethodTest
 * @ClassName: testCompleteFutureTak
 * @Author: zxcdr
 * @Description: CompleteFutureTask测试
 * @Date: 2020/12/23 10:00
 * @Version: 1.0
 */
public class testCompleteFutureTak {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<DoSomething> doSomethings = Arrays.asList(new DoSomethingImpl1(), new DoSomethingImpl2(),new DoSomethingImpl3(),new DoSomethingImpl4(),new DoSomethingImpl5());
        List<CompletableFuture<String>> completableFutures = doSomethings.stream().map(DoSomething -> CompletableFuture.supplyAsync(DoSomething::thing)).collect(toList());
        List<String> customerDetail = completableFutures
                .stream()
                .map(CompletableFuture::join)
                .collect(toList());

        System.out.println(customerDetail);
        long end = System.currentTimeMillis();
        System.out.println("总共花费时间:" + (end - start));
    }
}
