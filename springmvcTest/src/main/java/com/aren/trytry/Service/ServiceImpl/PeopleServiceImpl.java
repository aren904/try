package com.aren.trytry.Service.ServiceImpl;

import com.aren.trytry.Dao.PeopleDao;
import com.aren.trytry.PoJo.People;
import com.aren.trytry.Service.PeopleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ProjectName: trytry
 * @Package: com.aren.trytry.Service.ServiceImpl
 * @ClassName: PeopleServiceImpl
 * @Author: zxcdr
 * @Description:
 * @Date: 2021/2/3 19:34
 * @Version: 1.0
 */
@Service
@Transactional
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@Slf4j
public class PeopleServiceImpl implements PeopleService {
     @Autowired
    PeopleDao peopleDao;


    @Override
    public List<People> searchPeopleById(Integer id) {
        List<People> people = peopleDao.searchPeopleById(id);
        log.debug("people="+people);
        log.info("people="+people);
        log.warn("people="+people);
        log.error("people="+people);
        return people;
    }

    @Override
    @Transactional
    public int addPeople(List<People> people) {
//       peopleDao.addPeople(people);
        errorTest();
       return peopleDao.addPeople(people);
    }

    public void errorTest(){
        try {
            throw new Exception("error-");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
