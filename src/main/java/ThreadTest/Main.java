package ThreadTest;

/**
 * @ProjectName: try
 * @Package: ThreadTest
 * @ClassName: Main
 * @Author: zxcdr
 * @Description:
 * @Date: 2021/1/31 23:11
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        TestSync testSync = new TestSync();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                testSync.test();
            }
        });
        Thread t2 = new Thread(() -> testSync.test());
        t1.start();
        t2.start();
    }
}
