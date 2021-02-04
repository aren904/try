package Asynchronized.MethodTest;

import Asynchronized.main.*;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

/**
 * @ProjectName: try
 * @Package: Asynchronized.MethodTest
 * @ClassName: testSuperCompleteFutureTask
 * @Author: zxcdr
 * @Description: 升级completeFutureTask
 * @Date: 2020/12/23 10:15
 * @Version: 1.0
 */
public class testSuperCompleteFutureTask {
    public static void main(String[] args) {
        Long start=System.currentTimeMillis();
        List<DoSomething> doSomethings = Arrays.asList(new DoSomethingImpl1(), new DoSomethingImpl2(), new DoSomethingImpl3(), new DoSomethingImpl4(), new DoSomethingImpl5());
        List<CompletableFuture<String>> completableFutures = doSomethings.stream().map(doSomething -> CompletableFuture.supplyAsync(doSomething::thing)).collect(Collectors.toList());
        List<String> list = completableFutures.stream().map(CompletableFuture::join).collect(Collectors.toList());
        System.out.println(list);
        long end=System.currentTimeMillis();
        System.out.println("总共花费时间："+(end-start));
    }
}
