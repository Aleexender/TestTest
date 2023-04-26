package practice;

import java.util.*;

public class MusicTest {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int singer = scanner.nextInt();
        int next = scanner.nextInt();
        int[][] arr = new int[singer][singer];
        int[] ingoingEdges = new int[singer];
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < next; i++) {

            int startNum = scanner.nextInt();
            int[] eachNode = new int[startNum];

            for (int j = 0; j < startNum; j++) {
                int index = scanner.nextInt();
                eachNode[j] = index;
            }

            for (int j = 0; j < eachNode.length - 1; j++) {
                int row = eachNode[j] - 1;
                int colum = eachNode[j + 1] - 1;
                if (arr[row][colum] == 1) {
                    continue;
                }
                arr[row][colum] = 1;
                ingoingEdges[colum]++;
            }
        }
    }

    public static void fun(int[] ingoingEdge, int[][] arr, boolean[] validate, List<Integer> result){
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < ingoingEdge.length; i++) {
            if (ingoingEdge[i] == 0) {
                queue.offer(i);
            }
        }

        while (!queue.isEmpty()) {
            Integer number = queue.poll();
            result.add(number + 1);
            validate[number] = true;
            //핵심
            for (int i = 0; i < ingoingEdge.length; i++) {
                if (arr[number][i] == 1 && validate[i]) {
                    ingoingEdge[i]--;
                    if (ingoingEdge[i] == 0) {
                        queue.offer(i);
                    }
                }
            }
        }
        for (int i = 0; i < validate.length; i++) {
            if (!validate[i]) {
                System.out.println("0");
                return;
            }
        }
        for (int answer : result) {
            System.out.println(answer);
        }
    }
}
