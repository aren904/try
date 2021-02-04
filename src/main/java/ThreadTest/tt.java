package ThreadTest;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ProjectName: try
 * @Package: ThreadTest
 * @ClassName: tt
 * @Author: zxcdr
 * @Description: AtomicInteger底层实现支持并发可以不用锁
 * @Date: 2021/1/31 23:42
 * @Version: 1.0
 */
public class tt {
    static AtomicInteger num =new AtomicInteger(0);
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                        while(num.get()<1000){
                            System.out.println("Thread:"+ Thread.currentThread().getName()+ " " + num.incrementAndGet());
                        }
                }
            });
            t.start();
        }
    }
}
