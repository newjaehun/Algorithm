import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);

            if (tmp == '(') {
                st.push(tmp);
            } else {
                if (st.isEmpty())
                    return false;
                else
                    st.pop();
            }
        }
        return st.isEmpty();
    }
}