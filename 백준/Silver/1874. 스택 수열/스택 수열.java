import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();
        int last = 1;
        for (int i = 1; i <= n; i++) {
            int input = Integer.parseInt(br.readLine());
            while (last <= input) {
                st.push(last++);
                sb.append("+\n");
            }
            if (input == st.peek()) {
                st.pop();
                sb.append("-\n");
            }else {
                sb = new StringBuilder().append("NO");
                break;
            }
        }
        br.close();
        System.out.println(sb);
    }
}