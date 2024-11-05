import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[101];
        visited = new boolean[101];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            arr[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
        }
        br.close();
        System.out.println(bfs());
    }
    private static int bfs() {
        Queue<int[]> qu = new LinkedList<>();
        qu.add(new int[]{1,0});
        visited[1] = true;
        while (!qu.isEmpty()) {
            int[] tmp = qu.poll();
            int loc = tmp[0];
            int count = tmp[1];
            if(loc == 100)
                return count;
            for (int i = 1; i <= 6; i++) {
                int nextLoc = loc + i;
                if (nextLoc <= 100 && !visited[nextLoc]) {
                    visited[nextLoc]= true;
                    if (arr[nextLoc] == 0) {
                        qu.add(new int[]{nextLoc, count+1});
                    }else{
                        nextLoc = arr[nextLoc];
                        if (!visited[nextLoc]) {
                            visited[nextLoc] = true;
                            qu.add(new int[]{nextLoc, count+1});
                        }
                    }
                }
            }
        }
        return -1;
    }
}