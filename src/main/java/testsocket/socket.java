package testsocket;


import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
//同时启动两个类去测通信，如果想测本地ip则host改为127.0.0.1
public class socket {
    public static void main(String[] args) {
        try {
            //其中host为想通信ip 8888为端口（此处8888端口未被占用）
            Socket s = new Socket("127.0.0.1",1231);
//            Socket s = new Socket("127.0.0.1",8888);

            //构建IO
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
            //向服务器端发送一条消息
            bw.write("测试客户端和服务器通信，服务器接收到消息返回到客户端\n");
            bw.flush();

            //读取服务器返回的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
            System.out.println("服务器："+mess);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

