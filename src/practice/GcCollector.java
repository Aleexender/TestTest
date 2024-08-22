package practice;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;

public class GcCollector {
    public static void main(String[] args) {
        // Loop 5 times, each time creating a lot of short-lived objects
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10_000_000; j++) {
                String s = new String("Hello, World!");  // creates a new object each time
            }
            // Suggest to the JVM that this is a good time to run the garbage collector
            System.gc();
        }

        // Collect GC info
        List<GarbageCollectorMXBean> gcBeans = ManagementFactory.getGarbageCollectorMXBeans();
        for (GarbageCollectorMXBean gcBean : gcBeans) {
            System.out.println("GC Name: " + gcBean.getName());
            System.out.println("Collection Count: " + gcBean.getCollectionCount());
            System.out.println("Collection Time: " + gcBean.getCollectionTime() + "ms");
            System.out.println();
        }
    }
}
