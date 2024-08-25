package practice;

public class JavaCodingKakao {
    public int[] solution(String[][] places) {
        /*

         */
        char[][] partPlace = new char[5][5];
        for (int i = 0; i < places.length; i++) {
            for (int k = 0; k < places.length; k++) {
                for (int j = 0; j < places.length; j++) {
                    partPlace[k][j] = places[i][k].charAt(j);
                    System.out.print(partPlace[k][j]);
                }
                System.out.println();
            }
            System.out.println(1);
        }
        return new int[0];
    }

    public static void qwe() {

    }

    public static void main(String[] args) {
        JavaCodingKakao kakao = new JavaCodingKakao();
        String[][] grid = {
                {"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
                {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
                {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
                {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
                {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}
        };
        kakao.solution(grid);
    }
}
