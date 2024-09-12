package threadthread;

import java.util.ArrayList;

public class run1 extends Thread {
    ArrayList arrayList = new ArrayList();

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            arrayList.add("첫번째 스레드 == " + i);
        }
    }
}

class run2 extends Thread {


    @Override

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("두번째 스레드 == " + i);
        }

    }
}