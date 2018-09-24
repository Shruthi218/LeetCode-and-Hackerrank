/*
Example 1 :
A + A = abcdeabcde
Check if String B is present in the concatenated string. If yes, true. Else false.
Example 2 :
A = abcde, B = abced
A + A = abcdeabcde
B is not present in the concatenated string, so false.
*/

class Solution {
    public boolean rotateString(String A, String B) {
        if(A.length()!=B.length()) return false;
        String result = A.concat(A);
        if(!result.contains(B)) return false;
        else return true;
    }
    
}
