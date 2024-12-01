import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++)
            arr1[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        br.close();
        for(int i=0; i<n; i++)
            arr2[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < n/2; i++) {
            int tmp = arr2[i];
            arr2[i] = arr2[n-i-1];
            arr2[n-i-1] = tmp;
        }

        int answer = 0;
        for(int i=0; i<n; i++)
            answer += arr1[i]*arr2[i];
        System.out.println(answer);
    }
}