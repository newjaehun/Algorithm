import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int count = 0;
        while (num-- > 0) {
            boolean check = false;
            int tmp = Integer.parseInt(st.nextToken());
            if(tmp==1) check = true;
            for (int j = 2; j < tmp; j++)
                if(tmp%j == 0)
                    check = true;
            if(!check)
                count++;
        }
        System.out.println(count);
        br.close();
    }
}