import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static class Register {
        int value;
        String command;
        public Register(int value, String command) {
            this.value = value;
            this.command = command;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        boolean[] visited;
        while (t-- > 0) {
            visited = new boolean[10000];
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            bfs(a, b, visited, sb);
        }
        br.close();
        System.out.println(sb);
    }
    private static void bfs(int a, int b, boolean[] visited, StringBuilder sb) {
        Queue<Register> qu = new LinkedList<>();
        qu.add(new Register(a, ""));
        visited[a] = true;
        while (!qu.isEmpty()) {
            Register register = qu.poll();
            int value = register.value;
            String command = register.command;

            int tmp_value = (value*2)%10000;
            if (!visited[tmp_value]) {
                visited[tmp_value]=true;
                qu.add(new Register(tmp_value, command + "D"));
                if (tmp_value == b) {
                    sb.append(command).append("D\n");
                    return;
                }
            }
            tmp_value = (value !=0)? value-1: 9999;
            if (!visited[tmp_value]) {
                visited[tmp_value]=true;
                qu.add(new Register(tmp_value, command + "S"));
                if (tmp_value == b) {
                    sb.append(command).append("S\n");
                    return;
                }
            }
            tmp_value = (value%1000) * 10 + (value/1000);
            if (!visited[tmp_value]) {
                visited[tmp_value]=true;
                qu.add(new Register(tmp_value, command + "L"));
                if (tmp_value == b) {
                    sb.append(command).append("L\n");
                    return;
                }
            }
            tmp_value = (value % 10) * 1000 + (value / 10);
            if (!visited[tmp_value]) {
                visited[tmp_value]=true;
                qu.add(new Register(tmp_value, command + "R"));
                if (tmp_value == b) {
                    sb.append(command).append("R\n");
                    return;
                }
            }
        }
    }
}