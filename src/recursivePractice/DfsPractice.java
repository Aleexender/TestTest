package recursivePractice;

import java.util.Scanner;

public class DfsPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int v = scanner.nextInt();
        int[][] qwe = new int[n][m];

        for (int i = 0; i < m; i++) {
            int input1 = scanner.nextInt();
            int input2 = scanner.nextInt();
            qwe[input2 - 1][input2 - 1] = 1; // input 에 주어진 수를 넣어주고 부여를 해준다.
            qwe[input1 - 1][input2 - 1] = 1;
        }
        int[] arr = new int[n];

    }

    static void fun(int start, int[][] qwe, int[] arr) {
        //base case 당장 풀수있는 문제 , 문제를 못풀때


        //recursive case 떠넘겨야지 알수있는것들
        arr[start] = 1;
        System.out.println(start+1 + " ");

        //이게 포인트
        for (int i = 0; i < qwe[start][i]; i++) {
            if (qwe[start][i] == 1) { // 해당 노드에서 1이 나올때
                if (arr[i] == 1) { // 해당 노드에 숫자가 부여됬는지 확인 (중복되는 수를 제거하기 위해서임)
                    continue;
                }
                fun(i, qwe, arr);

            }
        }
    }
}
