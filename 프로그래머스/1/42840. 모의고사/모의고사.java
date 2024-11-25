import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] answers) {
        int[] point = new int[3];
        ArrayList<Integer> list = new ArrayList<>();
        int[][] user = {{1,2,3,4,5},{2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1,1, 2, 2, 4, 4, 5, 5}};
        for (int i = 0; i < answers.length; i++) {
            if (user[0][i%5] == answers[i]) {
                point[0]++;
            }
            if (user[1][i%8] == answers[i]) {
                point[1]++;
            }
            if (user[2][i%10] == answers[i]) {
                point[2]++;
            }
        }
        int[] pointSort = point.clone();
        Arrays.sort(pointSort);
        int maxPoint =  pointSort[2];
        for (int i = 0; i < 3; i++) {
            if(point[i] == maxPoint)
                list.add(i+1);
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}