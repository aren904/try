package IoreadAndWrite;

import java.io.*;

public class IoRead {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\zxcdr\\Desktop\\tools\\Typora");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String str = null;
            try {
                while ((str = bufferedReader.readLine()) != null)
                    System.out.println(str);
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
