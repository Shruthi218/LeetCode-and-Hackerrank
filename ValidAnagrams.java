class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int count[] = new int[26];
        for(int i=0;i<s.length();i++) {
            count[s.charAt(i)-'a']++;
        }
        for(int k=0;k<t.length();k++) {
            count[t.charAt(k)-'a']--;
        }
        
        for(int i=0;i<count.length;i++) {
            if(count[i]!=0) {
                return false;
            }
        }
            
           return true;     
    }
       
    }
