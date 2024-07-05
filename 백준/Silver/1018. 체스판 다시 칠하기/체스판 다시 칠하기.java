import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        char arr[][] = new char[n][m];
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++)
                arr[i][j] = line.charAt(j);
        }

        int count = Integer.MAX_VALUE;

        for (int i = 0; i < n - 7; i++)
            for (int j = 0; j < m - 7; j++) {
                int tmp = check(arr, i, j);
                count = (tmp < count) ? tmp : count;
            }
        System.out.println(count);
    }

    public static int check(char arr[][], int i, int j) {
        int tmp = Integer.MAX_VALUE, count;
        char w[] = {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'};
        char b[] = {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'};
        char comp[] = w;

        for (int ii = 0; ii < 2; ii++) {
            count=0;
            for (int k = i; k < i + 8; k++) {
                int index=0;
                for (int l = j; l < j + 8; l++)
                    if (arr[k][l] != comp[index++]) count++;
                comp = (comp == w) ? b : w;
            }
            tmp = (tmp > count) ? count : tmp;
            comp = b;
        }
        return tmp;
    }
}