package fastJsonTest;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;

import java.util.List;

public class complicatedJsonResolver {
    public static void main(String[] args) {
        // Java里的json数据
        String weather = "{\n" +
                "    \"HeWeather6\": [\n" +
                "        {\n" +
                "            \"basic\": {\n" +
                "                \"cid\": \"CN101010100\",\n" +
                "                \"location\": \"北京\",\n" +
                "                \"parent_city\": \"北京\",\n" +
                "                \"admin_area\": \"北京\",\n" +
                "                \"cnty\": \"中国\",\n" +
                "                \"lat\": \"39.90498734\",\n" +
                "                \"lon\": \"116.40528870\",\n" +
                "                \"tz\": \"8.0\"\n" +
                "            },\n" +
                "            \"daily_forecast\": [\n" +
                "                {\n" +
                "                    \"cond_code_d\": \"103\",\n" +
                "                    \"cond_code_n\": \"101\",\n" +
                "                    \"cond_txt_d\": \"晴间多云\",\n" +
                "                    \"cond_txt_n\": \"多云\",\n" +
                "                    \"date\": \"2017-10-26\",\n" +
                "                    \"hum\": \"57\",\n" +
                "                    \"pcpn\": \"0.0\",\n" +
                "                    \"pop\": \"0\",\n" +
                "                    \"pres\": \"1020\",\n" +
                "                    \"tmp_max\": \"16\",\n" +
                "                    \"tmp_min\": \"8\",\n" +
                "                    \"uv_index\": \"3\",\n" +
                "                    \"vis\": \"16\",\n" +
                "                    \"wind_deg\": \"0\",\n" +
                "                    \"wind_dir\": \"无持续风向\",\n" +
                "                    \"wind_sc\": \"微风\",\n" +
                "                    \"wind_spd\": \"5\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"cond_code_d\": \"101\",\n" +
                "                    \"cond_code_n\": \"501\",\n" +
                "                    \"cond_txt_d\": \"多云\",\n" +
                "                    \"cond_txt_n\": \"雾\",\n" +
                "                    \"date\": \"2017-10-27\",\n" +
                "                    \"hum\": \"56\",\n" +
                "                    \"pcpn\": \"0.0\",\n" +
                "                    \"pop\": \"0\",\n" +
                "                    \"pres\": \"1018\",\n" +
                "                    \"tmp_max\": \"18\",\n" +
                "                    \"tmp_min\": \"9\",\n" +
                "                    \"uv_index\": \"3\",\n" +
                "                    \"vis\": \"20\",\n" +
                "                    \"wind_deg\": \"187\",\n" +
                "                    \"wind_dir\": \"南风\",\n" +
                "                    \"wind_sc\": \"微风\",\n" +
                "                    \"wind_spd\": \"6\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"cond_code_d\": \"101\",\n" +
                "                    \"cond_code_n\": \"101\",\n" +
                "                    \"cond_txt_d\": \"多云\",\n" +
                "                    \"cond_txt_n\": \"多云\",\n" +
                "                    \"date\": \"2017-10-28\",\n" +
                "                    \"hum\": \"26\",\n" +
                "                    \"pcpn\": \"0.0\",\n" +
                "                    \"pop\": \"0\",\n" +
                "                    \"pres\": \"1029\",\n" +
                "                    \"tmp_max\": \"17\",\n" +
                "                    \"tmp_min\": \"5\",\n" +
                "                    \"uv_index\": \"2\",\n" +
                "                    \"vis\": \"20\",\n" +
                "                    \"wind_deg\": \"2\",\n" +
                "                    \"wind_dir\": \"北风\",\n" +
                "                    \"wind_sc\": \"3-4\",\n" +
                "                    \"wind_spd\": \"19\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"status\": \"ok\",\n" +
                "            \"update\": {\n" +
                "                \"loc\": \"2017-10-26 23:09\",\n" +
                "                \"utc\": \"2017-10-26 15:09\"\n" +
                "            }\n" +
                "        }\n" +
                "    ]\n" +
                "}";
//        JSONArray objects = JSONArray.parseArray(weather);
//        System.out.println(objects);
        JSONObject jsonObject = JSONObject.parseObject(weather, Feature.OrderedField);
//        System.out.println(jsonObject);
//        System.out.println(JSONObject.parseArray(weather));
        JSONArray basic = jsonObject.getJSONArray("HeWeather6");
        System.out.println(basic);
        for (Object o : basic) {
            JSONObject parse = (JSONObject) JSONObject.parse(o.toString());
            System.out.println(parse.containsKey("update"));
        }

        JSONObject jsonObject1 = basic.getJSONObject(0);
        JSONArray daily_forecast = jsonObject1.getJSONArray("daily_forecast");
        JSONObject jsonObject2 = daily_forecast.getJSONObject(0);
//        System.out.println(jsonObject1);
//        System.out.println(jsonObject1.get("basic"));
        //将解析后的数据改为有序Feature.OrderedField
//        JSONObject parse = (JSONObject)JSONObject.parse(weather,Feature.OrderedField);
//        System.out.println(parse);
//        System.out.println(jsonObject2);



    }

}
