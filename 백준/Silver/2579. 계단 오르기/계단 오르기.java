import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        if(n==1){
            System.out.println(Integer.parseInt(br.readLine()));
            return;
        }
        arr[1] = Integer.parseInt(br.readLine());
        int before = Integer.parseInt(br.readLine());
        arr[2] = arr[1] + before;
        for (int i = 3; i <= n; i++) {
            int num = Integer.parseInt(br.readLine());
            int comp1 = arr[i - 2] + num;
            int comp2 = arr[i - 3] + before + num;
            arr[i] = Math.max(comp1, comp2);
            before = num;
        }
        System.out.println(arr[n]);
    }
}