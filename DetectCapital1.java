public class Solution {
public boolean detectCapitalUse(String word) {
        int capitalalphabets = 0;
        int smallalphabets = 0;
        for(int i=0;i<word.length();i++) {
            if(word.charAt(i) > 96) {
                
            smallalphabets++;
            }
            else {
                
            capitalalphabets++;
            }
        }
    
    if(smallalphabets==word.length()) {
        return true;
    } 
    else if(capitalalphabets==word.length()) 
    {   return true;
    }
     
    else if(word.charAt(0) < 96 && capitalalphabets==1) {
        
    return true;
    }
    
return false;
}
}

