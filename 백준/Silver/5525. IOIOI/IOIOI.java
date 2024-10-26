import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        String s = br.readLine();
        br.close();

        int count = 0, cycleCount =0;
        for (int i = 0; i < m - 1; i++) {
            if (s.charAt(i) == 'I' && i + 2 < m && s.charAt(i + 1) == 'O' && s.charAt(i + 2) == 'I') {
                cycleCount++;
                i += 1;
                if (cycleCount == n) {
                    count++;
                    cycleCount--;
                }
            } else {
                cycleCount = 0;
            }
        }
        System.out.println(count);
    }
}