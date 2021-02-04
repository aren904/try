package com.aren.trytry.Service.ServiceImpl;

import com.aren.trytry.Dao.PeopleDao;
import com.aren.trytry.PoJo.People;
import com.aren.trytry.Service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
public class PeopleServiceImpl implements PeopleService {
     @Autowired
    PeopleDao peopleDao;


    @Override
    public List<People> searchPeopleById(Integer id) {
        List<People> people = peopleDao.searchPeopleById(id);
        return people;
    }
}
