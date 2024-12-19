import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int result=0;

        TreeSet<Integer> setA = new TreeSet<>();
        TreeSet<Integer> setB = new TreeSet<>();

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<a; i++)
            setA.add(Integer.parseInt(st.nextToken()));

        st = new StringTokenizer(br.readLine());
        br.close();
        for(int i=0; i<b; i++)
            setB.add(Integer.parseInt(st.nextToken()));

        for(int i: setB)
            if(!setA.contains(i))
                result++;

        for(int i : setA)
            if(!setB.contains(i))
                result++;

        System.out.println(result);
    }
}