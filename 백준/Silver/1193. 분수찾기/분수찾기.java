import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int line = 1;
        while (true) {
            if (((line - 1) * line / 2) < n && (line * (line + 1) / 2) >= n)
                break;
            line++;
        }
        int a = n - line * (line - 1) / 2;
        int b = line -a +1;
        System.out.println((line % 2 == 0) ? a + "/" + b : b + "/" + a);
    }
}