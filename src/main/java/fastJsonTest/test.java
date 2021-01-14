package fastJsonTest;

import Stream.User;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ProjectName: try
 * @Package: fastJsonTest
 * @ClassName: test
 * @Author: zxcdr
 * @Description: 对jsonArray进行排序
 * @Date: 2020/12/16 15:34
 * @Version: 1.0
 */
public class test {
    public static void main(String[] args) {
        JSONArray array = new JSONArray();
        ArrayList<User> users = new ArrayList<>();
        User user = new User();
        user.setName("aren");
        user.setAge(18);
        User user2 = new User();
        user2.setAge(14);
        user2.setName("afei");
        array.add(user);
        array.add(user2);
        users.add(user2);
        users.add(user);
        System.out.println(array);
        List<JSONObject> jsonObjects = array.toJavaList(JSONObject.class);
        System.out.println(jsonObjects);
//        =============================对user年龄进行排序========================================
//        List<R> collect = jsonObjects.stream().map(User::getAge).collect(Collectors.toList());

//        List<JSONObject> collect = jsonObjects.stream().sorted(Comparator.comparing(a ->a.)).collect(Collectors.toList());
//        List<User> userList = users.stream().sorted(Comparator.comparing(User::getAge)).collect(Collectors.toList());
        //按找年龄大小对jsonObject进行排序
        List<JSONObject> name = jsonObjects.stream().sorted(Comparator.comparing(a -> a.getDate("age"))).collect(Collectors.toList());
        System.out.println(name);
    }
}
