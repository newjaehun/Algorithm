import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n, s, result=0;
    static int[] arr;
       public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           StringTokenizer st = new StringTokenizer(br.readLine());
           n = Integer.parseInt(st.nextToken());
           s = Integer.parseInt(st.nextToken());
           arr = new int[n];
           st = new StringTokenizer(br.readLine());
           for(int i=0; i<n; i++)
               arr[i] = Integer.parseInt(st.nextToken());
           int sum=0, index=0;
           if(s==0) result--;
           check(index, sum);
           System.out.println(result);
    }
    private static void check(int index, int sum) {
        if (index == n) {
            if(sum==s)
                result++;
            return;
        }
        check(index+1, sum+arr[index]);
        check(index+1, sum);
    }
}