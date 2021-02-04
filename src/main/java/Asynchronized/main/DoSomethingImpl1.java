package Asynchronized.main;

import Asynchronized.main.DoSomething;

/**
 * @ProjectName: try
 * @Package: Asynchronized
 * @ClassName: DoSomethingImpl
 * @Author: zxcdr
 * @Description: 接口实现类
 * @Date: 2020/12/23 9:35
 * @Version: 1.0
 */
public class DoSomethingImpl1 implements DoSomething {

    @Override
    public String thing() {
        this.load();
        return "dosomething1 end";
    }
}
