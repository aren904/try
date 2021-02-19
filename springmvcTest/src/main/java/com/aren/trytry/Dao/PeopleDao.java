package com.aren.trytry.Dao;

import com.aren.trytry.PoJo.People;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ProjectName: trytry
 * @Package: com.aren.trytry.Dao
 * @ClassName: PeopleDao
 * @Author: zxcdr
 * @Description:
 * @Date: 2021/2/3 19:33
 * @Version: 1.0
 */
//@Repository 可有可不有但是一定要有@MapperScan()
@Repository
public interface PeopleDao {

    List<People> searchPeopleById(@Param("id") Integer id);

    int addPeople(List<People> people);
}
