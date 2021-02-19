package com.aren.trytry.Controller;

import com.aren.trytry.PoJo.People;
import com.aren.trytry.Service.PeopleService;
import com.aren.trytry.Service.ServiceImpl.PeopleServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ProjectName: trytry
 * @Package: com.aren.trytry.Controller
 * @ClassName: TestPropertiesController
 * @Author: zxcdr
 * @Description:
 * @Date: 2021/2/3 19:22
 * @Version: 1.0
 */
@Controller
@RequestMapping("/test")
@Slf4j
public class TestPropertiesController {
@Autowired
PeopleService peopleService;

@ResponseBody
@RequestMapping("/search/{id}")
    public List<People> testProperties(@PathVariable("id") Integer id){
    return peopleService.searchPeopleById(id);
    }
}
