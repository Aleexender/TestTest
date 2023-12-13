package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Arrange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        ArrLogic[] inputArr = new ArrLogic[count];

        for (int i = 0; i < count; i++) {
            int heightMain = scanner.nextInt();
            int weightMain = scanner.nextInt();
            ArrLogic arrLogic = new ArrLogic();
            arrLogic.weight = weightMain;
            arrLogic.height = heightMain;
            inputArr[i] = arrLogic;
        }

        Arrays.sort(inputArr);

        for (ArrLogic arrLogic : inputArr) {
            System.out.println(arrLogic.height + " " + arrLogic.weight);
        }
    }

    static class ArrLogic implements Comparable<ArrLogic> {
        int height;
        int weight;

        // 키큰 순서대로, 몸무게가 많은순서대로,
        // 키가 크면 우선순위가 높다, 몸무게가 많으면 우선순위가 높다,
        // - 면 우선순위가 낮음
        // + 면 우선순위가 높음
        @Override
        public int compareTo(ArrLogic o) {
            if (this.height < o.height) {
                return +1;
            } else if (this.height > o.height) {
                return -1;
            } else {
                if (this.weight < o.weight) {
                    return +1;
                } else if (this.weight > o.weight) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }
}
