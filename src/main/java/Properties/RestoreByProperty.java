package Properties;

import java.io.*;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.stream.Collectors;

//使用properties类进行持久化操作
public class RestoreByProperty {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("aren", "sb");
        properties.put("afei", "aaaa");
        properties.put("yekai", "sb");
        try {
            FileWriter fileWriter = new FileWriter("D:\\AllMyCode\\try\\存文件\\file.txt");
            properties.store(fileWriter, "hhhhhh");
        } catch (IOException e) {
            e.printStackTrace();
        }
        InputStream resourceAsStream = RestoreByProperty.class.getClassLoader().getResourceAsStream("D:\\AllMyCode\\try\\存文件\\file.txt");
        try {
            FileWriter sad = new FileWriter("D:\\AllMyCode\\try\\存文件\\file.txt");
            if (resourceAsStream != null) {
                properties.load(resourceAsStream);
            }
            properties.store(sad, "asd");
        } catch (IOException e) {
            e.printStackTrace();
        }
//        //-------------------------------------------------读取配置文件信息--------------------------------------------------------\

//            try {
//                properties.load(new FileReader("D:\\AllMyCode\\try\\存文件\\file.txt"));
//            } catch (IOException e1) {
//                e1.printStackTrace();
//            }
//            Set<String> strings = properties.stringPropertyNames();
//            List<String> collect = strings.stream().collect(Collectors.toList());
//            System.out.println(collect);
//            for (String str : strings) {
//                System.out.println(str + ":" + properties.getProperty(str));
//            }
////        -------------------------setProperty 方法会覆盖之前存在的键值对，没有键就添加--------------------
//
//            properties.setProperty("aren", "world");
//            try {
//                FileWriter fileWriter = new FileWriter("D:\\AllMyCode\\try\\存文件\\file.txt");
//                properties.store(fileWriter, "");
//            } catch (IOException e2) {
//                e2.printStackTrace();
//            }


    }
}

