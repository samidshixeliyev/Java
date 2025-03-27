package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskExample {
    public static void main(String[] args) {
        // ExecutorService ilə Task yaradılır
        ExecutorService executorService = Executors.newFixedThreadPool(2); // 2 thread-li bir pool

        // Task 1
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Task 1 yerinə yetirilir...");
            }
        });

        // Task 2
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Task 2 yerinə yetirilir...");
            }
        });

        // Executor-i dayandırırıq
        executorService.shutdown();
    }
}
