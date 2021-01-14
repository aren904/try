package ThreadAndRunnable;

/**
 * @ProjectName: try
 * @Package: ThreadAndRunnable
 * @ClassName: thread1
 * @Author: zxcdr
 * @Description: 继承thread线程是资源不共享的
 * @Date: 2020/12/15 8:45
 * @Version: 1.0
 */
public class thread1 extends Thread {
    int num = 10;

    @Override
    public void run() {
        for (num = 10; num > 0; num--) {
            System.out.println(Thread.currentThread().getName() + ":" + num);
        }
    }

    public static void main(String[] args) {
        thread1 thread1 = new thread1();
        thread1 thread2 = new thread1();
        thread2.start();
        thread1.start();
    }
}
