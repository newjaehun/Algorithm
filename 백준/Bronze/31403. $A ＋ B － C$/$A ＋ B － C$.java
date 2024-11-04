import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        br.close();
        sb.append(a + b - c).append("\n");
        sb.append(Integer.parseInt(String.valueOf(a) + String.valueOf(b)) - Integer.parseInt(String.valueOf(c)));
        System.out.println(sb);
    }
}