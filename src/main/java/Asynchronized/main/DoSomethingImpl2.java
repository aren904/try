package Asynchronized.main;

import Asynchronized.main.DoSomething;

/**
 * @ProjectName: try
 * @Package: Asynchronized
 * @ClassName: DoSomething2
 * @Author: zxcdr
 * @Description: 接口实现类
 * @Date: 2020/12/23 9:36
 * @Version: 1.0
 */
public class DoSomethingImpl2 implements DoSomething {
    @Override
    public String thing() {
        load();
     return    "dosomething2 end";
    }
}
