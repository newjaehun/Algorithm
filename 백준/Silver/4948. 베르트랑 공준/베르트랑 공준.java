import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean[] prime = new boolean[246913];
        for (int i = 2; i*i <= 246912; i++) {
            if (!prime[i])
                for(int j=i*i; j<=246912; j+=i)
                    prime[j] = true;
        }
        int n = Integer.parseInt(br.readLine());
        while (n != 0) {
            int tmp = 0;
            for(int i=n+1; i<=2*n; i++)
                if(!prime[i])
                    tmp++;
            sb.append(tmp).append("\n");
            n = Integer.parseInt(br.readLine());
        }
        System.out.println(sb);
    }
}