package springbootest.testboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import springbootest.testboot.Async.TestAsync;
import springbootest.testboot.Configuration.SpringContextUtil;
import springbootest.testboot.t.testSchedule;

import javax.annotation.Resource;

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
public class testSchedule1 {
//    @Autowired
//    SpringContextUtil springContextUtil;
     //对于这块无法一直继续执行，保留疑问
    @Test
    public void test(){
     TestAsync testAsync = (TestAsync)SpringContextUtil.getBean("testAsync");
        testAsync.test4();
    }
}
