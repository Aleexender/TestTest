package practice;

public class PrThread implements Runnable {
    private int[] temp;

    public PrThread() {
        temp = new int[10];

        for (int start = 0; start < temp.length; start++) {
            temp[start] = start;
        }
    }
