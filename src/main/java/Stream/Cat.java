package Stream;

/**
 * @ProjectName: try
 * @Package: Stream
 * @ClassName: Cat
 * @Author: zxcdr
 * @Description:
 * @Date: 2021/2/3 9:09
 * @Version: 1.0
 */
public class Cat implements animal {

    @Override
    public String test() {
        eat();
        return  "Cat is Full";
    }

}
