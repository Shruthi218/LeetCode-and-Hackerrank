class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        Set<Integer> s = new HashSet<Integer>();
        List<Integer> result = new ArrayList<Integer>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(s.contains(nums[i]))
            {
                result.add(nums[i]);
            }
            
            else
            {
                s.add(nums[i]);
            }
            
        }
        
        return result;
        
    }
}
