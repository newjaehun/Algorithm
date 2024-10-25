import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int r = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);
        int size = 1 << n;
        System.out.println(visiting(r, c, size));
    }
    private static int visiting(int r, int c, int size) {
        if(size == 1)
            return 0;

        int half = size / 2;
        if (r < half && c < half)
            return visiting(r,c,half);
        else if(r < half && c>=half)
            return (half*half)+visiting(r,c-half, half);
        else if(r>=half && c < half)
            return (2*half*half)+visiting(r-half, c, half);
        else
            return (3*half*half)+visiting(r-half, c-half, half);
    }
}
