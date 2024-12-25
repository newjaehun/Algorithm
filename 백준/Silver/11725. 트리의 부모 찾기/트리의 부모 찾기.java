import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> arrayList;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        arr = new int[n + 1];
        visited = new boolean[n + 1];
        arrayList = new ArrayList<>();
        for(int i=0; i<=n; i++)
            arrayList.add(new ArrayList<Integer>());
        for (int i = 1; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arrayList.get(a).add(b);
            arrayList.get(b).add(a);
        }
        bfs(1);
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= n; i++) {
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb);
    }
    public static void bfs(int index) {
        Queue<Integer> qu = new LinkedList<>();
        visited[index] = true;
        qu.add(index);
        while (!qu.isEmpty()) {
            int tmp = qu.poll();
            for (int next : arrayList.get(tmp)) {
                if (!visited[next]) {
                    visited[next] = true;
                    arr[next] = tmp;
                    qu.add(next);
                }
            }
        }
    }
}