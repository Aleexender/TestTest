package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Arrang3 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int inputCount = scanner.nextInt();
        Arranging[] arrangeList = new Arranging[inputCount];

        for (int i = 0; i < inputCount; i++) {
            int ageInput = scanner.nextInt();
            Arranging arranging = new Arranging(ageInput);
            arrangeList[i] = arranging;
        }
        Arrays.sort(arrangeList);

        for (Arranging arranging : arrangeList) {
            System.out.println(arranging.age);
        }

    }

    static class Arranging implements Comparable<Arranging> {
        int age;

        public Arranging(int age) {
            this.age = age;
        }
// 나이가 많으면 우선순위가 높다 -> 늦게 빠진다.

        @Override
        public int compareTo(Arranging o) {
            if (this.age < o.age) {
                return +1;
            } else if (this.age > o.age) {
                return -1;
            } else {
                return 0;
            }
        }
    }

}
