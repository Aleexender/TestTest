package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Arrange2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        Setting[] settings = new Setting[count];

        for (int i = 0; i < count; i++) {
            int inputHeight = scanner.nextInt();
            int inputKg = scanner.nextInt();
            Setting settingInstance = new Setting(inputHeight, inputKg);
            settings[i] = settingInstance;
        }
        Arrays.sort(settings);

        for (Setting o : settings) {
            System.out.println(o.height + " " + o.kg);
        }
    }

    static class Setting implements Comparable<Setting> {
        int height;
        int kg;

        public Setting(int height, int kg) {
            this.height = height;
            this.kg = kg;
        }

        // kg가 무거우면 우선순위가 높다 +1
        // 키가 크면 우선순위가 높다 +1
        @Override
        public int compareTo(Setting o) {
            if (this.kg < o.kg) {
                return -1;
            } else if (this.kg > o.kg) {
                return -1;
            } else {
                if (this.height < o.height) {
                    return -1;
                } else if (this.height > o.height) {
                    return +1;
                } else {
                    return 0;
                }
            }
        }
    }
}
