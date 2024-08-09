import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FlawedCounterExample {

    public static void main(String[] args) {
        // Initialize the counter with a value of 0
        Counter counter = new Counter();

        // Create a fixed thread pool with 10 threads
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        // Submit tasks to the executor service
        for (int i = 0; i < 1000; i++) {
            executorService.submit(new CounterIncrementTask(counter));
        }

        // Shut down the executor service
        executorService.shutdown();
        try {
            executorService.awaitTermination(30, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final counter value
        System.out.println("Final counter value: " + counter.getValue());
    }

    static class Counter {
        private volatile int value = 0;

        public synchronized int getValue() {
            return value;
        }

        public synchronized void increment() {
            // Increment the counter value by 1 (intentionally flawed)
            value++;
        }
    }

    static class CounterIncrementTask implements Runnable {
        private final Counter counter;

        public CounterIncrementTask(Counter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            // Increment the counter
            counter.increment();
        }
    }
}
