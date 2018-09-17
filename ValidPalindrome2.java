class Solution {
    public boolean validPalindrome(String s) {
        if(s.length()==0 || s.length()==1)
            return true;
        int i =0, j = s.length()-1;
        
        while(i<j) {
            if(s.charAt(i)==s.charAt(j)) {
                i++;
                j--;
            }
            else  {
               return (isPalindrome(s,i,--j) || isPalindrome(s,i+1,j));
                
            }
            
        }
        return true;
    }
    
    public boolean isPalindrome(String s,int i,int j) {
        
        while(i<j) {
            
           if(s.charAt(i)!=s.charAt(j)) {
               return false;
           }
            i++;
            j--;
            
        }
       return true; 
    }
}
