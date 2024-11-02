import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {1, 0, -1, 0, 0, 0}, dy = {0, -1, 0, 1, 0, 0}, dz = {0, 0, 0, 0, 1, -1};
    static int m,n, h;
    static int[][][] arr;
    static Queue<int[]> qu;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        arr = new int[h][n][m];
        qu = new LinkedList<>();
        boolean noRipe = false;

        for (int a = 0; a < h; a++) {
            for (int b = 0; b < n; b++) {
                st = new StringTokenizer(br.readLine());
                for (int c = 0; c < m; c++) {
                    arr[a][b][c] = Integer.parseInt(st.nextToken());
                    if (arr[a][b][c] == 1)
                        qu.add(new int[] {a, b, c});
                    else if(arr[a][b][c] == 0)
                        noRipe = true;
                }
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
            int z = tmp[0];
            int y = tmp[1];
            int x = tmp[2];
            for (int i = 0; i < 6; i++) {
                int zz = z + dz[i];
                int yy = y + dy[i];
                int xx = x + dx[i];
                if (zz >= 0 && zz < h && yy >= 0 && yy < n && xx >= 0 && xx < m && arr[zz][yy][xx] == 0) {
                    arr[zz][yy][xx] = arr[z][y][x] + 1;
                    qu.add(new int[]{zz,yy,xx});
                    result = Math.max(result, arr[zz][yy][xx]);
                }
            }
        }
        for (int a = 0; a < h; a++) {
            for (int b = 0; b < n; b++)
                for (int c = 0; c < m; c++)
                    if (arr[a][b][c] == 0)
                        return -1;
        }
        return result == 0? -1: result-1;
    }
}