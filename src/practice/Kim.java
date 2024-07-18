package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Kim {
    public int[] solution(String today, String[] terms, String[] privacies) {
       /*
       1. term를 hashMap<String, Integer>를 이용해서 넣기 **
       2. privacies를 contains메소드를 사용해서 HashMap에 해당 약관이 들어가있다면 해당 날짜에서 약관 기한을 더한다.
       3. 근데 2번의 결과값 = 포함되는 약관기간 + 수집 시작한날짜 today를 넘는다면 그 개인정보는 파기해야하는 것이다
       즉, 우리가 원하는 값은 파기해야하는 정보를 찾는것!
       */

        HashMap<String, Integer> termsInfo = new HashMap<>();
        List<Integer> befAnswer = new ArrayList<>();

        for (int i = 0; i < terms.length; i++) {
            String[] termsTypeMon = terms[i].split(" ");
            termsInfo.put(termsTypeMon[0], Integer.parseInt(termsTypeMon[1]));
        }


        for (int i = 0; i < privacies.length; i++) {
            final int YMD = 3;
            String[] privDateType = privacies[i].split(" ");
            int termsMonth = termsInfo.get(privDateType[1]); // value 값을 가져옴
            String privDate = privDateType[0];

            int[] addedterms = calculateDate(privDate, termsMonth); // return type == int[3] -> year month day

            String[] todayYMD = today.split("\\.");
            int[] tdyResult = new int[YMD];
            tdyResult[0] = Integer.parseInt(todayYMD[0]);
            tdyResult[1] = Integer.parseInt(todayYMD[1]);
            tdyResult[2] = Integer.parseInt(todayYMD[2]);


            boolean isDateOver = isPrivOver(addedterms, tdyResult);

            if (isDateOver) {
                befAnswer.add(i + 1);
            }
        }


        int[] answer = new int[befAnswer.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = befAnswer.get(i);
            System.out.println(answer[i]);
        }
        return answer;
    }

    public int[] calculateDate(String privDate, int privMonth) { // 2021 05 02 |  6
        String[] yMD = privDate.split("\\.");
        int year = Integer.parseInt(yMD[0]);
        int month = Integer.parseInt(yMD[1]);
        int date = Integer.parseInt(yMD[2]);
        final int OVER_MONTH = 12;
        int[] result = new int[yMD.length];

        int afterMonth = month + privMonth;

        while (afterMonth > OVER_MONTH) {// WARN
            afterMonth -= OVER_MONTH;
            year++;
        }


        result[0] = year;
        result[1] = afterMonth;
        result[2] = date;

        return result;
    }

    public boolean isPrivOver(int[] addedterms, int[] tdyResult) {
        if (addedterms[0] < tdyResult[0]) {
            return true;
        } else if (addedterms[0] > tdyResult[0]) {
            return false;
        } else {
            if (addedterms[1] < tdyResult[1]) {
                return true;
            } else if (addedterms[1] > tdyResult[1]) {
                return false;
            } else {
                if (addedterms[2] < tdyResult[2]) {
                    return true;
                } else if (addedterms[2] > tdyResult[2]) {
                    return false;
                }
            }
        }
        return true;


    }


    public static void main(String[] args) {
        Kim kim = new Kim();
        kim.solution("2022.05.19", new String[]{"A 6", "B 12", "C 3"}, new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"});
        kim.solution("2020.01.01", new String[]{"Z 3", "D 5"}, new String[]{"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"});
    }
}


