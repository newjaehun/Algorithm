import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<int[]> qu = new LinkedList<>();
        for(int i=0; i< priorities.length; i++)
            qu.add(new int[]{priorities[i],i});
        while (!qu.isEmpty()) {
            int[] current = qu.poll();
            boolean check = false;
            for (int[] tmp : qu) {
                if (tmp[0] > current[0]) {
                    check = true;
                    break;
                }
            }
            if (check) {
                qu.add(current);
            } else {
                answer++;
                if(current[1] == location)
                    return answer;
            }
        }
        return -1;
    }
}