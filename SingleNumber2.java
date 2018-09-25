import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++) {
            if(!mp.containsKey(nums[i])) {
                mp.put(nums[i],1);
            }
            else {
                mp.put(nums[i],mp.get(nums[i])+1);
            }
        }
        
        
      for(int key : mp.keySet()){
        if(mp.get(key).equals(1)) {
            return key;
        }
      }
        return -1;
    }
}
