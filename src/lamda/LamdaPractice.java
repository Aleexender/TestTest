package lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LamdaPractice {

    public int math(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] b = {88, 33};
        for (int k = 0; k < 2; k++) {
            Arrays.stream(a)
                    .filter(i -> i % 2 == 0)
                    .filter(qwe -> qwe > 3)
                    .filter(i -> b[0] > i)
                    .forEach(i -> {});
        }

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        list.stream().filter(qwe -> qwe.equals("a"));


        Arrays.stream(a)
                .filter(qw -> qw / 2 == 0 && qw / 3 == 0);
        Arrays.stream(a)
                .filter(qw -> qw / 2 == 0 )
                .filter(qw -> qw / 3 == 0);




//        if () {
//
//        }
//                .forEach(System.out::println);
    }
}
