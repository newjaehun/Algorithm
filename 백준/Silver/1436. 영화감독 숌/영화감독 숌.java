import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count =0;
        int result = 666;

        while(count!=n){
            if((result+"").contains("666")){
                count++;
            }
            result++;
            
        }
        
        
        System.out.println(result-1);
        br.close();
    }
    
}
