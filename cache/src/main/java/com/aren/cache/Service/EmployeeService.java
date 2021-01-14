package com.aren.cache.Service;

import com.aren.cache.Mapper.EmployeeMapper;
import com.aren.cache.bean.Employee;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: try
 * @Package: com.aren.cache.Service
 * @ClassName: EmployeeService
 * @Author: zxcdr
 * @Description: CacheManager管理多个cache组件，对缓存的真正crud操作在cache组件中，每一个缓存都有自己唯一的名字
 * cacheName/value：指定缓存组件的名字
 * key：缓存数据使用的key：可以用它来指定，默认是使用方法的参数 1-方法的返回值
 * 编写spEl：#id；参数id的值 #a0  #p #root。args【0】
 * keyGenerator：key的生成器，可以自己指定key的生成件组件id
 * key/keyGenerator：二选一使用
 * CacheManager： 指定缓存管理器：或者cacheResolver指定获取解析器
 * condition：指定符合条件的情况下缓存：
 * unless:否定缓存，当unless指定的条件下为true，方法的返回值就不会被缓存，可以获取到结果进行判断
 * unless="#result ==null"
 * sync: 是否使用一异步模式
 * <p>
 * 原理：自动配置类：CacheConfiguration
 * 缓存的配置类
 * *   org.springframework.boot.autoconfigure.cache.GenericCacheConfiguration
 * *   org.springframework.boot.autoconfigure.cache.JCacheCacheConfiguration
 * *   org.springframework.boot.autoconfigure.cache.EhCacheCacheConfiguration
 * *   org.springframework.boot.autoconfigure.cache.HazelcastCacheConfiguration
 * *   org.springframework.boot.autoconfigure.cache.InfinispanCacheConfiguration
 * *   org.springframework.boot.autoconfigure.cache.CouchbaseCacheConfiguration
 * *   org.springframework.boot.autoconfigure.cache.RedisCacheConfiguration
 * *   org.springframework.boot.autoconfigure.cache.CaffeineCacheConfiguration
 * *   org.springframework.boot.autoconfigure.cache.GuavaCacheConfiguration
 * *   org.springframework.boot.autoconfigure.cache.SimpleCacheConfiguration【默认】
 * *   org.springframework.boot.autoconfigure.cache.NoOpCacheConfiguration
 * 3.SimpleCacheConfiguration：
 * 4.给容器中注册一个CacheManager：ConcurrentMapCacheManager
 * 5.可以获取和创建ConcurrentMapCache类型的缓存组件：他的作用是将数据保存在ConcurrentMap中
 * 6运行流程
 * @Cacheable： 1.方法运行之前先去查询Cache（缓存组件），按找cacheName指定的名字获取；
 * （CacheManager先获取相应的缓存），第一次获取缓存如果没有就会自动创建
 * 2.去Cache中查找缓存的内容，使用一个key，莫仍就是方法的参数
 * key是按找某种策略生成的，默认使用simpleKeyGenerator生成key
 * <p>
 * simpleKeyGenerator的默认生成策略：
 * 如果没有参数：key=new SimpleKey();
 * 如果有一个参数key=参数的值
 * 如果有多个参数：key=new SimpleKey(params)
 * 3.没有查找到缓存就调用吧目标方法，放进缓存中
 * 4.将目标方法的返回的结果放进缓存中
 * @Cacheable标注的方法执行之前检查缓存中有没有这个数据，默认按找参数的值去
 * @Date: 2020/12/27 23:24
 * @Version: 1.0
 */
@Service
//可以省略CacheNames和value
@CacheConfig(cacheNames = "emp")

public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;
    // @Cacheable(cacheNames = {"emp"},key="#root.methodName+'['+#id+']'")
    // 或者自定义一个key生成器
    // @Cacheable(cacheNames = {"emp"}, keyGenerator = "myKeyGenerator", condition = "#a0>0")
    // 一旦生效再次查询就不会再进这个方法
    @Cacheable(cacheNames = "emp", key = "#id")
    public Employee getEmployee(Integer id) {
        System.out.println("查询" + id + "号员工资料");
        Employee employeeById = employeeMapper.getEmployeeById(id);
        return employeeById;
    }


    /**
     * @CachePut 即调用方法又更新缓存：
     * 修改数据库的某个数据，同时更新缓存
     * 运行时机：先调用目标方法
     * 将目标方法缓存
     * <p>
     * 测试步骤：
     * 查询一号员工，将查到的结果放到缓存里面
     * key：1 value：lastName：张三
     * <p>
     * 2.以后查询还是之前的结果
     * 3.更新1号员工：【lastName：aren；gender：0】
     * 将方法的返回值也放进缓存了
     * key：传入的employee对象值，返回的employee对象
     * key = "#employee.id"
     * key = "#result.id"
     * <p>
     * 注意@Cacheable是不能用result
     * <p>
     * 4.查询一号员工？
     * 应该是更新后的员工
     * 为什么是没更新前的员工
     */
    @CachePut(value = "emp", key = "#employee.id")
    public Employee updateEmployee(Employee employee) {
        System.out.println("update" + employee + "success");
        employeeMapper.updateEmployee(employee);
        return employee;
    }


    /**
     * @CacheEvict 清除缓存
     * @CacheEvict(value = "emp", allEntries=true)也可以全部删除缓存
     * allEntries=true  全部删除缓存
     * beforeInvocation=false 缓存的清除是否在方法之前执行
     * 默认代表缓存清除操作是在方法执行之后执行，如果出现异常缓存就不会清除
     *
     * beforeInvocation=true
     * 代表清除缓存操作时在方法运行前执行，无论方法是否出现异常缓存都会被清除
     */
    @CacheEvict(value = "emp", key = "#id", beforeInvocation = true)
    public void deleteEmployee(Integer id) {
        System.out.println("删除employee" + id);
//        employeeMapper.deleteEmployee(id);
        int i = 10 / 0;
    }

    /**
     * @param lastName
     * @return
     * @Caching() 定义复杂的缓存规则
     */


    @Caching(
            cacheable = {
                    @Cacheable(value = "emp", key = "#lastName")
            },
            put = {
                    @CachePut(value = "emp", key = "#result.id"),
                    @CachePut(value = "emp", key = "#result.email")
            }
    )
    public Employee getEmployeeByLastName(String lastName) {
        System.out.println("lastName" + lastName);
        Employee employeeByLatName = employeeMapper.getEmployeeByLastName(lastName);
        return employeeByLatName;
    }

}