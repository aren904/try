package FutureTask;

import java.util.concurrent.*;

/**
 * @ProjectName: try
 * @Package: FutureTask
 * @ClassName: FutureTest
 * @Author: zxcdr
 * @Description:
 * @Date: 2021/2/2 14:18
 * @Version: 1.0
 */
public class FutureTest {
    private final static int AVALIABLE_PROCESSORS = Runtime.getRuntime().availableProcessors();
    private final static ThreadPoolExecutor POOL_EXECUTOR = new ThreadPoolExecutor(AVALIABLE_PROCESSORS, AVALIABLE_PROCESSORS * 2, 1, TimeUnit.MINUTES, new LinkedBlockingDeque<>(5), new ThreadPoolExecutor.CallerRunsPolicy());

    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        FutureTask<String> futureTask = new FutureTask<String>(() -> {
            String result = null;

            result =  AsyncFutureExample.doSomethingA();
            return result;
        });

        POOL_EXECUTOR.execute(futureTask);
        String TaskBresult = AsyncFutureExample.doSomethingB();
        try {
            String TaskAResult = futureTask.get();
            System.out.println(TaskAResult+"  "+TaskBresult);
            System.out.println(System.currentTimeMillis()-start);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }



    }
}
