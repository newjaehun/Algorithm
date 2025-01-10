import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();
        StringTokenizer st;
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String door = st.nextToken();
            if(door.equals("enter"))
                set.add(name);
            else if(door.equals("leave"))
                set.remove(name);
        }
        br.close();
        ArrayList<String> list = new ArrayList<>(set);
        Collections.sort(list);
        for(int i = list.size()-1; i>=0; i--)
            sb.append(list.get(i)).append("\n");
        System.out.println(sb);
    }
}