package Asynchronized.main;

/**
 * @ProjectName: try
 * @Package: Asynchronized.main
 * @ClassName: DoSomethingImpl5
 * @Author: zxcdr
 * @Description: 实现类
 * @Date: 2020/12/23 9:58
 * @Version: 1.0
 */
public class DoSomethingImpl5 implements DoSomething {
    @Override
    public String thing() {
        load();
        return "dosomething5 end";
    }
}