public class Atomic {
    public static void main(String[] args) {
        Thread thread = new Thread();
        for (int i = 0; i < 200; i++) {
            System.out.println(i);
        }
    }
}
