package Asynchronized.MethodTest;


import Asynchronized.main.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * @ProjectName: try
 * @Package: Asynchronized
 * @ClassName: testLambda
 * @Author: zxcdr
 * @Description: lambda并行流执行，Lambda表达式只支持函数式接口 也就是只有一个抽象方法的接口
 * @Date: 2020/12/23 9:38
 * @Version: 1.0
 */
public class testLambda {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<DoSomething> doSomethings = Arrays.asList(new DoSomethingImpl1(), new DoSomethingImpl2(),new DoSomethingImpl3(),new DoSomethingImpl4(),new DoSomethingImpl5());
        List<String> collect = doSomethings.parallelStream().map(DoSomething::thing).collect(toList());
        System.out.println(collect);
        System.out.println("一共执行时间="+(System.currentTimeMillis()-start));
    }
}
