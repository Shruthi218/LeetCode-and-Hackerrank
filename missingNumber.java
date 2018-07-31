class Solution {
    public int missingNumber(int[] nums) {
        int arraysum = 0;
        int sum = 0;
        int n = nums.length;
        
        for(int i=0;i<nums.length;i++) {
            arraysum = arraysum+nums[i];
        }
        
        sum = n * (n+1)/2;
        int ans = Math.abs(sum-arraysum);
        return ans;
    }
}
