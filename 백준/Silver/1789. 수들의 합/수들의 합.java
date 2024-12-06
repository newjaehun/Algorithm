import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long s = Long.parseLong(br.readLine());
        br.close();
        long sum=0,n=1;
        while (true) {
            sum+=n;
            if (sum >= s) {
                System.out.println(sum == s ?n:n-1);
                break;
            }
            n++;
        }
    }
}