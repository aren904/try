package springbootest.testboot.Async;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.redis.AutoConfigureDataRedis;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service(value = "testAsync")

public class TestAsync {
//    定时两种写法cron表达式，和fixedDelay

//     @Scheduled(fixedDelay = 1000)
       @Scheduled(cron = "*/1 * * * * ?")
    public void test4() {
        System.out.println(System.currentTimeMillis());
    }
    @Async
    public void test1() throws InterruptedException {
        System.out.println("test1开始");
        System.out.println("test1"+System.currentTimeMillis());

            Thread.sleep(2000);

        System.out.println("test1"+System.currentTimeMillis());
    }

    @Async
    public void test2() throws InterruptedException {
        System.out.println("test2开始");
        System.out.println("test2"+System.currentTimeMillis());

            Thread.sleep(2000);


        System.out.println("test2"+System.currentTimeMillis());
    }
}
