class Solution {
    public int[] countBits(int num) {
        int res[] = new int[num+1];
        int x = 0;
        int i = 0;
        int value = 0;
        while(x <= num) {
            value = Integer.bitCount(x);
            res[i] = value;
            i++;
            x++;
        }
        return res;
    }
}
