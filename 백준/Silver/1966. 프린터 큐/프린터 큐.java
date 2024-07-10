import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        while(num-- >0) {
            Queue<int[]> queue = new LinkedList<>();
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int qSize = Integer.parseInt(st.nextToken());
            int qFind = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < qSize; i++)
                queue.offer(new int[]{Integer.parseInt(st.nextToken()), i});
            
            int result = 0;
            while (!queue.isEmpty()) {
                int[] tmp = queue.poll();
                boolean check = true;

                for (int[] q : queue)
                    if (tmp[0] < q[0]) {
                        check = false;
                        break;
                    }

                if (check) {
                    result++;
                    if(tmp[1] == qFind)
                        break;
                }else
                    queue.offer(tmp);
            }
            System.out.println(result);
        }
    }
}