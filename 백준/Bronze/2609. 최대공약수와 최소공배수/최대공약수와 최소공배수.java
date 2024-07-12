import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c=0;
        int tmp = (a < b)? a:b;
        for (int i = 1; i <=tmp; i++)
            if((a%i)==0&&(b%i)==0)
                c=i;
        System.out.println(c +"\n"+(a*b/c));
        br.close();
    }
}