package okHTTPUtilTest;



import okhttp3.OkHttpClient;

import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        OkHttpApi okHttpApi = new OkHttpApi();
//        调用毒鸡汤api
        String run = okHttpApi.run("https://du.shadiao.app/api.php");
//        随便输入一个请求直接获得html内容然后可以转化成json进行解析
        String run1 = okHttpApi.run("https://baijiahao.baidu.com/s?id=1685739068234560437&wfr=spider&for=pc");
        System.out.println(run1);
        System.out.println(run);

    }
}
