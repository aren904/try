package Properties;

import java.io.*;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.stream.Collectors;

//使用properties类进行持久化操作
//关于类名.class.getResource()方法和 类名.class.getClassLoader().getResource()方法的获取相对路径文件的demo
public class RestoreByProperty {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("aren", "sb");
        properties.put("afei", "aaaa");
        properties.put("yekai", "sb");
        //第一种方法
//        try {
//            FileWriter fileWriter = new FileWriter("D:\\AllMyCode\\TrySomeThing\\src\\存文件\\file1.txt");
//            properties.store(fileWriter, "hhhhhh");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //第二种方法
        InputStream resourceAsStream = RestoreByProperty.class.getClassLoader().getResourceAsStream("file1.txt");
        String filepath = RestoreByProperty.class.getClassLoader().getResource("file1.txt").getFile();
        System.out.println(RestoreByProperty.class.getClassLoader().getResource("file1.txt"));
        System.out.println(resourceAsStream);
        try {
            FileWriter sad = new FileWriter(filepath);
        } catch (IOException e) {
            e.printStackTrace();
        }
            if (resourceAsStream != null) {
                try {
                    properties.load(resourceAsStream);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(properties.getProperty("aren"));
            }
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println(RestoreByProperty.class.getResource(""));
        System.out.println(RestoreByProperty.class.getResource("/"));
        System.out.println("***************************************************************");
        System.out.println(RestoreByProperty.class.getClassLoader().getResource(""));
        System.out.println(RestoreByProperty.class.getClassLoader().getResource("/"));
        System.out.println("***************************************************************");

//                properties.store(sad, "www");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
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

