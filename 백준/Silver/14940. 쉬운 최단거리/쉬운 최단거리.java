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
        StringBuilder sb = new StringBuilder();
        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        arr = new int[n][m];
        visited = new boolean[n][m];
        int targetX = 0, targetY = 0;
        for (int i = 0; i < n; i++) {
            s = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(s[j]);
                if (arr[i][j] == 2) {
                    targetX = i;
                    targetY = j;
                }
            }
        }
        br.close();
        bfs(targetX,targetY);
        for (int i = 0; i < n; i++) {
            for(int j=0; j<m; j++)
                if(arr[i][j]==1 && !visited[i][j])
                    arr[i][j]=-1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                sb.append(arr[i][j]).append(" ");
            sb.append("\n");
        }
        System.out.println(sb);
    }
    private static void bfs(int a, int b) {
        Queue<int[]> qu = new LinkedList<>();
        qu.add(new int[] {a, b});
        visited[a][b] = true;
        arr[a][b] = 0;
        while (!qu.isEmpty()) {
            int[] tmp = qu.poll();
            int x = tmp[0];
            int y = tmp[1];
            for (int c = 0; c < 4; c++) {
                int xx = x + dx[c];
                int yy = y + dy[c];
                if (xx >= 0 && xx < n && yy >= 0 && yy < m && arr[xx][yy] == 1 && !visited[xx][yy]) {
                    visited[xx][yy]=true;
                    arr[xx][yy] = arr[x][y]+1;
                    qu.add(new int[] {xx, yy});
                }
            }
        }
    }
}
