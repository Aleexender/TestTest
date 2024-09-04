package singleTon;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleTonMain {
    public static void main(String[] args) throws InterruptedException {
//        //싱글톤 객체를 담을 배열
//        SingletonTest[] single = new SingletonTest[10];
//
//        //Thread pool 생성
//        ExecutorService service = Executors.newCachedThreadPool();
//
////         반복문을 통한 스레드가 동시에 인스턴스들을 생성
//        for (int i = 0; i < single.length; i++) {
//            final int num = i;
//            service.submit(() ->{
//                System.out.println(Thread.currentThread());
//                single[num] = SingletonTest.getSingletonTest();
//
//            });
//        }
//        //종료
//        service.shutdown();
//
//    for(SingletonTest singletonTest: single) {
//        System.out.println(singletonTest.toString());
//        }
//    }
        for (int k = 0; k < 10; k++) {


            SingletonTest[] single = new SingletonTest[10];
            List<CompletableFuture<Void>> list = new ArrayList<>();
            for (int i = 0; i < single.length; i++) {
                int finalI = i;
                list.add(CompletableFuture.runAsync(() -> {
                    single[finalI] = SingletonTest.getSingletonTest();
                }));
            }

            CompletableFuture.allOf(list.toArray(new CompletableFuture[10])).thenRun(() -> {
                for (SingletonTest singletonTest : single) {
                    System.out.println(singletonTest);
                }
            });
        }
    }
}
