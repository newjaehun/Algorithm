import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(br.readLine());
            Arrays.sort(arr);
            int tmp = (int) Math.round(n * 0.15);
            int arr2[] = Arrays.copyOfRange(arr, tmp, (n - tmp));
            int sum=0, size = arr2.length;
            for(int i=0; i<size; i++)
                sum += arr2[i];
            System.out.println((int)Math.round((double)sum/size));
        }
    }