package com.aren.trytry.PoJo;

import lombok.Data;
import org.springframework.data.annotation.TypeAlias;

/**
 * @ProjectName: trytry
 * @Package: com.aren.trytry.PoJo
 * @ClassName: People
 * @Author: zxcdr
 * @Description:
 * @Date: 2021/2/3 19:29
 * @Version: 1.0
 */
@Data
@TypeAlias("people")
public class People {
    private Integer id;
    private String name;

}
