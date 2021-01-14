package springbootest.testboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import springbootest.testboot.t.testSchedule;

@SpringBootApplication
@EnableScheduling
@EnableAsync
public class TestbootApplication {

    public static void main(String[] args) {
    SpringApplication.run(TestbootApplication.class, args);
    }
}
