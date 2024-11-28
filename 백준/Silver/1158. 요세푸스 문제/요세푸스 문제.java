import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder("<");
        br.close();
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Queue<Integer> qu = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            qu.add(i);
        }
        while (!qu.isEmpty()) {
            for (int i = 1; i < k; i++) {
                qu.add(qu.poll());
            }
            sb.append(qu.poll());
            sb.append((!qu.isEmpty()) ? ", " : ">");
        }
        System.out.println(sb);
    }
}