class Solution {
    public int removeDuplicates(int[] nums) {
        int myindex = 1;
        int count = 0;
        if(nums.length==0) return 0;
        for(int i=1;i<nums.length;i++) {
            if(nums[i-1]==nums[i]) {
                count++;
                if(count<2) {
                    nums[myindex] = nums[i];
                    myindex++;
                }
            }
            else {
                count = 0;
                nums[myindex] = nums[i];
                myindex++;
            }
         
        }
        return myindex;
    }
}

/*

1,1,1,2,2,3

1,2,3,4

if adjacent values are not equal then just keep moving your myindex.



*/
