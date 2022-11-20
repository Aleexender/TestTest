package practice;

public class ThreadMain {
    public static void main(String[] args) {

        PrThread th = new PrThread();
        Thread t = new Thread(th, "first");

        t.start();
    }
}
