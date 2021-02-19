package completableFutureApi;

import java.util.concurrent.*;
import java.util.function.Supplier;

/**
 * @ProjectName: try
 * @Package: completableFutureApi
 * @ClassName: ThenRun
 * @Author: zxcdr
 * @Description: 基于thenRun实现的异步任务A，执行完毕后激活异步任务B执行，需要注意的是，之中方式及活泼的异步任务B是拿不到任务A的执行结果的
 * @Date: 2021/2/18 23:28
 * @Version: 1.0
 */
public class ThenRun {

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
        CompletableFuture twoFuture = oneFuture.thenRun(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
                System.out.println("---after OneFuture is over doSomeThing---");
            }
        });

        System.out.println(twoFuture.get());


    }

}
