import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    static int n, count;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {1,0,-1,0}, dy = {0, -1, 0, 1};
    static List<Integer> result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        visited = new boolean[n][n];
        result = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++)
                arr[i][j] = s.charAt(j) - '0';
        }
        br.close();

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                if (arr[x][y] == 1 && !visited[x][y]) {
                    count =1;
                    bfs(x,y);
                    result.add(count);
                }
            }
        }
        Collections.sort(result);
        sb.append(result.size()).append("\n");
        for(int tmp : result)
            sb.append(tmp).append("\n");
        System.out.println(sb);
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
                if (xx >= 0 && yy >= 0 && xx < n && yy < n && !visited[xx][yy] && arr[xx][yy] == 1) {
                    qu.add(new int[] {xx, yy});
                    visited[xx][yy]=true;
                    count++;
                }
            }
        }
    }
}