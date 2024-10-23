import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int n, m;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {1,0,-1,0}, dy = {0, -1, 0, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);

        arr = new int[n][m];
        visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            s = br.readLine().split("");
            for (int j = 0; j < m; j++)
                arr[i][j] = Integer.parseInt(s[j]);
        }br.close();
        bfs(0, 0);
        System.out.println(arr[n-1][m-1]);
    }

    private static void bfs(int a, int b) {
        Queue<int[]> qu = new LinkedList<>();
        qu.add(new int[] {a, b});
        visited[a][b] = true;

        while (!qu.isEmpty()) {
            int[] tmp = qu.poll();
            int x = tmp[0];
            int y = tmp[1];
            for (int i = 0; i < 4; i++) {
                int xx = x + dx[i];
                int yy = y + dy[i];
                if (xx >= 0 && yy >= 0 && xx < n && yy < m && !visited[xx][yy] && arr[xx][yy] == 1) {
                    qu.add(new int[] {xx, yy});
                    visited[xx][yy]= true;
                    arr[xx][yy] = arr[x][y] + 1;
                }
            }
        }
    }
}