class Solution {
    public int[] findErrorNums(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        int res[] = new int[2];
        int arrsum = nums.length * (nums.length+1)/2;
        for(int i=0;i<nums.length;i++) {
            if(!list.contains(nums[i])) list.add(nums[i]);
            else {
                res[0] = nums[i];
            }
        }
        
        for(int k=0;k<list.size();k++) {
            sum = sum + list.get(k);
        }
        
        res[1] = Math.abs(sum-arrsum);
        return res;
    }
}
