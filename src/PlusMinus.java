public class PlusMinus {
    public int solution(String my_string) {
        int answer = 0;

        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) >= '0' && my_string.charAt(i) <= '9') {
                answer += my_string.charAt(i) - '0'; // char에 숫자가 있을때 변환이 잘된다, 알파벳은 안된다
            }
        }

        return answer;
    }
}

class qwqweq {
    public static void main(String[] args) {
        PlusMinus qwe = new PlusMinus();
        System.out.println(qwe.solution("aAb1B2cC34oOp"));

    }
}
