package Asynchronized.main;

import Asynchronized.main.DoSomething;

/**
 * @ProjectName: try
 * @Package: Asynchronized
 * @ClassName: DoSomethingImpl3
 * @Author: zxcdr
 * @Description: 接口实现类
 * @Date: 2020/12/23 9:37
 * @Version: 1.0
 */
public class DoSomethingImpl3 implements DoSomething {
    @Override
    public String thing() {
        load();
        return "dosomething3 end";
    }
}