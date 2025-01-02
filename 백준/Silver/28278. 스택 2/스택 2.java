import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int n;
    private static int top = -1;
    private static int stk[];
    private static StringBuilder sb;
    public static void push(int x) {
        stk[++top] = x;
    }
    public static void pop() { sb.append((top == -1)? "-1" : stk[top--]).append("\n");}
    public static void size() {sb.append(top + 1).append("\n");}
    public static void empty() {sb.append((top == -1)? "1": "0").append("\n");}
    public static void top() {sb.append((top == -1)? "-1": stk[top]).append("\n");}

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        n = Integer.parseInt(br.readLine());
        stk = new int[n];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int order = Integer.parseInt(st.nextToken());
            switch (order) {
                case 1:
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    size();
                    break;
                case 4:
                    empty();
                    break;
                case 5:
                    top();
                    break;
            }
        }
        br.close();
        System.out.println(sb);
    }
}