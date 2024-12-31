import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(br.readLine());
        while (p-- > 0) {
            st = new StringTokenizer(br.readLine());
            int g = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (g == 1) {
                for (int i = num; i <= n; i +=num)
                    arr[i] = arr[i]==1? 0: 1;
            } else {
                arr[num] = arr[num] == 1 ? 0 : 1;
                int left =num;
                int right = num;
                while (left >= 1 && right <= n && arr[left] == arr[right]) {
                    arr[left]=arr[left]==1? 0: 1;
                    arr[right]=arr[right]==1? 0: 1;
                    left--;
                    right++;
                }
            }
        }
        br.close();
        for(int i=1; i<=n; i++){
            sb.append(arr[i]).append(" ");
            if(i%20==0)
                sb.append("\n");
        }
        System.out.println(sb);
    }
}