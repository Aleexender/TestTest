package codingtest;

import java.util.Arrays;

public class MainStockPrice {
    public static void main(String[] args) {
        StockPrice stockPrice = new StockPrice();
        int[] a = new int[]{1,2,3,2,3};
        System.out.println(Arrays.toString(stockPrice.sol(a)));
    }
}
