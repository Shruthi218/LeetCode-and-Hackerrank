class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        int v = nums.length/3;
        for(int i=0;i<nums.length;i++) {
            if(!mp.containsKey(nums[i])) {
                mp.put(nums[i],1);
            }
            else {
                mp.put(nums[i],mp.get(nums[i])+1);
            }
        }
        
        int max = 0;
        for (Map.Entry<Integer,Integer> entry : mp.entrySet()) {
            if(entry.getValue() > v) {
                max = entry.getKey();
                res.add(max);
                
            }
        }
       return res;
        
    }
}
