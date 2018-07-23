class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> hs = new HashSet<Integer>();
        if(nums.length==0 || nums.length==1)
            return false;
        
        for(int i=0;i<nums.length;i++) {
            if(!hs.contains(nums[i])) {
                hs.add(nums[i]);
            }
            else {
                return true;
            }
        }
        return false;
    }
}
