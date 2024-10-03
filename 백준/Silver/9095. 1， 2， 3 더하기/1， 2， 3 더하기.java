import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
       int n = Integer.parseInt(br.readLine());
        int[] arr = new int[12];
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;
        for(int i=4; i<12; i++)
            arr[i] = arr[i-3]+arr[i-2]+arr[i-1];
        for(int i=0; i<n; i++)
            sb.append(arr[Integer.parseInt(br.readLine())]).append("\n");
        br.close();
        System.out.println(sb);
    }
}