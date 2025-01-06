import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        int start = 1, size = 1, result = 0;
        while (start <= n) {
         int end = start*10-1;
         int count = Math.min(end,n) - start +1;
         result += count*size;
         start*=10;
         size++;
        }
        System.out.println(result);
    }
}