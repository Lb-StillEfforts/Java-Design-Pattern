package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Test01 {

    public static void main(String[] args) {
//        testCachedThreadPool();
//        testFixedThreadPool();
//        testScheduledThreadPool();
        testSingleThreadPool();
    }

    private static void testCachedThreadPool() {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++) {
            /* 如果一个变量在定义时给予初值(可以是常量，可以是变量)，并且不再修改，可视为被final修饰 */
            int temp = i;
            // temp = 3;
            cachedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("threadName is " + Thread.currentThread().getName() + ",i = " + temp);
                }
            });
        }
    }

    private static void testFixedThreadPool() {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            int temp = i;
            fixedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("threadName is " + Thread.currentThread().getName() + ",i = " + temp);
                }
            });
        }
    }

    private static void testScheduledThreadPool() {
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(3);

        for (int i = 0; i < 10; i++) {
            int temp = i;
            scheduledThreadPool.schedule(new Runnable() {
                @Override
                public void run() {
                    System.out.println("threadName is " + Thread.currentThread().getName() + ",i = " + temp);
                }
            }, 3, TimeUnit.SECONDS);
        }

    }

    private static void testSingleThreadPool() {
        ScheduledExecutorService singleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();

        for (int i = 0; i < 10; i++) {
            int temp = i;
            singleThreadScheduledExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("threadName is " + Thread.currentThread().getName() + ",i = " + temp);
                }
            });
        }

        System.out.println("!11");
//        List<Runnable> runnables = singleThreadScheduledExecutor.shutdownNow();
//        System.out.println(runnables);
        System.out.println(Integer.MAX_VALUE);
        singleThreadScheduledExecutor.shutdown();
    }
}
