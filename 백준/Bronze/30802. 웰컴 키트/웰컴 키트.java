import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int arr[] = new int[6];
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int i=0; i<6; i++)
                arr[i] = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine(), " ");
            br.close();
            int set_t = Integer.parseInt(st.nextToken());
            int set_p = Integer.parseInt(st.nextToken());
            int bundle_t = 0;
            for(int i=0; i<6; i++)
                bundle_t += (arr[i]/set_t) + (arr[i]%set_t == 0 ? 0 : 1);
            System.out.println(bundle_t + "\n" + (n/set_p) + " " + (n%set_p));
        }
}