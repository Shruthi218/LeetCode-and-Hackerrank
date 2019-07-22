class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        boolean onebit = false;
        while (i < bits.length) {
            if(bits[i] == 0) {
                onebit = true;
                i++;
            }
            else {
                onebit = false;
                i+=2;
            }
        }
        return onebit;
    }
}
