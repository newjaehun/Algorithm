import java.util.HashSet;

public class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();
        int size = nums.length;
        int halfSize = size/2;
        for (int i = 0; i < size; i++) 
            set.add(nums[i]);
        int setSize = set.size();
        answer = (setSize > halfSize) ? halfSize : setSize;
        return answer;
    }
}
