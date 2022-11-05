package codingtest;

import java.util.*;

public class Poketmon { // n 포켓몬의 수중 나누기 2만큼, 하지만 똑같은 종류의 포켓몬은 제외가장 많은 종류의 포켓몬을 선택하는 방법을 찾기, 갯수를 리턴
    public int solution(int[] nums) {
//        int answer = 0;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int answer = set.size();
        if (answer > nums.length / 2) {
            answer = nums.length / 2;
        }
        return answer;
    }
}
