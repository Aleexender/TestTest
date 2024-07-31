package threadthread;

import java.util.List;

public class CustomThread extends Thread{
    int a;
    List<Integer> list;


     public CustomThread(int a, List<Integer> list){
        this.a = a;
        this.list = list;
     }


    @Override
    public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        list.add(a);
        list.remove(0);

    }

}
