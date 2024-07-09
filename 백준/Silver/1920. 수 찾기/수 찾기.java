import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int arr1[] = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++)
            arr1[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr1);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        br.close();
        for (int i = 0; i < m; i++)
            System.out.println(check(arr1, Integer.parseInt(st.nextToken())));
    }

    private static int check(int[] arr, int tmp) {
        int min = 0;
        int max = arr.length-1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (arr[mid] == tmp)
                return 1;
            else if(arr[mid] > tmp)
                max = mid - 1;
            else if(arr[mid] < tmp)
                min = mid + 1;
        }
        return 0;
    }
}