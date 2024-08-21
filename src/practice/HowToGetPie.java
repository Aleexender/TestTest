package practice;

import java.util.Scanner;

public class HowToGetPie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.141592;
        double radius = 0.3; // m
        double result = radius * 2 * PI;
        System.out.println("diameter =" + result);
    }
}
