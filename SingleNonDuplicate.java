class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i=0;
        for(;i<nums.length-1;i=i+2) {
            if(nums[i] == nums[i+1]) {
               continue;
            }
            else {
                break;
            }
            
        }
        return nums[i];
    }
}
