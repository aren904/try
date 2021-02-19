package com.aren.trytry.testProperty;

import lombok.Data;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: trytry
 * @Package: com.aren.trytry.testProperty
 * @ClassName: tt
 * @Author: zxcdr
 * @Description: 单独一个读取配置文件的demo，与三层架构无关，可知如果springboot中的yml中有同样的people配置优先读取application.yml或者application.properties中的配置再次读取@PropertySource中的
 * @Description:配置
 * @Date: 2021/2/4 9:40
 * @Version: 1.0
 */
@Component
@PropertySource("classpath:ooo.properties")
public class testProperty {
    @Value("${people.name}")
    public String name;
     @Value("${people.age}")
    public Integer age;

    @Override
    public String toString() {
        return "tt{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
