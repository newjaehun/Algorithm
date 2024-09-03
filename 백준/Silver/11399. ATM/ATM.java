import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            for(int i=0; i<n ;i++)
                arr[i]= Integer.parseInt(st.nextToken());
            int result = 0;
            Arrays.sort(arr);
            for (int i = 1; i <=n; i++) {
                int tmp =0;
                for(int j=0; j<i; j++)
                    tmp += arr[j];
                result +=tmp;
            }
            System.out.println(result);
        }
}
