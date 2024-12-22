import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        int[] arr = new int[10];
        while (n > 0) {
            int tmp = n%10;
            arr[tmp]++;
            n/=10;
        }
        int sixNine = (int)Math.ceil((arr[6]+arr[9])/2.0);
        arr[6]=arr[9]=0;

        int max =Integer.MIN_VALUE;
        for (int i = 0; i < 10; i++) {
            if(max < arr[i])
                max = arr[i];
        }
        System.out.println(Math.max(max, sixNine));
    }
}