class Solution {
    public int solution(int[][] sizes) {
        int max_left = 0, max_right = 0;
        for (int i = 0; i < sizes.length; i++) {
            int max = Math.max(sizes[i][0], sizes[i][1]);
            int min = Math.min(sizes[i][0], sizes[i][1]);
            max_left = Math.max(max_left, max);
            max_right = Math.max(max_right, min);
        }
        return max_left*max_right;
    }
}