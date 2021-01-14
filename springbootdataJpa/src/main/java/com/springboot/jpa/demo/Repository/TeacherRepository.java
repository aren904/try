package com.springboot.jpa.demo.Repository;

import com.springboot.jpa.demo.pojo.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @ProjectName: try
 * @Package: com.springboot.jpa.demo.Repository
 * @ClassName: TeacherRepository
 * @Author: zxcdr
 * @Description:
 * @Date: 2021/1/12 14:53
 * @Version: 1.0
 */
@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Integer> {
}
