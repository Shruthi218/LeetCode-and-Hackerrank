class Solution 
{
    public int lengthOfLastWord(String s) 
    {
        
        int wordcount = 0;
        
        if(s.length()==0 || s==null)
            return 0;
        
        
        
        
        for(int i = s.length()-1;i>=0;i--)
        {
            
            if(s.charAt(i)!=' ')
            {
                wordcount++;
            }
            else
            {
                break;
            }
        }
        
        return wordcount;
    }
}
        
