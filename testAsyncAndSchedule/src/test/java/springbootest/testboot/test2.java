package springbootest.testboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import springbootest.testboot.Async.TestAsync;
import springbootest.testboot.Async.Use_Async;
import springbootest.testboot.Configuration.SpringContextUtil;

@SpringBootTest
public class test2 {

//    @Autowired
//    SpringContextUtil springContextUtil;

//对于这块无法一直继续执行，保留疑问
    @Test
    public void test() throws InterruptedException {

        TestAsync testAsync = (TestAsync) SpringContextUtil.getBean("testAsync");
        testAsync.test1();
        testAsync.test2();
    }
}