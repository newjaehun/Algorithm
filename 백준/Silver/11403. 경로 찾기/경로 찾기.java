import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        String[] s;
        for (int i = 0; i < n; i++) {
            s = br.readLine().split(" ");
            for (int j = 0; j < n; j++)
                arr[i][j] = Integer.parseInt(s[j]);
        }
        br.close();
        for (int c = 0; c < n; c++) {
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) {
                    if(arr[i][c] ==1 && arr[c][j]==1)
                        arr[i][j] = 1;
                }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                sb.append(arr[i][j]).append(" ");
            sb.append("\n");
        }
        System.out.println(sb);
    }
}