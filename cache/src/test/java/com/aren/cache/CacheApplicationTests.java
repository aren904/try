package com.aren.cache;

import com.aren.cache.Mapper.EmployeeMapper;
import com.aren.cache.bean.Employee;
import com.aren.cache.config.MyRedisConfig;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.CacheManager;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class CacheApplicationTests {

    @Autowired
    StringRedisTemplate stringRedisTemplate;//操作字符串的

    @Autowired
    RedisTemplate redisTemplate;//k-v都是对象的


//    @Autowired
//    RedisTemplate<Object,Employee> employeeRedisTemplate;

    @Autowired
    RedisTemplate<String, Object> employeeRedisTemplate;

    /**
     * Redis常见的五大数据类型
     * StringRedisTemplate.opsForValue（）【字符串】
     * StringRedisTemplate.opsForList（）【list（列表）】
     * stringRedisTemplate.opsForSet（）【set（集合）】
     * stringRedisTemplate.opsForHash（）【Hash（）】
     * stringRedisTemplate.opsForZSet（）【有序集合】
     */

    @Autowired
    EmployeeMapper employeeMapper;



    @Test
    public void test() {
        Employee employeeById = employeeMapper.getEmployeeById(1);
        System.out.println(employeeById);
    }


    @Test
    public void test1() {
//        stringRedisTemplate.opsForValue().append("msg", "hello");
//        String msg = stringRedisTemplate.opsForValue().get("msg");
//        System.out.println(msg);

        Employee employeeById = employeeMapper.getEmployeeById(1);
        //默认如果保存对象，使用jdk序列化机制，序列化后的数据保存到redis中
        redisTemplate.opsForValue().set("emp-01",employeeById);
        //1.将数据以json的方式保存
//        自己将会对象转为json
//        （2）redisTemplate默认的序列化规则

    }
    @Test
    public void test2() {
        Employee employeeById = employeeMapper.getEmployeeById(2);
        employeeRedisTemplate.opsForValue().set("emp-01",employeeById);



    }
}