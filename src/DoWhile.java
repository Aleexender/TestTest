public class DoWhile {
    public static void main(String[] args) {
        int x = 26;
        int count = 0;

        do{
            int a = x / 10;
            int b = x % 10;
            int c = b;
            int d = (a + b) % 10; // 0 - 8
            x = c * 10 + d;
            count++;
        }while (x != 26);
        System.out.println(x);
    }
}
