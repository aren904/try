package Time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @ProjectName: try
 * @Package: Time
 * @ClassName: calendarTest
 * @Author: zxcdr
 * @Description:
 * @Date: 2020/12/16 9:25
 * @Version: 1.0
 */
public class calendarTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
//        calendar.getTime();
//        String str="1608082251458";
//        calendarTest calendarTest = new calendarTest();
//        String date = calendarTest.method1(str);
//        System.out.println(date);
//        System.out.println(calendarTest.getCurrentDate());
//        System.out.println(calendar);
//        System.out.println(calendar.get(Calendar.DAY_OF_WEEK)-1);
//        int day_of_week = calendar.get(Calendar.DAY_OF_WEEK) - 1;
//        if (day_of_week == 0)
//            day_of_week = 7;
//        calendar.add(Calendar.DATE, -day_of_week + 1);
//        calendar.setTime(new Date());
//        System.out.println(calendar.getTime());
        System.out.println(calendar);
    }

    public static String method1(String timestamp) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:sss");
        String date = null;
        long st=Long.parseLong(String.valueOf(timestamp));
        Date date1 = new Date(st);
        date = simpleDateFormat.format(date1);
        return date;
    }

    public String getCurrentDate(){
        long l = System.currentTimeMillis();
        Date date1 = new Date(l);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date1);
        return format;
    }
}
