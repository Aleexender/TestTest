package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Arrange4 {


    static class Arr implements Comparable<Arr> {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int people = scanner.nextInt();
            Arr[] arrayInput = new Arr[people];

            for (int i = 0; i < people; i++) {
                int grade = scanner.nextInt();
                Arr arr = new Arr(grade);
                arrayInput[i] = arr;
            }

            Arrays.sort(arrayInput);

            for (Arr arr : arrayInput) {
                System.out.println(arr.grade);

            }
        }

        int grade;

        public Arr(int grade) {
            this.grade = grade;
        }

        @Override
        public int compareTo(Arr o) {
            if (this.grade < o.grade) {
                return +1;
            } else if (this.grade > o.grade) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
