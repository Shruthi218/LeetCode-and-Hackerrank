class Solution {
    public int distributeCandies(int[] candies) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<candies.length;i++) {
            if(!set.contains(candies[i])) {
                set.add(candies[i]);
            }
            
        }
        return Math.min(candies.length/2, set.size());
    }
}
