package okHTTPUtilTest;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Objects;

//封装一个httputil工具类，使用httputil去完成，导入okhttp对应的maven
public class OkHttpApi {
    OkHttpClient client = new OkHttpClient();

   public  String run(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return Objects.requireNonNull(response.body()).string();
        }
    }
}
