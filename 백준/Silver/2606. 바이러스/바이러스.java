import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
        public static int n, set_n, result=0;
        public static int[][] arr;
        public static boolean[] check;

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;

            n = Integer.parseInt(br.readLine());
            set_n = Integer.parseInt(br.readLine());

            arr = new int[n+1][n+1];
            check = new boolean[n + 1];

            for(int i=0; i<set_n; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                arr[a][b] = arr[b][a] =1;
            }
            br.close();
            dfs(1);
            System.out.println(result);
        }
        
        private static void dfs(int input) {
            check[input] = true;
            for (int i = 1; i <= n; i++) {
                if (arr[input][i] == 1 && !check[i]) {
                    dfs(i);
                    result++;
                }
            }
        }
}