import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            int n3 = Integer.parseInt(st.nextToken());
            if(n1==0&&n2==0&&n3==0)
                break;
            System.out.println(((n1*n1+n2*n2)==n3*n3||(n1*n1+n3*n3)==n2*n2||(n2*n2+n3*n3)==n1*n1)? "right": "wrong");
        }
        br.close();
    }
}