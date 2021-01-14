package com.aren.cache.config;

import com.alibaba.fastjson.support.spring.FastJsonRedisSerializer;
import com.aren.cache.bean.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cache.CacheProperties;
import org.springframework.boot.context.properties.bind.UnboundConfigurationPropertiesException;
import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCacheWriter;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.*;

import java.net.UnknownHostException;
import java.time.Duration;

/**
 * @ProjectName: try
 * @Package: com.aren.cache.config
 * @ClassName: MyRedisConfig
 * @Author: zxcdr
 * @Description:
 * @Date: 2021/1/3 22:45
 * @Version: 1.0
 */

@Configuration
public class MyRedisConfig {

//    @Bean
//    public RedisTemplate<Object, Employee> empRedisTemplate(
//            RedisConnectionFactory redisConnectionFactory)
//            throws UnknownHostException {
//        RedisTemplate<Object, Employee> template = new RedisTemplate<Object, Employee>();
//        Jackson2JsonRedisSerializer<Employee> employeeJackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer<Employee>(Employee.class);
//        template.setConnectionFactory(redisConnectionFactory);
//        template.setDefaultSerializer(employeeJackson2JsonRedisSerializer);
//        return template;
//    }


//    @Bean
//    RedisCacheManager cacheManager( RedisConnectionFactory redisConnectionFactory) {
//        // 使用缓存的默认配置
//        RedisCacheConfiguration config = RedisCacheConfiguration.defaultCacheConfig();
//        // 使用 GenericJackson2JsonRedisSerializer 作为序列化器
//        config = config.serializeValuesWith(
//                RedisSerializationContext.SerializationPair.fromSerializer(
//                        new GenericJackson2JsonRedisSerializer()));
//        RedisCacheManager.RedisCacheManagerBuilder builder =
//                RedisCacheManager.builder(redisConnectionFactory).cacheDefaults(config);
//
//        return builder.build();
//    }


    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory factory) {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(factory);
        FastJsonRedisSerializer<Object> serializer = new FastJsonRedisSerializer<>(Object.class);
        template.setDefaultSerializer(serializer);
        template.setKeySerializer(new StringRedisSerializer());
        return template;
    }


    @Bean
    public CacheManager cacheManager(RedisConnectionFactory redisConnectionFactory) {
        //初始化一个RedisCacheWriter
        RedisCacheWriter redisCacheWriter = RedisCacheWriter.nonLockingRedisCacheWriter(redisConnectionFactory);
        //设置CacheManager的值序列化方式为json序列化
        RedisSerializer<Object> jsonSerializer = new GenericJackson2JsonRedisSerializer();
        RedisSerializationContext.SerializationPair<Object> pair = RedisSerializationContext.SerializationPair
                .fromSerializer(jsonSerializer);
        RedisCacheConfiguration defaultCacheConfig = RedisCacheConfiguration.defaultCacheConfig()
                .serializeValuesWith(pair);
        //设置默认超过期时间是30秒
        defaultCacheConfig.entryTtl(Duration.ofSeconds(30));
        //初始化RedisCacheManager
        return new RedisCacheManager(redisCacheWriter, defaultCacheConfig);
    }

}
