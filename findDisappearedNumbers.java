class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[]flags = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            flags[nums[i]-1] = true;
            
        }
        List<Integer>result = new ArrayList<Integer>();
        for (int i = 0; i < flags.length; i++) {
            if (!flags[i]) {
                result.add(i + 1);
            }
        }
        return result;
    }
}
