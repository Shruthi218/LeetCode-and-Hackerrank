class Solution
{    

public int findMaxConsecutive(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int i = 0;
        int maxcount = 0;
        int count = 0;
        while(i < nums.length){
            if(nums[i] == 0){
                maxcount = Math.max(maxcount,count );
                count = 0;
            }else {
                ++count;
            }
            i++;
        }
        if(count != 0){
            maxcount = Math.max(maxcount,count );
        }
        return maxcount;
        
    }
}
