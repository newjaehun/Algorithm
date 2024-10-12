import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static int bk=0, wh=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<n; j++ )
                arr[i][j] = Integer.parseInt(st.nextToken());
        } br.close();
        cutting(0, 0, n);
        System.out.println(wh + "\n" + bk);
    }
    private static void cutting(int r, int c, int n) {
        if (checking(r, c, n)) {
            if(arr[r][c] == 0)
                wh++;
            else
                bk++;
            return;
        }
        int nn = n/2;
        cutting(r,c,nn);
        cutting(r+nn,c,nn);
        cutting(r,c+nn,nn);
        cutting(r+nn,c+nn,nn);
    }

    private static boolean checking(int r, int c, int nn) {
        int first = arr[r][c];
        for(int i = r; i< r+nn; i++)
            for(int j = c; j < c+nn; j++)
                if(arr[i][j] != first)
                    return false;
        return true;
    }
}