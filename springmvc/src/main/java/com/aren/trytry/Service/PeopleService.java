package com.aren.trytry.Service;

import com.aren.trytry.PoJo.People;

import java.util.List;

/**
 * @ProjectName: trytry
 * @Package: com.aren.trytry.Service
 * @ClassName: PeopleService
 * @Author: zxcdr
 * @Description:
 * @Date: 2021/2/3 19:33
 * @Version: 1.0
 */
public interface PeopleService {
    List<People> searchPeopleById(Integer id);
}
