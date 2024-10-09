import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int m, n;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int result = 0;
            st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            arr = new int[m][n];
            visited = new boolean[m][n];
            while (k-- > 0) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                arr[a][b] = 1;
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++)
                    if (arr[i][j] == 1 && !visited[i][j]) {
                        dfs(i, j);
                        result++;
                    }
            }
            sb.append(result).append("\n");
        }
        br.close();
        System.out.println(sb);
    }
    private static void dfs(int x, int y) {
        visited[x][y] = true;
        for(int d=0; d<4; d++){
            int xx = x + dx[d];
            int yy = y + dy[d];
            if(xx >=0 && yy >=0 && xx < m && yy < n)
                if(arr[xx][yy]==1 && !visited[xx][yy])
                    dfs(xx,yy);
        }
    }
}