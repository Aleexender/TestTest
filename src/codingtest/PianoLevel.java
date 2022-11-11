package codingtest;

import java.io.IOException;
import java.util.Scanner;

public class PianoLevel {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in); //입력값을 바이트 단위로 읽는것

        int[] data = new int[]{1,2,3,4,5,6,7,8};
        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < 8; i++ ) {
            data[i] = scanner.nextInt(); // int를 정수로 받는 메소드
        }
