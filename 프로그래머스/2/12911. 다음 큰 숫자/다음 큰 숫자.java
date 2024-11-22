
class Solution {
    public int solution(int n) {
        int n1 = n;
        int n2=n1+1;
        String bin1 = Integer.toString(n1,2);
        while(true){
            String bin2 = Integer.toString(n2, 2);
            if(bin_count(bin1) == bin_count(bin2))
                break;
            else
                n2++;
        }
        return n2;
    }
     public static int bin_count(String s){
        int count = 0;
        for(char c: s.toCharArray()){
            if(c=='1')
                count++;
        }
        return count;
    }
    
}