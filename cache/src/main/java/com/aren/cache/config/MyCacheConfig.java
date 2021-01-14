package com.aren.cache.config;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @ProjectName: try
 * @Package: com.aren.cache.config
 * @ClassName: MyCacheConfig
 * @Author: zxcdr
 * @Description: 自定义key生成器
 * @Date: 2020/12/29 1:18
 * @Version: 1.0
 */
@Configuration
public class MyCacheConfig {

    @Bean("myKeyGenerator")
    public KeyGenerator keyGenerator() {

        return new KeyGenerator() {
            @Override
            public Object generate(Object target, Method method, Object... params) {
                return method.getName() + "[" + Arrays.asList(params).toString() + "]";
            }
        };
    }
}
