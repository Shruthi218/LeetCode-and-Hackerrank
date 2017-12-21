class Solution {
    public int missingNumber(int[] nums) {
        
        int sum = 0;
        int n = nums.length;
        int total = 0;
        int result = 0;
        
        for(int i=0;i<nums.length;i++)
        {
            sum = sum + nums[i];
            
        }
        
        
        total = n *(n+1)/2;
        
        result = total - sum;
        return result;
        
    }
}
