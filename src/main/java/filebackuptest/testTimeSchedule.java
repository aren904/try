package filebackuptest;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class testTimeSchedule {
    public static void main(String[] args) {
        List<Integer> dayOfWeekList =new LinkedList<>(); //选中的星期几集合
        dayOfWeekList.add(1);
        dayOfWeekList.add(3);
        dayOfWeekList.add(4);
//        dayOfWeekList.add(5);
        List<List<Integer>> DOWList = new ArrayList<>();
        List<Integer> DOW = new ArrayList<>();

        //分批收集：bacula只支持连续的天数设置，对于不是连续的就要设置成多个Run
        for (Integer DOWInt : dayOfWeekList) {
            if (DOW.size() == 0) {
                DOW.add(0, DOWInt);
            } else if (DOW.size() == 1) {
                if (DOWInt == DOW.get(0) + 1) {
                    DOW.add(1, DOWInt);
                } else {
                    DOWList.add(new ArrayList<>(DOW.subList(0, 1)));
                    DOW.clear();
                    DOW.add(0, DOWInt);
                }
            } else if (DOW.size() == 2) {
                if (DOWInt == DOW.get(1) + 1) {
                    DOW.remove(1);
                    DOW.add(1, DOWInt);
                } else {
                    DOWList.add(new ArrayList<>(DOW.subList(0, 2)));
                    DOW.clear();
                    DOW.add(0, DOWInt);
                }
            }
        }
        DOWList.add(new ArrayList<>(DOW.subList(0, DOW.size())));


        System.out.println(DOW);
        System.out.println(DOWList);


        ArrayList<Object> objects = new ArrayList<>();
        List<Integer> integers = Arrays.asList(0, 2);
        System.out.println(integers);
        System.out.println(dayOfWeekList);
    }


}
