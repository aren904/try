package Agency;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @ProjectName: try
 * @Package: Agency
 * @ClassName: GirlImpl
 * @Author: zxcdr
 * @Description:
 * @Date: 2021/1/19 10:06
 * @Version: 1.0
 */
public class GirlImpl implements Girl {
    @Override
    public void date() {
        System.out.println("dating with you is boring");
    }

    @Override
    public void watchMovie() {
        System.out.println("i don't like this movie");
    }
}
