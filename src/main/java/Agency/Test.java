package Agency;

/**
 * @ProjectName: try
 * @Package: Agency
 * @ClassName: Test
 * @Author: zxcdr
 * @Description:
 * @Date: 2021/1/19 10:21
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Girl girl = new GirlImpl();
        GirlFamily girlFamily = new GirlFamily(girl);
        Girl sister = (Girl)girlFamily.getProxyInstance();
        sister.date();
        System.out.println("------------------------");
        sister.watchMovie();
    }
}
