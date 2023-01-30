package threadthread;

public class Single {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("첫번째 "+i);
        }
    }

    public void run2() {
        for (int i = 0; i < 10; i++) {
            System.out.println("두번째 "+i);
        }
    }


    public static void main(String[] args) {
        Single single = new Single();
        single.run();
        single.run2();
    }
}
