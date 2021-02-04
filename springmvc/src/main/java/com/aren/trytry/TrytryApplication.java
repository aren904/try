package com.aren.trytry;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jmx.export.annotation.ManagedOperation;

@SpringBootApplication
@MapperScan(basePackages = "com.aren.trytry.Dao")
public class TrytryApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrytryApplication.class, args);
    }

}
