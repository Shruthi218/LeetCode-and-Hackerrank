class Solution {
    public int findDuplicate(int[] nums) {
        
        HashSet<Integer> hs = new HashSet<Integer>();
        int i=0;
        for(i=0;i<nums.length;i++) {
            if(!hs.contains(nums[i])) {
                hs.add(nums[i]);
            }
            else {
                return nums[i];
            }
        }
        return -1;
    }
}
