package com.aren.cache.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @ProjectName: try
 * @Package: com.aren.cache.bean
 * @ClassName: gggg
 * @Author: zxcdr
 * @Description:
 * @Date: 2021/1/6 11:01
 * @Version: 1.0
 */
public class gggg {
    public static void main(String[] args) {
        InputStream resourceAsStream = gggg.class.getClassLoader().getResourceAsStream("aaaa.txt");
        Properties properties = new Properties();
        try {
            properties.load(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String qwe = properties.getProperty("qwe");
        System.out.println(qwe);
    }
}
