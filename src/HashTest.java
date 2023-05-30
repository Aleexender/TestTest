import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class HashTest {
    public static void main(String[] args) {
        String[] report = new String[100];
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        String[] victim = new String[report.length];
        String[] reporter = new String[report.length];


        for(int i =0; i < report.length; i++){
            String[] split =report[i].split(" ");
            map.put(split[i], new ArrayList<>(Arrays.asList("0,00,0")));

        }
    }
}
