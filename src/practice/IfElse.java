package practice;

public class IfElse {
    public void solution() {
        int ben = 10;
        int kevin = 15;

        String answer = (ben < kevin) ? "kevin이 형이라고!" : "kevin이 형이 아니라고!";
        System.out.println(answer);

        if (ben < kevin) {
            System.out.println("kevin이 형이라고!");
        } else {
            System.out.println("kevin이 형이 아니라고!");
        }
    }
}
