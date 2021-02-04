package Stream;

/**
 * @ProjectName: try
 * @Package: Stream
 * @ClassName: mouse
 * @Author: zxcdr
 * @Description:
 * @Date: 2021/2/3 10:35
 * @Version: 1.0
 */
public class mouse implements animal {
    @Override
    public String test() {
        this.eat();
        return "mouse are full";

    }
}
