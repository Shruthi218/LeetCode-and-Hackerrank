class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++) {
            if(!mp.containsKey(nums[i])) {
                mp.put(nums[i],1);
            }
            else {
                mp.put(nums[i],mp.get(nums[i])+1);
            }
        }

int maxValueInMap=(Collections.max(mp.values())); // This will return max value in the Hashmap
        int res = 0 ;
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {  // Iterate through hashmap
            if (entry.getValue()==maxValueInMap) {
                res =  entry.getKey();
            }
        }
        return res;
    }
}
