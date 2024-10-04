import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int case_n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map;
        String[] s;
        while (case_n-- > 0) {
            map = new HashMap<>();
            int n = Integer.parseInt(br.readLine());
            int result = 1;
            for (int i = 0; i < n; i++) {
                s = br.readLine().split(" ");
                map.put(s[1], map.getOrDefault(s[1],1) + 1);
            }
            Iterator<String> keys = map.keySet().iterator();
            while (keys.hasNext())
                result *= map.get(keys.next());
            sb.append(result-1).append("\n");
        }
        br.close();
        System.out.println(sb);
    }
}