package practice;

import java.util.*;

public class MakeLinee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int node = scanner.nextInt();
        int edge = scanner.nextInt();
        int[] ingoingEdge = new int[node];
        List<Integer>[] list = new ArrayList[node];
        boolean[] validate = new boolean[node];

        for (int i = 0; i < node; i++) { // must
            list[i] = new ArrayList<>();
        }
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < ingoingEdge.length; i++) {
            if (ingoingEdge[i] == 0) {
                queue.offer(i);
            }
        }

        while (!queue.isEmpty()) {
            Integer presentNode = queue.poll();
            if (validate[presentNode]) {
                continue;
            }
            validate[presentNode] = true;
            System.out.println(presentNode + 1 + " ");

            for (int i = 0; i < list[presentNode].size(); i++) {
                Integer a = list[presentNode].get(i);
                ingoingEdge[a]--;
                if (ingoingEdge[a] == 0) {
                    queue.offer(a);
                }
            }
        }
    }
}
