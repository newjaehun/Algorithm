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
        int[][] arr = new int[n + 1][n + 1];
        for(int i=1; i<=n; i++)
            for(int j=1; j<=n; j++)
                arr[i][j] = (i==j)? 0: 9999;

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = arr[b][a] = 1;
        }br.close();

        for (int c = 1; c <= n; c++) {
            for (int i = 1; i <= n; i++)
                for (int j = 1; j <= n; j++)
                    if (arr[i][j] > arr[i][c] + arr[c][j])
                        arr[i][j] = arr[i][c] + arr[c][j];
        }

        int ans = 0, sum = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            int tmp_sum = 0;
            for(int j=1; j<=n; j++)
                tmp_sum += arr[i][j];
            if (sum > tmp_sum) {
                sum = tmp_sum;
                ans = i;
            }
        }
        System.out.println(ans);
    }
}