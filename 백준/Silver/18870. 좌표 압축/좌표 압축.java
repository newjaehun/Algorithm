import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {arr[i] = Integer.parseInt(st.nextToken());}

        int[] arr2 = Arrays.copyOf(arr,n);
        arr2 = Arrays.stream(arr2).distinct().sorted().toArray();
        for (int i = 0; i < arr2.length; i++) {map.put(arr2[i], i);}

        for (int i = 0; i < n; i++) {sb.append(map.get(arr[i])).append(" ");}
        System.out.println(sb);
    }
}