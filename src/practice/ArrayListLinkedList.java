package practice;

import java.util.ArrayList;

public class ArrayListLinkedList {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(0, 3);

        integerArrayList.set(0, 4);
        integerArrayList.remove(0);
        integerArrayList.get(1);

        System.out.println(integerArrayList);
//        System.out.println(integerArrayList.get(1));

        System.out.println();
    }
}
