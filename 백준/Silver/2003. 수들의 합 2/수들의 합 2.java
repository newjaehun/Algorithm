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
        int[] arr = new int[n+1];
        st = new StringTokenizer(br.readLine());
        br.close();
        for(int i=0; i<n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        int start=0, end=0, sum=0, result =0;
        while (end <=n) {
            if(sum>=m)
                sum -= arr[start++];
            else if(sum < m)
                sum += arr[end++];
            if(sum==m)
                result++;
        }
        System.out.println(result);
    }
}