import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {1, 1, 0, -1, -1, -1, 0,1};
    static int[] dy = {0, -1, -1, -1, 0, 1, 1,1};
    static int[][]arr;
    static int w,h, count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            count=0;
            if(w==0 && h==0)
                break;
            arr = new int[h][w];
            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j=0; j<w; j++)
                    arr[i][j] = Integer.parseInt(st.nextToken());
            }
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (arr[i][j] == 1) {
                        count++;
                        dfs(i, j);
                    }
                }
            }
            sb.append(count).append("\n");
        }
        br.close();
        System.out.println(sb);
    }

    private static void dfs(int x, int y) {
        arr[x][y]=0;
        for (int d = 0; d < 8; d++) {
            int xx = x + dx[d];
            int yy = y + dy[d];
            if (xx >= 0 && yy >= 0 && xx < h && yy < w) {
                if (arr[xx][yy] == 1) {
                    dfs(xx,yy);
                }
            }
        }
    }
}