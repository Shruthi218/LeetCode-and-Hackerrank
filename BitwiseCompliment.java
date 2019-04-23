class Solution {
    public int bitwiseComplement(int N) {
        if(N==0) return 1;
        if(N==1) return 0;
        int x = 1;
        while(x<=N) {
            x = x*2;
        }
        return N ^ (x-1);
    }
}
