import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
        public static void main(String[] args) throws IOException {
            final long M = 1234567891;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            long result = 0;
            long r = 1;
            for (int i = 0; i < n; i++) {
                result += ((s.charAt(i) - 96) * r);
                r = (r*31)%M;
            }
            System.out.println(result%M);
        }
    }