class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            if(!mp.containsKey(nums[i])) mp.put(nums[i],1);
            else mp.put(nums[i],mp.get(nums[i])+1);
        }
        
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()) {
            if(entry.getValue() == 1) {
                list.add(entry.getKey());
            }
        }
        
        int res[] = new int[list.size()];
        for(int k=0;k<res.length;k++) {
            res[k] = list.get(k);
        }
        return res;
    }
}
