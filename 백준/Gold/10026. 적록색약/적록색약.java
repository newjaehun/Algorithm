import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int n;
    static char[][] arr;
    static boolean[][] visited;
    static int[] dx = {1,0,-1,0}, dy = {0, -1, 0, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int right=0, wrong=0;
        arr = new char[n][n];
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            char[] s = br.readLine().toCharArray();
            for (int j = 0; j < n; j++)
                arr[i][j] = s[j];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    bfs(i,j);
                    right++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                if(arr[i][j] == 'G')
                    arr[i][j] = 'R';
        }
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    bfs(i,j);
                    wrong++;
                }
            }
        }
        System.out.println(right + " " + wrong);
    }
    private static void bfs(int a, int b) {
        Queue<int[]> qu = new LinkedList<>();
        qu.add(new int[] {a, b});
        visited[a][b] = true;
        char color = arr[a][b];
        while (!qu.isEmpty()) {
            int[] tmp = qu.poll();
            int y = tmp[0];
            int x = tmp[1];
            for (int i = 0; i < 4; i++) {
                int yy = y+dy[i];
                int xx = x+dx[i];
                if (yy >= 0 && yy < n && xx >= 0 && xx < n && !visited[yy][xx]&&arr[yy][xx] == color) {
                    qu.add(new int[]{yy, xx});
                    visited[yy][xx] = true;
                }
            }
        }
    }
}