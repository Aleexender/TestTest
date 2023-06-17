package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CodingTest {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        /*

        1. map 한개 만들기
        2. key value 로 만들어서 중복되면 add
        3. 중복이 안될시 패스
        */

        Map<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> answer = new ArrayList<>();

        for (int i = 0; i < items1[0].length; i++) {
            map.put(items1[0][i], items1[1][i]);
        }

        int j = 0;

        for(int i =0; i< map.size(); i++){
            if(map.containsKey(items2[0][j])){
                int add = map.get(items2[0][j]); // bring value
                map.put(items2[0][j],add+ items2[1][j]);
                j++;
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("key=="+entry.getKey());
            System.out.println("value==" +entry.getValue());
        }

        return answer;
    }

    public static void main(String[] args) {
        CodingTest codingTest = new CodingTest();
        int[][] item1 = {{1, 4, 3}, {1, 5, 8}};
        int[][] item2 = {{3, 1}, {1, 5}};
        codingTest.mergeSimilarItems(item1, item2);
    }
}
