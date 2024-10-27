import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String[] s = br.readLine().split(" ");
            int m = Integer.parseInt(s[0]), n = Integer.parseInt(s[1]);
            int x = Integer.parseInt(s[2]), y = Integer.parseInt(s[3]);
            int result = -1, lcm = (m * n) / gcd(m, n);
            for (int i = x; i <= lcm; i += m) {
                if ((i - 1) % n + 1 == y) {
                    result = i;
                    break;
                }
            }
            sb.append(result).append("\n");
        }
        br.close();
        System.out.println(sb);
    }
    public static int gcd(int a, int b) { return (b == 0) ? a : gcd(b, a % b);}
}
