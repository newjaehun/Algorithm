import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> st = new Stack<>();
        for (int i : arr) 
            if (st.empty() || !st.peek().equals(i)) 
                st.push(i);
        return st.stream().mapToInt(i -> i).toArray();
    }
}