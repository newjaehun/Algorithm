import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        br.close();
        Stack<Character> stack = new Stack<>();
        int size = s.length();
        int result=0;
        for (int i = 0; i < size; i++) {
            char tmp = s.charAt(i);
            if (tmp == '(') {
                stack.push(tmp);
            } else {
                stack.pop();
                result+= (s.charAt(i-1)== '(')? stack.size():1;
            }
        }
        System.out.println(result);
    }
}