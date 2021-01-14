package springbootest.testboot.t;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service(value ="testSchedule")

public class testSchedule {

    @Scheduled(cron = "3 * * * * ?")
    public void test4() {
        System.out.println(System.currentTimeMillis());
    }

    @Async
    public void test1()  {
        System.out.println("任务一开始"+System.currentTimeMillis());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("任务一结束");
    }
    @Async
    public void test2()  {
        System.out.println("任务二开始"+System .currentTimeMillis());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("任务二结束");
    }
}

