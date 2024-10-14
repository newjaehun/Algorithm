import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.Collections;
        import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> qu = new PriorityQueue<>(Collections.reverseOrder());
        while (n-- > 0) {
            int tmp = Integer.parseInt(br.readLine());
            if (tmp == 0)
                sb.append(qu.isEmpty() ? "0" : qu.poll()).append("\n");
            else
                qu.add(tmp);
        }
        br.close();
        System.out.println(sb);
    }
}