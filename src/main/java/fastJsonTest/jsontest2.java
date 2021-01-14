package fastJsonTest;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class jsontest2 {
    public static void main(String[] args) {
        Map<String, Object> Map = new HashMap<>();
        Map.put("qwe", "asd");
        Map.put("zxc", "vbn");
        String s = new JSONObject(Map).toString();
        System.out.println(s);
    }
}
