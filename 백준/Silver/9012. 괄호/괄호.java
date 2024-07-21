import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        for(int i=0; i<n; i++){
            String s =bf.readLine();
            int size = s.length();
            int checkcount=0;
            boolean oc= (s.charAt(0)==41)? true: false; // (면 true, )면 false;
            for(int j=0; j<size; j++){
                if(s.charAt(0)==41) {
                    checkcount = -1;
                    break;
                }
                else{
                    if(s.charAt(j)==40) {           //(일때
                        if (oc == true)         //이전단어 (
                            checkcount++;
                        else {                   //이전단어 )
                            checkcount++;
                            oc = true;              // 마지막값 (니까 변경
                        }
                    }
                    else if(s.charAt(j)==41){       // )일때
                        if(oc==false){           //이전단어 )
                            if (checkcount==0) {
                                checkcount=-1;
                                break;
                            }
                            else
                                checkcount--;
                        }
                        else {               //이전단어 (
                            checkcount--;
                            oc=false;   //마지막값 )니까 변경
                        }
                    }
                }
            } System.out.println((checkcount==0)? "YES": "NO");
        }
    }
}