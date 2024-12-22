import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String n = br.readLine();
        br.close();
        char[] arr = n.toCharArray();
        Arrays.sort(arr);
        int sum=0;
        for (int i = arr.length-1; i >=0; i--) {
            int tmp = arr[i] -'0';
            sum +=tmp;
            sb.append(tmp);
        }
        if (arr[0] != '0' || sum % 3 != 0) {
            System.out.println(-1);
            return;
        }
        System.out.println(sb);
    }
}