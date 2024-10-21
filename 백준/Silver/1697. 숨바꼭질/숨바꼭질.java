import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int k;
    static int[] arr = new int[100001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        System.out.println(bfs(n));
    }
    private static int bfs(int n) {
        Queue<Integer> qu = new LinkedList<>();
        qu.add(n);
        arr[n] = 1;
        while (!qu.isEmpty()) {
            int now = qu.poll();
            if(now == k)
                return arr[now]-1;
            if((now-1>=0) && arr[now-1]==0) {
                arr[now-1] = arr[now] + 1;
                qu.add(now - 1);
            }
            if((now+1<=100000) && arr[now+1]==0) {
                arr[now+1] = arr[now] + 1;
                qu.add(now + 1);
            }
            if((2*now<=100000) && arr[2*now]==0) {
                arr[2*now] = arr[now] + 1;
                qu.add(2*now);
            }
        }
        return 0;
    }
}