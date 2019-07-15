/* Sorting approach for Finding First Missing Positive */

class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int missingNumber = 1;
        for(int i=0; i<nums.length;i++) {
            if(nums[i] == missingNumber) missingNumber++;
        }
        return missingNumber;
    }
}
