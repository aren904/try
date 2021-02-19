package com.aren.trytry;

import com.aren.trytry.Dao.PeopleDao;
import com.aren.trytry.PoJo.People;
import com.aren.trytry.Service.PeopleService;
import com.aren.trytry.testProperty.testProperty;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest

class TestMethod {

    @Autowired
    PeopleDao peopleDao;

    @Autowired
    PeopleService peopleService;
//
    @Autowired
    testProperty testProperty;


    @Test
    public void test() {
//        List<People> people = peopleDao.searchPeopleById(1);
        List<People> people = peopleService.searchPeopleById(1);
        System.out.println(people);
    }

    @Test
    public void testSearch() {
        System.out.println(testProperty.age);
    }


    @Transactional
    @Test
    public void testTransactional() {
        ArrayList<People> people = new ArrayList<>();
        People people1 = new People();
        people1.setId(6);
        people1.setName("lll");
        People people2 = new People();
        people2.setId(7);
        people2.setName("mmm");
        people.add(people2);
        people.add(people1);
        peopleService.addPeople(people);
    }
}
