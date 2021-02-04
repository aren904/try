package FutureTask;

/**
 * @ProjectName: try
 * @Package: FutureTask
 * @ClassName: AsyncFutureExample
 * @Author: zxcdr
 * @Description:
 * @Date: 2021/2/2 14:23
 * @Version: 1.0
 */
public class AsyncFutureExample {
    public static String doSomethingA() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("---doSomeThingA----");
        return "TaskAResult";
    }


        public static String doSomethingB() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("---doSomeThingB----");
        return "TaskBResult";
    }
}
