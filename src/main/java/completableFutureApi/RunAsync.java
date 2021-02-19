package completableFutureApi;

import java.util.concurrent.*;

/**
 * @ProjectName: try
 * @Package: completableFuture
 * @ClassName: RunAsync
 * @Author: zxcdr
 * @Description: runAsync方法实现无返回值的异步计算；当你想异步执行一个任务，并且不需要返回执行结果时可以使用该方法，比如异步打日志，异步做消息通知,也可以用自定义线程启动
 * @Date: 2021/2/18 19:41
 * @Version: 1.0
 */
public class RunAsync {
    private static final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(8, 8, 1, TimeUnit.MINUTES, new LinkedBlockingDeque<>(10));

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
                runAsync();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });
    }

    public static void runAsync() throws InterruptedException, ExecutionException {
        CompletableFuture future = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("over");
            }
        }, threadPoolExecutor);
        System.out.println(future.get());
//        System.out.println(Thread.currentThread().getName());
    }
}
