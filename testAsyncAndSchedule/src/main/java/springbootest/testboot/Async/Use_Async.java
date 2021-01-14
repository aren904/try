package springbootest.testboot.Async;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import springbootest.testboot.Configuration.SpringContextUtil;
import springbootest.testboot.TestbootApplication;
import springbootest.testboot.t.testSchedule;

import javax.annotation.Resource;


public class Use_Async {

    public static void main(String[] args) throws InterruptedException {

        ConfigurableApplicationContext run = SpringApplication.run(TestbootApplication.class,args);
        SpringContextUtil springContextUtil = new SpringContextUtil();
        springContextUtil.setApplicationContext(run);
        TestAsync bean = (TestAsync)SpringContextUtil.getBean("testAsync");
        bean.test1();
        bean.test2();
    }
}

