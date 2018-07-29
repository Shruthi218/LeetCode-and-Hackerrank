public class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alphabet1 = new int[26];
        int[] alphabet2 = new int[26];
        for (int i = 0; i < s.length(); i++) 
            alphabet1[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) 
            alphabet2[t.charAt(i) - 'a']++;
        
        if(Arrays.equals(alphabet1,alphabet2)) {
            return true;
        }
        else {
            return false;
        }
    }
}
