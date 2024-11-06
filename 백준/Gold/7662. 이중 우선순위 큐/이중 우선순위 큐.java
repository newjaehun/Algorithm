import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static Map<Integer, Integer> map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> min, max;
        StringTokenizer st;
        while (t-- >0) {
            int k = Integer.parseInt(br.readLine());
            min = new PriorityQueue<>();
            max = new PriorityQueue<>(Comparator.reverseOrder());
            map = new HashMap<>();

            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                char value = st.nextToken().charAt(0);
                int n = Integer.parseInt(st.nextToken());
                if (value == 'I') {
                    map.put(n, map.getOrDefault(n, 0) + 1);
                    min.add(n);
                    max.add(n);
                } else
                    remove((n==1)? max : min);
            }
            while (!min.isEmpty() && map.getOrDefault(min.peek(), 0) == 0)
                min.poll();
            while (!max.isEmpty() && map.getOrDefault(max.peek(), 0) == 0)
                max.poll();
            
            if (map.size() == 0)
                sb.append("EMPTY").append("\n");
            else
                sb.append(max.poll()).append(" ").append(min.poll()).append("\n");
        }
        br.close();
        System.out.println(sb);
    }
    private static void remove(PriorityQueue<Integer> priorityQueue) {
        int tmp;
        while (!priorityQueue.isEmpty()) {
            tmp = priorityQueue.poll();
            if (map.containsKey(tmp)) {
                int count = map.get(tmp);
                if (count == 1)
                    map.remove(tmp);
                else
                    map.put(tmp, count - 1);
                break;
            }
        }
    }
}