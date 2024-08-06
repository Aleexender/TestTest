package practice;

import java.util.regex.Pattern;

public class RegexMail {
    public static void main(String[] args) {
        String pattern = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$"; //숫자만
        String input = "alex@naver.com"; //대상문자


        boolean regex = Pattern.matches(pattern, input);
        System.out.println(regex);
    }
}
