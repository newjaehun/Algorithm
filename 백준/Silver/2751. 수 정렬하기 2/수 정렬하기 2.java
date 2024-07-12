import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0; i<n; i++)
            arrayList.add(Integer.parseInt(br.readLine()));
        br.close();
        Collections.sort(arrayList);
        for (int i = 0; i < n; i++)
            sb.append(arrayList.get(i)).append("\n");
        System.out.println(sb);
    }
}
