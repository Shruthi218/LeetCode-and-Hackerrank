Optimized Method (Standard Approach)

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> newList = new ArrayList<Integer>();     
            for(int i=0;i<nums.length;i++){  
                int index =Math.abs(nums[i]);            
                nums[index-1] = - nums[index-1];
        }
        else{
               newList.add(Math.abs(nums[i])); 
        }
    }
    return newList;
}

Another Approach (Using extra space)

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        List<Integer> result = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++) {
            if(!hs.contains(nums[i])) {
                hs.add(nums[i]);
            }
            else {
                result.add(nums[i]);
            }
            
        }
        return result;
    }
}
