package Stream;

/**
 * @ProjectName: try
 * @Package: Stream
 * @ClassName: Duck
 * @Author: zxcdr
 * @Description:
 * @Date: 2021/2/3 9:08
 * @Version: 1.0
 */
public class Duck implements animal {

//    @Override
//    public void eat() {
//        System.out.println("Duck are full");
//        System.out.println(System.currentTimeMillis());
//    }

    @Override
    public String test() {
       this.eat();
       return "Duck are full";

    }
}
