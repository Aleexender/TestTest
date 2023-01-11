import java.util.ArrayList;
import java.util.List;

public class Average {
    public double solution(int[] numbers) {
        List<Integer> qwe2 = new ArrayList<>();
        for (int qwe : numbers) {
            qwe2.add(qwe);
        }
        double answer = 0;
        double qwe = 0;

        for (int i = 0; i < qwe2.size(); i++) {
            answer += qwe2.get(i);
        }
        answer /= qwe2.size();
        return answer;
    }
}
