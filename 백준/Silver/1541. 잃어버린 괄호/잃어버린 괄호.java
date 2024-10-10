import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        br.close();
        int result = Integer.MAX_VALUE;
        while (st.hasMoreTokens()) {
            String tmp = st.nextToken();
            int sum=0;
            StringTokenizer st1 = new StringTokenizer(tmp, "+");
            while (st1.hasMoreTokens())
                sum += Integer.parseInt(st1.nextToken());
            result = (result==Integer.MAX_VALUE)? sum : result-sum;
        }
        System.out.println(result);
    }
}