package practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MusicProgrammTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int singer = scanner.nextInt();
        int next = scanner.nextInt();
        int[][] arr = new int[singer][singer]; //정사각형
        int[] ingoingEdges = new int[singer];
        LinkedList<Integer> result2 = new LinkedList<>();
        boolean[] presentValidate = new boolean[arr.length];

        for (int i = 0; i < next; i++) {

            int startNum = scanner.nextInt();
            int[] eachNode = new int[startNum];

            for (int j = 0; j < startNum; j++) {
                int index = scanner.nextInt();
                eachNode[j] = index;
            }

            for (int j = 0; j < eachNode.length; j++) {
                int row = eachNode[j] - 1; // 처음숫자
                int colum = eachNode[j + 1] - 1;
                if (arr[row][colum] == 1) {
                    continue;
                }
                arr[row][colum] = 1;
                ingoingEdges[colum]++;
            }
        }
        boolean[] validate = new boolean[singer];

        for (int i = 0; i < singer; i++) {
            fun2(validate,i,result2,arr,presentValidate);
        }
    }

    static boolean DAGValidate = true;

    public static void fun2(boolean[] validate, int start, LinkedList<Integer> result, int[][] arr, boolean[] presentValidate) {
        //base case
        if (validate[start]) {
            return;
        }

        validate[start] = true;
        presentValidate[start] = true;

        // recursive case
        for (int i = 0; i < arr[start].length; i++) {
            if (arr[start][i] != 0) {
                if (presentValidate[i]) { // DAG 검사하는 로직
                    DAGValidate = false;
                    return;
                }
                if (!validate[i] && !presentValidate[i]) {
                    fun2(validate, i, result, arr, presentValidate);
                }
            }
        }
        presentValidate[start] = false;

        result.addFirst(start + 1);
    }
}
