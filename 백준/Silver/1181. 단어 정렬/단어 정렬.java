import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String arr[] = new String[n];
        for (int i = 0; i < n; i++)
            arr[i] = br.readLine();

        Arrays.sort(arr);

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        arr = (String[]) Arrays.stream(arr).distinct().toArray(String[]::new);

        for (int i = 0; i < arr.length; i++)
            bw.write(arr[i] + "\n");

        bw.flush();
        bw.close();
    }
}