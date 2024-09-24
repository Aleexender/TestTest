public class UpperLower {
    public String solution(String my_string) {
        String answer = "";
        my_string = "cccCCC";

        for (int i = 0; i < my_string.length(); i++) {
            if ((my_string.charAt(i) + "").toUpperCase().equals(my_string.charAt(i) + "")) {
                answer += (my_string.charAt(i) + "").toLowerCase();
            } else {
                answer += (my_string.charAt(i) + "").toUpperCase();
            }

        }

        return answer;
    }
}

class qwe {
    public static void main(String[] args) {
        UpperLower qwe = new UpperLower();
        qwe.solution("cccCCC");
    }
}

