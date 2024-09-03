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
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(br.readLine());
            br.close();
            int result = 0;
            while (n > 0) {
                if(m < arr[n-1])
                    n--;
                else{
                    result+=(m/arr[n-1]);
                    m%=arr[n-1];
                    n--;
                }
            }
            System.out.println(result);
        }
}