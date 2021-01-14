package IoreadAndWrite;

import java.io.File;
import java.io.FileOutputStream;

public class fileApi {
    public static void main(String[] args) {
        String filePath="C:\\Users\\zxcdr\\Desktop\\mailalarm\\log4j.properties";
        File file = new File(filePath);
        String fileName=filePath.substring(filePath.lastIndexOf(File.separator)+1);
        System.out.println(fileName);

    }
}
