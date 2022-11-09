package codingtest;

public class StockPrice {
    public int[] sol(int[] prices) {
        int[] answer = new int[prices.length]; // pirce.length 때문에 array.toString()필요

        for (int i = 0; i < answer.length; i++) {
            for (int j = i + 1; j < answer.length; j++) {
                answer[i]++;// 리스트 값 추가

