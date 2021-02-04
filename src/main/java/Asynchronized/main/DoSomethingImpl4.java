package Asynchronized.main;

/**
 * @ProjectName: try
 * @Package: Asynchronized.main
 * @ClassName: DoSomethingImpl4
 * @Author: zxcdr
 * @Description: 实现类
 * @Date: 2020/12/23 9:57
 * @Version: 1.0
 */

public class DoSomethingImpl4 implements DoSomething {
    @Override
    public String thing() {
        load();
        return "dosomething4 end";
    }
}