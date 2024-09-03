package practice;

import java.util.*;

public class MakeLinePr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int node = scanner.nextInt();
        int edge = scanner.nextInt();
        int[] ingoingEdge = new int[node];
        List<Integer>[] list = new ArrayList[node];
        boolean[] validate = new boolean[node];

        for (int i = 0; i < node; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < edge; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            list[a].add(b);
            ingoingEdge[b]++;
        }

        Queue<Integer> q = new LinkedList<>(); //BFS

        for (int i = 0; i < ingoingEdge.length; i++) {
            if (ingoingEdge[i] == 0) {
                q.offer(i);
            }
        }

        while (!q.isEmpty()) {
            Integer presentNode = q.poll();
            if (validate[presentNode]) {
                continue;
            }
            validate[presentNode] = true;
            System.out.print(presentNode + 1 + " ");

            for (int i = 0; i < list[presentNode].size(); i++) {
                Integer a = list[presentNode].get(i);
                ingoingEdge[a]--;
                if (ingoingEdge[a] == 0) {
                    q.offer(a);
                }
            }
        }
    }
}
