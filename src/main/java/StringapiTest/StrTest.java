package StringapiTest;

import org.junit.Test;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;

public class StrTest {
    static String log = "hello,everyone i am Mr.Xu \"i am so (glad) to (be) here to discuss with you";

    @Test
    public void testIndex() {
        int i = log.indexOf("hello,everyone");
        int m = log.indexOf("\"", i + 20);
        System.out.println(log);
        System.out.println(m);
        System.out.println(i);
        String name = log.substring(i + 20, m).trim();
        System.out.println(name);
        String op = log.substring(log.indexOf("(", 45) + 1, log.indexOf(")", 42)).trim();
        System.out.println(op);
        String substring = log.substring(1, 5);
        System.out.println(substring);
        int i1 = log.indexOf("(", 20);
        System.out.println(i1);
    }

    @Test
    public void testReplace() {
        String aa = null;
        aa = "asdfgg";
        String replace = aa.replace("asd", "hello");
        System.out.println(replace);
    }

    @Test
    public void test1() {
        StringBuffer stringBuffer = new StringBuffer();
        String aa = "qwer";
        for (char a : aa.toCharArray()) {
            stringBuffer.append(a);
            stringBuffer.append(",");
        }
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);

        System.out.println(stringBuffer);

    }

    @Test
    public void test33() {
        String logs = "hello,my \"Mr liu\"";
        int index = logs.indexOf("\"", logs.indexOf("Mr"));
        int i = logs.indexOf("\"", logs.indexOf("hel"))+1;
        System.out.println(index);
        System.out.println(i);
        String hhh=logs.substring(i,index);
        System.out.println(hhh);
    }
}
