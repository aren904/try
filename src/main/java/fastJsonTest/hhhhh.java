package fastJsonTest;

import com.alibaba.fastjson.JSONObject;

/**
 * @ProjectName: try
 * @Package: fastJsonTest
 * @ClassName: hhhhh
 * @Author: zxcdr
 * @Description:
 * @Date: 2021/1/5 19:52
 * @Version: 1.0
 */
public class hhhhh {
    public static void main(String[] args) {
        String str = "{\n" +
                "  \"output\": {\n" +
                "    \"Name\": \"197\",\n" +
                "    \"Type\": \"Backup\",\n" +
                "    \"Messages\": \"Standard\",\n" +
                "    \"Storage\": [\n" +
                "      \"StreamerLocalStorage\"\n" +
                "    ],\n" +
                "    \"Pool\": \"pool142\",\n" +
                "    \"Client\": \"Lin197\",\n" +
                "    \"Fileset\": \"StreamerLocalFileset\"\n" +
                "  },\n" +
                "  \"error\": 0\n" +
                "}";
        JSONObject jsb = (JSONObject)JSONObject.parse(str);
        JSONObject output = jsb.getJSONObject("output");
        String storage = output.getString("Storage");
        String storage1 = output.getJSONArray("Storage").getString(0);
        System.out.println(storage1);
        System.out.println(storage);


    }
}
