package androidutils.sunjianchao.com.library;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by sunjianchao on 18/6/12.
 */
public class ThreadPoolUtil {

    private static ExecutorService threadPool;

    private static final int POOL_SIZE = 10;

    private ThreadPoolUtil() {
        threadPool = Executors.newFixedThreadPool(POOL_SIZE);
    }

    private static ThreadPoolUtil threadPoolUtil = new ThreadPoolUtil();

    public static ThreadPoolUtil getInstance() {
        if (threadPool == null || threadPool.isShutdown()) {
            threadPool = Executors.newFixedThreadPool(POOL_SIZE);
        }
        return threadPoolUtil;
    }

    public void execute(Runnable task) {
        threadPool.execute(task);
    }

    public void shutdown() {
        if (threadPool != null && !threadPool.isShutdown()) {
            threadPool.shutdownNow();
        }
    }
}
