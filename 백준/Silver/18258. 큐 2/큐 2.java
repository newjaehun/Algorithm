import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb;
    private static Deque<Integer> deque;
    public static void push(int x) {deque.add(x);}
    public static void pop() {sb.append((deque.isEmpty()) ? "-1" : deque.pollFirst()).append("\n");}
    public static void size() {sb.append(deque.size()).append("\n");}
    public static void empty() {sb.append((deque.isEmpty()) ? "1" : "0").append("\n");}
    public static void front() {sb.append((deque.isEmpty()) ? "-1" : deque.peekFirst()).append("\n");}
    public static void back() {sb.append((deque.isEmpty()) ? "-1" : deque.peekLast()).append("\n");}
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        int maxSize = Integer.parseInt(br.readLine());
        deque = new ArrayDeque<>();
        StringTokenizer st;
        for (int i = 0; i < maxSize; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            switch (st.nextToken()) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    pop();
                    break;
                case "size":
                    size();
                    break;
                case "empty":
                    empty();
                    break;
                case "front":
                    front();
                    break;
                case "back":
                    back();
                    break;
            }
        }
        br.close();
        System.out.println(sb);
    }
}