public class Solution 
{
    public boolean judgeCircle(String moves) 
    {
        int cr=0;
        int cl=0;
        int cu=0;
        int cd=0;
        
        char ch[] = moves.toCharArray();
        
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i] == 'R')
                cr++;
            
            else if (ch[i]=='L')
                cl++;
            
            else if(ch[i] == 'U')
                cu++;
            else if(ch[i] == 'D')
                cd++;
            
        }
        
        if(cr==cl && cu==cd)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
}
