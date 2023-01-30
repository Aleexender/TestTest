package practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSHardOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt();
        int colum = scanner.nextInt();

        char[][] maze = new char[row][colum];
        boolean[][] visit = new boolean[row][colum];

        for (int i = 0; i < maze.length; i++) {
            String input = scanner.next();
            for (int j = 0; j < maze[i][j]; j++) {
                maze[i][j] = input.charAt(j);
            }
        }
        int[] start = {0, 0, 0};

    }

    public static void fun(int[] start, boolean[][] visited, char[][] maze) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(start);


        while (!q.isEmpty()) {
            int[] nowNode = q.poll();
            int presentRow = nowNode[0];
            int presentColum = nowNode[1];

            if (visited[presentRow][presentColum]) {
                continue;
            }
            visited[presentRow][presentColum] = true;

            if (presentRow - 1 >= 0 && maze[presentRow - 1][presentColum] == '1') { // 위쪽
                q.offer(new int[]{presentRow - 1, presentColum, nowNode[2] + 1});
            }
            if (presentColum+1 < maze[presentRow].length && maze[presentRow][presentColum + 1] == '1') { // 오른쪽
                q.offer(new int[] {presentRow, presentColum+1,nowNode[2]+1});
            }
            if (presentRow+1 < maze.length && maze[presentRow+1][presentColum] == '1') { // 아래
                q.offer(new int[]{presentRow + 1, presentColum,nowNode[2]+1});
            }
            if (presentColum -1 >= 0 && maze[presentRow][presentColum - 1] == '1') { // 오른쪽
                q.offer(new int[]{presentRow, presentColum - 1, nowNode[2] + 1});
            }

            if (presentRow == maze.length - 1 && presentColum == maze[presentRow].length - 1) {
                System.out.println(nowNode[2]+1);
                break;
            }
        }
    }
}
