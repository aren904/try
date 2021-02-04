package com.aren.trytry;

import com.aren.trytry.Dao.PeopleDao;
import com.aren.trytry.PoJo.People;
import com.aren.trytry.testProperty.tt;
import com.oracle.webservices.internal.api.message.PropertySet.Property;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.omg.CORBA.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

@SpringBootTest

class TrytryApplicationTests {
    @Autowired
    PeopleDao peopleDao;

    @Autowired
    tt t;
    @Test
    void contextLoads() {
    }


    @Test
    public void test() {
        List<People> people = peopleDao.searchPeopleById(1);
        System.out.println(people);
    }

    @Test
    public void testSearch() {
        System.out.println(t.age);
    }
}
