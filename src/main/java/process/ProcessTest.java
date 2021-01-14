package process;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ProjectName: try
 * @Package: process
 * @ClassName: ProcessTest
 * @Author: zxcdr
 * @Description:
 * @Date: 2020/12/30 14:37
 * @Version: 1.0
 */
public class ProcessTest {

    public static String exec(String command) {
        String result = null;
        BufferedReader br = null;
        try {
            java.lang.Process process = Runtime.getRuntime().exec(command);
            String line = null;
            br = new BufferedReader(new InputStreamReader(process.getInputStream()));
            StringBuffer sb = new StringBuffer();
            if ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            result = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }

}
