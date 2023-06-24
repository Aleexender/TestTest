package practice;

import java.util.ArrayList;
import java.util.List;

public class ListPrc {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.remove(2);

        for (Integer a : list) {
            System.out.println(a);
        }
    }
}
