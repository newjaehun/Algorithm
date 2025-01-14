import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count=0;
        Stack<Character> st;
        while (n-- > 0) {
            st = new Stack<>();
            String input = br.readLine();
            int size = input.length();
            st.push(input.charAt(0));
            for (int i = 1; i < size; i++) {
                char tmp = input.charAt(i);
                if (!st.isEmpty() && st.peek() == tmp)
                    st.pop();
                else
                    st.push(tmp);
            }
            if(st.isEmpty())
                count++;
        }
        br.close();
        System.out.println(count);
    }
}