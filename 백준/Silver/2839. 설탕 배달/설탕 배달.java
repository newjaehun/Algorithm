import java.io.*;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        if (n < 5) {
            if (n == 3) System.out.println(1);
            else System.out.println(-1);
            return;
        }
        int[] arr = new int[n + 1];
        Arrays.fill(arr, 9999);
        arr[3] = arr[5] = 1;
        for (int i = 6; i < arr.length; i++)
            arr[i] = Math.min(arr[i - 3], arr[i - 5]) + 1;


        if (arr[n] >= 9999)
            System.out.println(-1);
        else
            System.out.println(arr[n]);
    }
}
