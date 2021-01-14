package com.springboot.jpa.demo.Controller;

import com.springboot.jpa.demo.Repository.TeacherRepository;
import com.springboot.jpa.demo.pojo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * @ProjectName: try
 * @Package: com.springboot.jpa.demo.Controller
 * @ClassName: TeacherController
 * @Author: zxcdr
 * @Description:
 * @Date: 2021/1/12 14:54
 * @Version: 1.0
 */
@RestController

public class TeacherController {
    @Autowired
    TeacherRepository teacherRepository;

    @RequestMapping("/teacher/{id}")
    public String testMethod(@PathVariable Integer id) {
        Object o = teacherRepository.findById(id).get();
        return o.toString();
    }
}
