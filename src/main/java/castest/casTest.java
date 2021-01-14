package castest;

import static java.lang.System.*;

//方法一在业务逻辑上加上synchronized关键字
public class casTest {
    static Integer num=0;

    public static void main(String[] args) {
        for(int a=0;a<3;a++){
            Thread t=new Thread(new Runnable() {
                @Override

                public void run() {
                    synchronized (casTest.class){
                        while(num<1000) {
                            out.println("threadName:" + Thread.currentThread().getName() + ":" + num++);
                        }
                    }

                }
            });
            t.start();
        }
    }
}
