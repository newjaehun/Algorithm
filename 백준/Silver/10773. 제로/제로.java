import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        Stack<Integer> s = new Stack<>();
        int sum =0;
        for (int i = 0; i < k; i++) {
            int tmp = Integer.parseInt(br.readLine());
            if (tmp != 0) s.push(tmp);
            else s.pop();
        }
        br.close();
        while(!s.isEmpty())
            sum += s.pop();
        System.out.println(sum);
    }
}