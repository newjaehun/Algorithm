/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.println(t + " " + h);
    }
}
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int t = Integer.MAX_VALUE, h = 0;

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] > max) { max = arr[i][j];}
                if (arr[i][j] < min) { min = arr[i][j];}
            }
        }br.close();

        for (int tmp_h = min; tmp_h <= max; tmp_h++) {
            int tmp_t = 0;
            int tmp_b = b;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (arr[i][j] > tmp_h) {
                        int count_b = arr[i][j]-tmp_h;
                        tmp_t += 2*count_b;
                        tmp_b += count_b;
                    } else if (arr[i][j] < tmp_h) {
                        int count_b = tmp_h - arr[i][j];
                        tmp_t += count_b;
                        tmp_b -= count_b;
                    }
                }
            }
            if (tmp_b < 0) {continue;}
            if (tmp_t <= t) {
                t = tmp_t;
                h = tmp_h;
            }
        }
        System.out.println(t + " " + h);
    }
}