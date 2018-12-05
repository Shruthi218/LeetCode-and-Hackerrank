/ *

Random rand = new Random();
int n = rand.nextInt(6)
This function will generate random numbers ranging from 0 to 6.
So the idea here is to iterate throught the array, for every index, generate a random index (ranging from 0 to array.length)
Then swap the two numbers.
Repeat the process till the end.


*/


import java.util.Random;

public class Solution {
    private int[] nums;
    private Random random;

    public Solution(int[] nums) {
        this.nums = nums;
        random = new Random();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        if(nums == null) return null;
        int[] a = nums.clone();
        for(int i=0;i<a.length;i++) {
            int r = random.nextInt(a.length);
            int t = a[i];
            a[i] = a[r];
            a[r]=t;
        }
        return a;
    }
}
