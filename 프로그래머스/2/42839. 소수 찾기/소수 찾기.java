import java.util.HashSet;

class Solution {
    HashSet<Integer> set;
    public int solution(String numbers) {
        int answer = 0;
        set = new HashSet<>();
        input("", numbers);
        for (Integer n : set) {
            if(check(n))
                answer++;
        }
        return answer;
    }
    public void input(String mix, String left) {
        if (!mix.equals(""))
            set.add(Integer.parseInt(mix));
        for (int i = 0; i < left.length(); i++)
            input(mix + left.charAt(i), left.substring(0, i) + left.substring(i + 1));
    }
    public boolean check(int number) {
        if(number<=1)
            return false;
        for(int i=2; i<=Math.sqrt(number); i++)
            if(number%i==0)
                return false;
        return true;
    }
}