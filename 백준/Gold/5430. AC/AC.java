import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> deque;
        StringTokenizer st;

        while (t-- > 0) {
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine(), "[],");
            deque = new ArrayDeque<>();
            boolean reverse = false, isError=false ;

            for(int i=0; i<n; i++)
                deque.add(Integer.parseInt(st.nextToken()));


            for (int i = 0; i < p.length(); i++) {
                if (p.charAt(i) == 'R') {
                    reverse = (reverse==true)? false:true;
                } else if (p.charAt(i) == 'D') {
                    if (deque.isEmpty()) {
                        sb.append("error\n");
                        isError = true;
                        break;
                    }else {
                        if (reverse)
                            deque.removeLast();
                        else
                            deque.removeFirst();
                    }
                }
            }
            if (!isError) {
                sb.append("[");
                while (!deque.isEmpty()) {
                    sb.append((reverse)? deque.removeLast() : deque.removeFirst());
                    if (!deque.isEmpty())
                        sb.append(",");
                }
                sb.append("]\n");
            }
        }
        br.close();
        System.out.println(sb);
    }
}