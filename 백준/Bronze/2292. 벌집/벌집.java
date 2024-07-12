import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 1;
        final int JUMP = 6;
        int tmp = 1;
        while (n > tmp) {
            tmp += JUMP * result;
            result++;
        }
        System.out.println(result);
        br.close();
    }
}