package Asynchronized.MethodTest;

import Asynchronized.main.*;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @ProjectName: try
 * @Package: Asynchronized.MethodTest
 * @ClassName: testSync
 * @Author: zxcdr
 * @Description: 同步执行
 * @Date: 2020/12/23 10:26
 * @Version: 1.0
 */

public class testSync {
public static void main(String[]args){
        long start = System.currentTimeMillis();
        List<DoSomething> remoteLoaders = Arrays.asList( new DoSomethingImpl1(),new DoSomethingImpl1(),new DoSomethingImpl2(),new DoSomethingImpl4(),new DoSomethingImpl5());
        List<String> customerDetail = remoteLoaders.stream().map(DoSomething::thing).collect(toList());
        System.out.println(customerDetail);
        long end = System.currentTimeMillis();
        System.out.println("总共花费时间:" + (end - start));
        }
        }
