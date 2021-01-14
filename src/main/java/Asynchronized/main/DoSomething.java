package Asynchronized.main;

/**
 * @ProjectName: try
 * @Package: Asynchronized
 * @ClassName: DoSomething
 * @Author: zxcdr
 * @Description: 接口类
 * @Date: 2020/12/23 9:33
 * @Version: 1.0
 */
public interface DoSomething {

    String thing();

   default void load(){
        try {
            Thread.sleep(1000L);
            System.out.println("load is finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
