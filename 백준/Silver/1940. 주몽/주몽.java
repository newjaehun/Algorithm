import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        for(int i=0; i<n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        int left =0, right = n-1, result = 0;
        while (left <right) {
            int tmp = arr[left]+arr[right];
            if(tmp < m)
                left++;
            else if(tmp > m)
                right--;
            else{
                result++;
                left++;
                right--;
            }
        }
        System.out.println(result);
    }
}