import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] road = new long[n - 1];
        long[] oil = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n - 1; i++)
            road[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            oil[i] = Integer.parseInt(st.nextToken());
        long minOil = oil[0];
        long result=0;
        for (int i = 0; i < n - 1; i++) {
            if (oil[i] < minOil)
                minOil = oil[i];
            result += minOil * road[i];
        }
        System.out.println(result);
    }
}