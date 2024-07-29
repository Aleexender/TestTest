package practice;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int a = random.nextInt(45);
            System.out.println(a);
        }

    }
}
