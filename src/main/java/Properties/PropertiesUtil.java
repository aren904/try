package Properties;

/**
 * @ProjectName: try
 * @Package: Properties
 * @ClassName: PropertiesUtil
 * @Author: zxcdr
 * @Description:
 * @Date: 2020/12/17 11:08
 * @Version: 1.0
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Objects;
import java.util.Properties;
//注意事项:必须要在Resource目录下有这个文件 最终在target目录下的class目录下找到
public class PropertiesUtil {
    public static final Properties P = new Properties();
    private static final String PATH = "123.properties";

    public static Integer get(String key) {
        read();
        return Integer.parseInt(P.getProperty(key));
    }

    public static void remove(String key) {
        read();
        P.remove(key);
        write();
    }

    public static void update(String key, String value) {
        read();
        P.setProperty(key, value);
        write();
    }

    private static void read() {
        InputStream in = null;
        try {
            in = PropertiesUtil.class.getClassLoader().getResourceAsStream(PATH);
            P.load(in);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void write(){
        FileOutputStream fos = null;
        try {
            URL url = Objects.requireNonNull(PropertiesUtil.class.getClassLoader().getResource(PATH));
            fos = new FileOutputStream(url.getFile());
            P.store(fos,"");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

