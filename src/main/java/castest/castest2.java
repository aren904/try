package castest;

import java.util.concurrent.atomic.AtomicInteger;
//使用atomicInteger实现cas，不会出现一个数据被多个线程读取到
import static java.lang.System.out;

public class castest2 {
static AtomicInteger num=new AtomicInteger(0);

    public static void main(String[] args) {
        for(int a=0;a<3;a++){
            Thread t=new Thread(new Runnable() {
                @Override

                public void run() {
                    synchronized (casTest.class){
                        while(num.get()<1000) {
                            out.println("threadName:" + Thread.currentThread().getName() + ":" + num.incrementAndGet());
                        }
                    }

                }
            });
            t.start();
        }
    }
}

