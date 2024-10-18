import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n, m, x, y, result=0;
    static int[] dx = {1, 0, -1, 0}, dy = {0, -1, 0, 1};
    static char[][] arr;
    static boolean[][] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new char[n][m];
        visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            char[] inputToChar = input.toCharArray();
            for (int j = 0; j < m; j++) {
                arr[i][j] = inputToChar[j];
                if (arr[i][j] == 'I') {
                    x=i;
                    y=j;
                }
            }
        }br.close();
        dfs(x, y);
        System.out.println((result==0)? "TT" : result);
    }
    private static void dfs(int x, int y) {
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int xx = x + dx[i];
            int yy = y + dy[i];
            if ((xx < 0) || (yy < 0) || (xx >= n) || (yy >= m) || visited[xx][yy] || (arr[xx][yy] == 'X')) {continue;}
            if(arr[xx][yy] == 'P')
                result++;
            dfs(xx, yy);
        }
    }
}