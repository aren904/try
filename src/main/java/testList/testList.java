package testList;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import jdk.nashorn.internal.ir.CallNode;
import org.omg.PortableInterceptor.INACTIVE;
import sun.rmi.log.LogInputStream;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: try
 * @Package: testList
 * @ClassName: testList
 * @Author: zxcdr
 * @Description:
 * @Date: 2021/1/15 16:26
 * @Version: 1.0
 */
//将不连续的数字分成一个数组
public class testList {
    public static void main(String[] args) {
        List<Integer> hlist=new ArrayList<Integer>();
        hlist.add(1);
        hlist.add(3);
        hlist.add(4);
        hlist.add(6);
        List<Integer> DOW = new ArrayList<>();
        List<List<Integer>> DOWList = new ArrayList<>();

        for (Integer DOWInt : hlist) {
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
        System.out.println(DOWList);
    }





}
