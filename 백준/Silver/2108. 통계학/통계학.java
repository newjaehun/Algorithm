import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        int sum =0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        Arrays.sort(arr);

        int tmp = arr[0];
        int count =0;
        int max = -1;
        boolean check = false;
        for (int i = 0; i < n-1; i++) {
            count = (arr[i] == arr[i+1]) ? (count + 1) : 0;
            if (max < count) {
                max = count;
                tmp = arr[i];
                check = true;
            } else if (max == count && check) {
                tmp = arr[i];
                check = false;
            }
        }
        System.out.println((int)(Math.round(((double)sum / n)))+"\n"+(arr[n / 2])+"\n"+tmp+"\n"+(Math.abs(arr[n - 1] - arr[0])));
        br.close();
    }
}