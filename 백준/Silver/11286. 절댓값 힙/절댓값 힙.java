import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> qu = new PriorityQueue<>((a,b)->{
            int a2 = Math.abs(a), b2 = Math.abs(b);
            return (a2 == b2) ? Integer.compare(a, b) : Integer.compare(a2, b2);
        });
        while (n-- > 0) {
            int tmp = Integer.parseInt(br.readLine());
            if (tmp != 0) {
                qu.add(tmp);
            }else{
                sb.append(qu.isEmpty()? "0" : qu.poll()).append("\n");
            }
        }
        br.close();
        System.out.println(sb);
    }
}