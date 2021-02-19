package Stream;

/**
 * @ProjectName: try
 * @Package: Stream
 * @ClassName: animal
 * @Author: zxcdr
 * @Description:
 * @Date: 2021/2/3 9:06
 * @Version: 1.0
 */
public interface animal {

   String test();

     default void eat() {
        System.out.println("animals are full");
         try {
             Thread.sleep(1000L);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         System.out.println(System.currentTimeMillis());
    }
}
