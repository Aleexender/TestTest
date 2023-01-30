import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Organic {
    static int[] dirRow = {-1, 0, 1, 0};
    static int[] dirCol = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();
        for (int z = 0; z <testcase ; z++) {


            int row = scanner.nextInt();
            int colum = scanner.nextInt();
            int cabbage = scanner.nextInt();
            int warm = 0;
            boolean[][] validate = new boolean[row][colum];
            int[][] farm = new int[row][colum];

            for (int i = 0; i < cabbage; i++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                farm[x][y] = 1;
            }
            for (int i = 0; i < farm.length; i++) {
                for (int k = 0; k < farm[i].length; k++) {
                    if (farm[i][k] == 1 && !validate[i][k]) {
                        warm++;
//                        fun(i, k, farm, validate); // dfs 시작점
                        fun2(i, k, farm, validate);
                    }
                }
            }
            System.out.println(warm);
        }

    }

    public static void fun(int row, int colum, int[][] farm, boolean[][] validate) { // DFS
        //base case 답을 바로 아는경우, 답이 안풀리는거
        validate[row][colum] = true;




        //recursive case 넘겨줄것
//
        for (int dir = 0; dir < 4; dir++) {
            int newRow = row + dirRow[dir];
            int newCol = colum + dirCol[dir];

//            if (newRow >= 0 && newCol >= 0 && newRow < farm.length && newCol < farm[newRow].length) {
//                if (!validate[newRow][newCol] && farm[row][colum] == 1) {
//                    fun(newRow,newCol,farm,validate);
//
//                }
//            }f

            // isValid 는 해당 어레이만 넘기지 않게 설계
            if (isValid(farm,newRow,newCol) && !validate[newRow][newCol] && farm[newRow][newCol] ==1) {
                fun(newRow,newCol,farm,validate);
            }
        }


    }

    public static void fun2(int row, int colum, int[][] farm, boolean[][] validate) { //bfs
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(row);
        q.offer(colum);

        while (!q.isEmpty()) {
            Integer nowRow =  q.poll();
            Integer nowColum = q.poll();

            if (validate[nowRow][nowColum]) {
                continue;
            }
            validate[nowRow][nowColum] = true;


            for (int dir = 0; dir < 4; dir++) {
                int nextRow = nowRow + dirRow[dir];
                int nextCol = nowColum + dirCol[dir];

                if (isValid(farm, nextRow, nextCol) && !validate[nextRow][nextCol] && farm[nextRow][nextCol] == 1) {
                    q.offer(nextRow);
                    q.offer(nextCol);
                }
            }

        }
    }

    private static boolean isValid(int[][] farm, int newRow, int newCol) {
        return newRow >= 0 && newRow < farm.length &&
                newCol >= 0 && newCol < farm[newRow].length;

    }



}
