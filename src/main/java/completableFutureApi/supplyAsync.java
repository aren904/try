package completableFutureApi;


import java.util.concurrent.*;
import java.util.function.Supplier;

/**
 * @ProjectName: try
 * @Package: completableFutureApi
 * @ClassName: supplyAsync
 * @Author: zxcdr
 * @Description:
 * @Date: 2021/2/18 22:15
 * @Version: 1.0
 */
public class supplyAsync {
    private static final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(8,8,1, TimeUnit.MINUTES,new LinkedBlockingDeque<>(10));
    public static void main(String[] args) {
//        try {
//            runAsync();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }
        threadPoolExecutor.execute(() -> {
            try {
                SupplyAsync();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });
    }

    public static void SupplyAsync() throws InterruptedException, ExecutionException {
        CompletableFuture future = CompletableFuture.supplyAsync(new Supplier<String>() {
            @Override
            public String get() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return "hello";
            }
        });
        System.out.println(future.get());
    }

}
