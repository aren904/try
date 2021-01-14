package com.aren.cache.Controller;

import com.aren.cache.Service.EmployeeService;
import com.aren.cache.bean.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ProjectName: try
 * @Package: com.aren.cache.Controller
 * @ClassName: EmployeeController
 * @Author: zxcdr
 * @Description:
 * @Date: 2020/12/27 23:27
 * @Version: 1.0
 */

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;


    @GetMapping("/emp/{id}")
    public Employee getEmployee(@PathVariable("id") Integer id) {
        return employeeService.getEmployee(id);
    }

    @GetMapping("/emp")
    public Employee updateEmployee(Employee employee) {
        return employeeService.updateEmployee(employee);
    }

    @GetMapping("/emp/delete/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id) {
        employeeService.deleteEmployee(id);
        return "success";
    }
    @GetMapping("/emp/lastName/{lastName}")
    public Employee getEmployeeByLastName(@PathVariable("lastName") String lastName){
        return employeeService.getEmployeeByLastName(lastName);
    }

}
