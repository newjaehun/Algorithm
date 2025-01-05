import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int e = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int result=0;
        int ee=00, ss=0, mm=0;
        while (true) {
            if (e == ee && s == ss && m == mm) {
                break;
            }
            ee++;
            ss++;
            mm++;
            result++;
            if(ee>15) ee=1;
            if(ss>28) ss=1;
            if(mm>19) mm=1;
        }
        System.out.println(result);
    }
}