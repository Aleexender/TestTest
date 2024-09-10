package practice;

import java.util.LinkedList;

public class StringBuilderTest {
    public static void main(String[] args) {
        String str = "ABC";
        String str2 = "DEFG";
        String strResult = str + str2;

        System.out.println(strResult);

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("123").append("ABC");

        stringBuilder.insert(2, "CCC");
        stringBuilder.delete(3, 5);

        System.out.println(stringBuilder.toString());

        StringBuffer buffer = new StringBuffer();

        LinkedList<Integer> qwe = new LinkedList<>();


        String[] qwew = new String[10];

        int length = qwew.length;
    }
}
