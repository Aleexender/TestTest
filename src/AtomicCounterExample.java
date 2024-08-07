import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounterExample {

    public static void main(String[] args) {
        // Initialize the counter with a value of 0
        AtomicInteger counter = new AtomicInteger(0);

        // Create a fixed thread pool with 10 threads
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        // Submit tasks to the executor service
        for (int i = 0; i < 1000; i++) {
            executorService.submit(new CounterIncrementTask(counter));
        }

        // Shut down the executor service
        executorService.shutdown();
        try {
            executorService.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final counter value
        System.out.println("Final counter value: " + counter.get());
    }

    static class CounterIncrementTask implements Runnable {
        private final AtomicInteger counter;

        public CounterIncrementTask(AtomicInteger counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            // Increment the counter
            counter.incrementAndGet();
        }
    }
}
