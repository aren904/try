package ThreadAndRunnable;

import org.junit.runner.RunWith;

/**
 * @ProjectName: try
 * @Package: ThreadAndRunnable
 * @ClassName: runnable1
 * @Author: zxcdr
 * @Description: 实现runnable接口是资源共享的
 * @Date: 2020/12/15 8:57
 * @Version: 1.0
 */
public class runnable1 implements Runnable {
    int num=10;
    @Override
    public void run() {
        for (num=10;num>0;num--){
            System.out.println(Thread.currentThread().getName()+":"+num);
        }
    }


    public static void main(String[] args) {
        runnable1 runnable1 = new runnable1();
        Thread thread = new Thread(runnable1,"1");
        Thread thread1 = new Thread(runnable1, "2");
        thread1.start();
        thread.start();

    }
}
