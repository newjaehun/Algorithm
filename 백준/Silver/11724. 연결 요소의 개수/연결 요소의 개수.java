import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());

        boolean[] visited = new boolean[n + 1];
        LinkedList<Integer>[] list = new LinkedList[n + 1];
        for (int i = 0; i <= n; i++) {
            list[i] = new LinkedList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            list[u].add(v);
            list[v].add(u);
        }
        br.close();

        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                result++;
                dfs(list, visited, i);
            }
        }
        System.out.println(result);
    }

    private static void dfs(LinkedList<Integer>[] list, boolean[] visited, int u) {
        visited[u] = true;
        for (int v : list[u]) {
            if (!visited[v]) {
                dfs(list, visited, v);
            }
        }
    }
}
