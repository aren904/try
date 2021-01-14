package fastJsonTest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.HashMap;

public class fastjsontest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("hello", "yes");
        map.put("op", "hang");
        String st = "{\'name\':\'Tim\',\'age\':\'25\',\'sex\':\'male\'}";
        String ll = "{'key1':'value1','key2':[{'kk2':'op','kk4':'09'}],'key3':'value3'}";
        JSONObject parse =  JSONObject.parseObject(ll);
        System.out.println(parse);
        JSONArray major = parse.getJSONArray("key2");
        System.out.println(major);
        for (Object  o: major){
            JSONObject jsonObject = JSONObject.parseObject(o.toString());
            System.out.println(jsonObject.getString("kk4"));
        }
    }
}
