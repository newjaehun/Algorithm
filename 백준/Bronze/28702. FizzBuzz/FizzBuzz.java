import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
        public static void main(String[] args) throws IOException {
            final long M = 1234567891;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s1 = br.readLine();
            String s2 = br.readLine();
            String s3 = br.readLine();
            int result = check(s1) ? Integer.parseInt(s1) + 3 : (check(s2) ? Integer.parseInt(s2) + 2 : Integer.parseInt(s3) + 1);
            if (result % 3 == 0) {
                if (result % 5 == 0) {
                    System.out.println("FizzBuzz");
                    return;
                }
                System.out.println("Fizz");
            } else if (result % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(result);
        }
    private static boolean check(String s) {
        return s.matches("-?\\d+(\\.\\d+)?");
    }
}