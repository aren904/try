package springbootest.testboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import springbootest.testboot.Configuration.SpringContextUtil;
import springbootest.testboot.t.testSchedule;

/**
 * @ProjectName: try
 * @Package: springbootest.testboot
 * @ClassName: testSchedule
 * @Author: zxcdr
 * @Description:
 * @Date: 2020/12/25 16:30
 * @Version: 1.0
 */
@SpringBootTest
@EnableScheduling
@EnableAsync
public class testSchedule1 {
    @Autowired
    SpringContextUtil springContextUtil;
    @Test
    public void test(){
        testSchedule testSchedule1 = (testSchedule)springContextUtil.getBean("testSchedule");
        testSchedule1.test4();
    }
}
