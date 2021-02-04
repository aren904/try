package ThreadTest;

/**
 * @ProjectName: try
 * @Package: ThreadTest
 * @ClassName: TestSync
 * @Author: zxcdr
 * @Description:
 * @Date: 2021/1/31 23:08
 * @Version: 1.0
 */
public class TestSync {
        private int num = 0;
        public void test() {
            for (int i = 0; i < 1000; i++) {
                synchronized (this) {
                    System.out.println("Thread:" + Thread.currentThread().getId() + ",num = " + num++);
                }
            }
        }
}
