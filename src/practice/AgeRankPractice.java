package practice;

import java.util.Arrays;
import java.util.Scanner;

public class AgeRankPractice {
    static class Agename implements Comparable<Agename> {
        String name;
        int age;

        public Agename(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(Agename o) {
            if (this.age < o.age) {
                return -1;
            } else if (this.age > o.age) {
                return +1;
            } else {
                return 0;
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int count = scanner.nextInt();
            Agename[] agenames = new Agename[count];

            for (int i = 0; i < count; i++) {
                int age = scanner.nextInt();
                String name = scanner.next();
                agenames[i] = new Agename(name, age);
            }

            Arrays.sort(agenames);

            for (Agename a : agenames) {
                System.out.println(a.age + " " + a.name);
            }
        }
    }

}
