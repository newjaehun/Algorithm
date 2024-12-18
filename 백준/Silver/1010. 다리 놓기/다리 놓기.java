import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int[][] arr = new int[31][31];
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < 31; i++) {
            arr[i][0]=1;
            arr[i][i]=1;
        }
        for(int i=1; i<31; i++)
            for(int j=1; j<i; j++)
                arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
        while (t-- >0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            sb.append(arr[m][n]).append("\n");
        }
        br.close();
        System.out.println(sb);
    }
}