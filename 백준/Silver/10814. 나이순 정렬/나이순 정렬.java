import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[][] = new int[n][2];
        String sarr[] = new String[n];
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = i;
            sarr[i] = st.nextToken();
        }
        br.close();
        Arrays.sort(arr, (o1, o2) -> o1[0] - o2[0]);
        for (int i = 0; i < n; i++)
            sb.append(arr[i][0]).append(" ").append(sarr[arr[i][1]]).append("\n");
        System.out.println(sb);
    }
}