class Solution {
    public int LCIS(int[] nums) {
        int count = 0;
        int res = 0;
        
        if(nums.length==0)
            return 0;
        
        for(int i=0;i<nums.length;i++){
            if(i==0||nums[i-1] < nums[i]) {
                res = Math.max(++count,res);
            }
            else {
                count=1;
            }
        }
        
        return res;
    }
}
        
        
        
