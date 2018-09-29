class Solution {
    
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        //After sorting we get 1,2,3,4,5,6
        //Now perform pair wise swapping 1,3,2,5,4,6
        for(int i=2;i<nums.length;i=i+2) {
            int temp = nums[i];
            nums[i] = nums[i-1];
            nums[i-1] = temp;
        }
    }
}
