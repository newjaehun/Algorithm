import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        while (n-- > 0) {
            String name = br.readLine();
            int count = map.getOrDefault(name, 0)+1;
            if(max < count)
                max = count;
            map.put(name, count);
        }
        List<String> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet);
        for (String s : keySet) {
            if (map.get(s) == max) {
                System.out.println(s);
                return;
            }
        }
    }
}