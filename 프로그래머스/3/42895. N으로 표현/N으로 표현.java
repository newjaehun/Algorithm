import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int solution(int N, int number) {
        if(N==number)
            return 1;
        List<Set<Integer>> list = new ArrayList<>();
        for (int i = 0; i <=8; i++) {
            list.add(new HashSet<>());
        }
        list.get(1).add(N);
        for (int i = 2; i <= 8; i++) {
            StringBuilder sb = new StringBuilder().append(N);
            for (int j = 1; j < i; j++) {
                sb.append(N);
            }
            list.get(i).add(Integer.parseInt(sb.toString()));
            for (int j = 1; j < i; j++) {
                for (int a : list.get(j)) {
                    for (int b : list.get(i-j)) {
                        list.get(i).add(a + b);
                        list.get(i).add(a - b);
                        list.get(i).add(a * b);
                        if (b != 0) {
                            list.get(i).add(a / b);
                        }
                    }
                }
            }
            if(list.get(i).contains(number))
                return i;
        }
        return -1;
    }
}