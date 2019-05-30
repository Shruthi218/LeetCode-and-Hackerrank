class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int res[] = new int[nums.length];
        int z_index = 0;
        int zero_count = 0;
        int prod = 1;
        for(int j=0;j<nums.length;j++) {
            if(nums[j]!=0) prod = prod * nums[j];
            else {
                z_index = j;
                zero_count++;
        }
        }
            
        if(zero_count > 1) return res;
        for(int i=0;i<nums.length;i++) {
            
            if(nums[i] != 0 && zero_count == 0) {
                res[i] = prod/nums[i];
            }
            else if(i==z_index && zero_count==1) res[i] = prod;
            else res[i] = 0;
        }
        return res;
        
    }
}
