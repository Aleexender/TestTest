package threadthread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreadMain {

    public static void main(String[] args) throws InterruptedException {

        List<Integer> list = Collections.synchronizedList(new ArrayList<>());
        System.out.println(list);

//        for(int i=0; i < 100; i++){
//            list.add(i);
//            list.remove(0);
//        }


        for(int i=0; i < 100; i++){
            CustomThread customThread = new CustomThread(i,list);
            customThread.start();
        }

        Thread.sleep(3000);
        System.out.println(list);
    }
}
