package IoreadAndWrite;

import java.io.*;

public class IoWrite {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\zxcdr\\Desktop\\tools\\Typora");

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            String str ="hello,This is IoWrite";
            bufferedWriter.write(str );
            for (int i=0;i<10;i++){
                bufferedWriter.write(str );
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
