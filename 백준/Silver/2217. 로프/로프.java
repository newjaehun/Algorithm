import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(br.readLine());
        br.close();
        Arrays.sort(arr);
        int result =0;
        for (int i = 0; i < n; i++)
            result = Math.max(result, arr[i] * (n - i));
        System.out.println(result);
    }
}