package com.springboot.jpa.demo.pojo;

import lombok.Data;
import org.hibernate.annotations.Proxy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @ProjectName: try
 * @Package: com.springboot.jpa.demo.pojo
 * @ClassName: Teacher
 * @Author: zxcdr
 * @Description:
 * @Date: 2021/1/12 14:52
 * @Version: 1.0
 */
@Entity

public class Teacher {
     @Id
     @GeneratedValue
     private  Integer id;
     private  String name;

     public Integer getId() {
          return id;
     }

     @Override
     public String toString() {
          return "Teacher{" +
                  "id=" + id +
                  ", name='" + name + '\'' +
                  '}';
     }

     public void setId(Integer id) {
          this.id = id;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public Teacher(Integer id, String name) {
          this.id = id;
          this.name = name;
     }

     public Teacher() {
     }
}
