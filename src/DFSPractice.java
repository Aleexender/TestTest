import java.util.ArrayList;
import java.util.List;

public class DFSPractice {

    static final int numbers[] = {4, 1, 2, 1};
    static final int target = 4;
    static final List<List<Integer>> answer = new ArrayList<>();

    public static void main(String[] args) {

        fun(0, new ArrayList<>());

        System.out.println(answer);
    }

    public static void fun(int index, List<Integer> history) {
        //base case
        if (index == numbers.length) {
            if (target == addAll(history)) {
                answer.add(history);
            }
            return;
        }


        //recursive case
        List<Integer> plusCase = copy(history);
        List<Integer> minusCase = copy(history);
        plusCase.add(numbers[index]);
        minusCase.add(-numbers[index]);
        fun(index + 1, plusCase);
        fun(index + 1, minusCase);
    }

    public static Integer addAll(List<Integer> history) {
        int sum = 0;
        for (int i = 0; i < history.size(); i++) {

            sum += history.get(i);
        }
        return sum;
    }

    public static List<Integer> copy(List<Integer> ingredient) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < ingredient.size(); i++) {
            result.add(ingredient.get(i));
        }
        return result;
    }
}
