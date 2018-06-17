class Solution {
    public boolean hasAlternatingBits(int n) {
        
        
        String k = Integer.toBinaryString(n); // converts the given integer to String
        
        for(int j=0;j+1<k.length();j++)
        {
            if(k.charAt(j)!=k.charAt(j+1)) {
                continue;
            }
            else {
                return false;
            }
            
        }
        return true;
        
        
    }
}
