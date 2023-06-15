package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class LamdaTe {
    public static void main(String[] args) {
        int[] qwe = {1, 2, 3, 4, 5, 6, 7};
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Integer a = list.stream().min(Integer::compareTo).get();

        OptionalInt min = Arrays.stream(qwe).min();
    }
}
