package practice;

import java.util.LinkedList;
import java.util.Scanner;

public class MusicProgramPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int singer = scanner.nextInt();
        int next = scanner.nextInt();
        int[][] arr = new int[singer][singer];
        int[] ingoingEdges = new int[singer];
        LinkedList<Integer> result = new LinkedList<>();
        boolean[] presentValidate = new boolean[arr.length];

        //입력
        for (int i = 0; i < next; i++) {

            int startNum = scanner.nextInt();
            int[] eachNode = new int[startNum];

            for (int j = 0; j < startNum; j++) { // 3 1 4 2 나왔으면 3번 반복 3때문에
                int index = scanner.nextInt();
                eachNode[j] = index;
            }

            for (int j = 0; j < eachNode.length - 1; j++) {
                int row = eachNode[j] - 1;// 처음 숫자
                int colum = eachNode[j + 1] - 1; // 그다음 숫자
                if (arr[row][colum] == 1) {
                    continue;
                }
                arr[row][colum] = 1;
                ingoingEdges[colum]++;
            }
        }
        boolean[] validate = new boolean[singer];

        for (int i = 0; i < singer; i++) {
            fun(validate, i, result, arr, presentValidate);
        }
        if (!DAGValidate) {
            System.out.println("0");
        } else {
            for (int i : result) {
                System.out.println(i);
            }
        }
    }

    static boolean DAGValidate = true;

    public static void fun(boolean[] validate, int start, LinkedList<Integer> result, int[][] arr, boolean[] presentValidate) {// DFS
        //base case 넘겨주지 않아도 되는 경우
        if (validate[start]) {
            return;
        }

        validate[start] = true; // 방문처리
        presentValidate[start] = true;

        //recursive case 떠넘겨 주는곳
        for (int i = 0; i < arr[start].length; i++) {
            if (arr[start][i] != 0) {
                if (presentValidate[i]) { // DAG 검사
                    DAGValidate = false;
                    return;
                }
                if (!validate[i] && !presentValidate[i]) {
                    fun(validate, i, result, arr, presentValidate);
                }
            }
        }
        presentValidate[start] = false;

        result.addFirst(start + 1);
    }
}
