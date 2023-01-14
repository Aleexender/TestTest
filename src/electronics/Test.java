package electronics;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) throws IOException, InterruptedException {

        String[] lotto = {"울보좌", "경렬좌", "뭉이님", "희조", "자봄", "인텔리제이지님", "워니좌", "방장"};
        Thread.sleep(10000);
        System.out.println("당첨자"+ " == " +   lotto[(int) (Math.random() * 8)]);


        }
    }