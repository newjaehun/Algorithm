import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        String s;
        boolean check;
        while (true) {
            check = false;
            s = br.readLine();
            if(s.charAt(0) == '.') break;
            for (int i = 0; i < s.length(); i++) {
                char tmp = s.charAt(i);
                if(tmp == '[' || tmp == '(')
                    st.push(tmp);
                else if (tmp == ']' || tmp == ')') {
                    if (st.isEmpty()) {
                        check = true;
                        break;
                    }
                    char pop = st.pop();
                    if ((tmp == ']' && pop != '[') || (tmp == ')' && pop != '(')) {
                        check = true;
                        break;
                    }
                }
                if ((i == s.length() - 1) && !st.isEmpty()) {
                    check = true;
                    break;
                }
            }
            sb.append(check ? "no\n" : "yes\n");
            st.clear();
        }
        br.close();
        System.out.println(sb);
    }
}