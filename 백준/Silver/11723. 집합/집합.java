import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            int m = Integer.parseInt(br.readLine());
            int bitMask = 0;
            StringTokenizer st;
            while (m-- > 0) {
                st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                int num = 0;
                if (st.hasMoreTokens()) {
                    num = Integer.parseInt(st.nextToken()) - 1;
                }
                switch (name) {
                    case "add":
                        bitMask |= (1 << num);
                        break;
                    case "remove":
                        bitMask &= ~(1 << num);
                        break;
                    case "check":
                        sb.append(((bitMask & (1 << num)) == (1 << num)) ? "1\n" : "0\n");
                        break;
                    case "toggle":
                        bitMask ^= (1 << num);
                        break;
                    case "all":
                        bitMask = (1 << 21) - 1;
                        break;
                    case "empty":
                        bitMask = 0;
                        break;
                }
            }
            br.close();
            System.out.println(sb);
        }
}