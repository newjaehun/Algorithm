import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        Queue<Integer> qu = new LinkedList<>();
        for (int i =0; i< progresses.length; i++)
            qu.add((int)Math.ceil(((100.0 - progresses[i]) / speeds[i])));
        while (!qu.isEmpty()) {
            int day = qu.poll();
            int tmp = 1;
            while (!qu.isEmpty() && qu.peek() <= day) {
                qu.poll();
                tmp++;
            }
            answer.add(tmp);
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}