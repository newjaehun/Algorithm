import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            HashMap<String, Integer> map1 = new HashMap<>();
            HashMap<Integer, String> map2 = new HashMap<>();
            for (int i = 1; i <= n; i++) {
                String line = br.readLine();
                map1.put(line, i);
                map2.put(i, line);
            }
            while (m-- > 0) {
                String line = br.readLine();
                if (!Character.isDigit(line.charAt(0)))
                    sb.append(map1.get(line)).append("\n");
                else
                    sb.append(map2.get(Integer.parseInt(line))).append("\n");
            }
            br.close();
            System.out.println(sb);
        }
}