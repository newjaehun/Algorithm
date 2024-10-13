import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        int low = 0, high = 0;
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        br.close();
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] > high)
                high = arr[i];
        }
        while (low<high) {
            int mid = (low +high)/2;
            long result = 0;

            for(int i=0; i<n; i++)
                if(arr[i] > mid)
                    result += (arr[i]-mid);

            if(result >= m)
                low = mid + 1;
            else
                high = mid;
        }
        System.out.println(low-1);
    }
}