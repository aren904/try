package completableFutureApi;

import java.util.concurrent.*;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @ProjectName: try
 * @Package: completableFutureApi
 * @ClassName: ThenApply
 * @Author: zxcdr
 * @Description:
 * @Date: 2021/2/19 8:48
 * @Version: 1.0
 */
public class ThenApply {

    private final static ThreadPoolExecutor threadpoolexecutor = new ThreadPoolExecutor(8, 8, 1, TimeUnit.MINUTES, new LinkedBlockingDeque<>(10));

    public static void main(String[] args) {
        threadpoolexecutor.execute(() -> {
            try {
                ThenRun();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });
    }

    public static void ThenRun() throws InterruptedException, ExecutionException {
        CompletableFuture<String> oneFuture = CompletableFuture.supplyAsync(new Supplier<String>() {
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
        CompletableFuture<String> twoFuture = oneFuture.thenApply(new Function<String, String>() {
            @Override
            public String apply(String t) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return t + "jiduo" ;
            }
        });

        System.out.println(twoFuture.get());


    }

}
