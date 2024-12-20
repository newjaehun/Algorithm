import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int result = Integer.MAX_VALUE, setPrice = Integer.MAX_VALUE, eachPrice = Integer.MAX_VALUE;
        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            setPrice = Math.min(setPrice, Integer.parseInt(st.nextToken()));
            eachPrice = Math.min(eachPrice, Integer.parseInt(st.nextToken()));
        }
        result = Math.min(setPrice * (n / 6 + 1), eachPrice * n);
        result = Math.min(result, setPrice * (n / 6) + eachPrice * (n % 6));
        br.close();
        System.out.println(result);
    }
}