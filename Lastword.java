class Solution {
    public int lengthOfLastWord(String s) {
        
        String res = s.trim();
        int wc = 0;
        
        for(int i=res.length()-1;i>=0;i--)
        {
            
            if(res.charAt(i)!=' ')
            {
                wc++;
            }
            
            else
            {
                break;
            }
            
        }
        
        return wc;
        
    }
}
