class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
        int n = nums.length/2;
        int count = 0;
        
        for(int i=0;i<nums.length;i++) {
            if(!mp.containsKey(nums[i])) {
                count = 1;
                mp.put(nums[i],count);
            }
            else {
                int val = mp.get(nums[i])+1;
                mp.put(nums[i],val);
            }
        }
        
        // Iterate through the Map
        int max = 0;
        
        for (Map.Entry<Integer,Integer> entry : mp.entrySet()) {
            if(entry.getValue() > n) {
                max = entry.getKey();
                
            }
        }
       return max; 
    }
}
