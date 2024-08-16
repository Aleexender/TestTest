import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        // 1. ExecutorService 생성: 고정된 스레드 풀 크기 3
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // 2. 작업 제출 (Runnable 인터페이스를 사용하는 방법)
        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            executorService.submit(() -> {
                System.out.println("Task " + taskId + " is running on thread " + Thread.currentThread().getName());
                try {
                    // 각 작업을 2초 동안 실행
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Task " + taskId + " was interrupted.");
                }
                System.out.println("Task " + taskId + " completed.");
            });
        }

        // 3. 더 이상 새로운 작업을 받지 않도록 종료
        executorService.shutdown();

        try {
            // 모든 작업이 끝날 때까지 기다림
            if (!executorService.awaitTermination(10, TimeUnit.SECONDS)) {
                executorService.shutdownNow(); // 강제 종료
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }

        System.out.println("All tasks are finished.");
    }
}
