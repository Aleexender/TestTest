import java.util.Arrays;

public class CutByIndexArr {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i;
        }
        int[] arr2 = Arrays.copyOfRange(arr, 3, 7);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));


        int[][] arr3 = new int[3][3];

        for(int i = 0; i <arr3.length; i++) {
            int add = 0;
            for(int k = 0; k < arr3[i].length; k++){

                add += 10;
                arr3[i][k] = add;

                System.out.print(arr3[i][k]);
            }
            System.out.println();
        }
    }
}
