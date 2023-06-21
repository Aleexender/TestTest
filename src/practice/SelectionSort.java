package practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {33,42,66,13,10,88};

        for (int i = 0; i < arr.length; i++) {
            int min = Integer.MAX_VALUE;
            int index = i;
            for (int j = i; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }
//        System.out.println(new ArrayList<Integer>(Arrays.asList(arr)));
    }
}
