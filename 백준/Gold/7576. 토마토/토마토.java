import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {1, 0, -1, 0}, dy = {0, -1, 0, 1};
    static int m,n;
    static int[][] arr;
    static Queue<int[]> qu;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        qu = new LinkedList<>();
        boolean noRipe = false;

        for (int a = 0; a < n; a++) {
            st = new StringTokenizer(br.readLine());
            for (int b = 0; b < m; b++) {
                arr[a][b] = Integer.parseInt(st.nextToken());
                if (arr[a][b] == 1)
                    qu.add(new int[] {a, b});
                else if (arr[a][b] == 0)
                    noRipe = true;
            }
        }
        br.close();
        if (!noRipe)
            System.out.println(0);
        else
            System.out.println(bfs());
    }
    private static int bfs() {
        int result = 0;
        while (!qu.isEmpty()) {
            int[] tmp = qu.poll();
            int y = tmp[0];
            int x = tmp[1];
            for (int i = 0; i < 4; i++) {
                int yy = y + dy[i];
                int xx = x + dx[i];
                if (yy >= 0 && yy < n && xx >= 0 && xx < m && arr[yy][xx] == 0) {
                    arr[yy][xx] = arr[y][x] + 1;
                    qu.add(new int[]{yy,xx});
                    result = Math.max(result, arr[yy][xx]);
                }
            }
        }
        for (int a = 0; a < n; a++)
            for (int b = 0; b < m; b++)
                if (arr[a][b] == 0)
                    return -1;
        return result == 0? -1: result-1;
    }
}