package com.aren.cache.Mapper;

import com.aren.cache.bean.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: try
 * @Package: com.aren.cache.Mapper
 * @ClassName: EmployeeMapper
 * @Author: zxcdr
 * @Description:
 * @Date: 2020/12/27 22:53
 * @Version: 1.0
 */
@Repository
public interface EmployeeMapper {
    @Select("SELECT * FROM employee WHERE id=#{id}")
    public Employee getEmployeeById(Integer id);

    @Update("update employee set lastName=#{lastName},email=#{email},gender=#{gender},d_id=#{dId} where id=#{id}")
    public void updateEmployee(Employee employee);

    @Delete("delete from employee where id=#{id}")
    public void deleteEmployee(Integer id);

    @Insert("insert into employee(lastName,email,gender,d_id) values(#{lastName},#{email},#{gender},#{lastName})")
    public void insertEmployee(Employee employee);

    @Select("SELECT * FROM employee WHERE lastName=#{lastName}")
    public Employee getEmployeeByLastName(String lastName);
}
