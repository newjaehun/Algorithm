import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            int d = (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1);
            int rr1 = (r1+r2)*(r1+r2);
            int rr2 = (r2-r1) * (r2-r1);
            if(d==0 && r1 ==r2)
                sb.append(-1).append("\n");
            else if(d > rr1 || d < rr2)
                sb.append(0).append("\n");
            else if(d==rr1 || d == rr2)
                sb.append(1).append("\n");
            else
                sb.append(2).append("\n");
        }
        br.close();
        System.out.println(sb);
    }
}