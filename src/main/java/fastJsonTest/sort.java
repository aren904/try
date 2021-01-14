package fastJsonTest;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @ProjectName: try
 * @Package: fastJsonTest
 * @ClassName: sort
 * @Author: zxcdr
 * @Description:集合类型自动排序
 * @Date: 2020/12/28 16:44
 * @Version: 1.0
 */
public class sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(1);
        list.add(6);
        list.add(0);
        list.sort(Integer::compareTo);
        System.out.println(list);

    }
}
