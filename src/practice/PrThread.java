package practice;

public class PrThread implements Runnable {
    private int[] temp;

    public PrThread() {
        temp = new int[10];

        for (int start = 0; start < temp.length; start++) {
            temp[start] = start;
        }
    }
    @Override
    public void run() {
        for (int start2 : temp) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
            System.out.println(start2);
        }
    }
}
