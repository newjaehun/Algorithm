import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split(" ");
        int arr[] = new int[n];

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
            if(arr[i] > max) max = arr[i];
        }
        double sum = 0.0;

        for (int i = 0; i < n; i++) 
            sum+=((double) arr[i]/max)*100;
        System.out.println(sum/n);
    }
}

