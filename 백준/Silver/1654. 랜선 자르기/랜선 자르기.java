import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int arr[] = new int[k];
        long max = 0;
        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i]> max) max = arr[i];
        }
        long min =1;

        while (min<=max) {
            long mid = (min + max) / 2;
            int count=0;
            for (int i = 0; i < k; i++)
                count += arr[i]/mid;

            if(count < n) max = mid-1;
            else min = mid+1;
        }
        System.out.println(max);
    }
}