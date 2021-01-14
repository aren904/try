package Time;

import java.util.Date;

/**
 * @ProjectName: try
 * @Package: Time
 * @ClassName: dateutil_Test
 * @Author: zxcdr
 * @Description: dateutil测试类
 * @Date: 2020/12/16 9:21
 * @Version: 1.0
 */
public class dateutil_Test {
    public static void main(String[] args) {
        Date date = DateUtil.addDateOneDay(new Date());
        System.out.println(date);
    }
}
