class Solution {
    public int heightChecker(int[] heights) {
        int count = 1;
        for(int i=1; i<heights.length; i++) {
            if(heights[i-1] <= heights[i]) continue;
            else count++;
        }
        return count;
    }
}
