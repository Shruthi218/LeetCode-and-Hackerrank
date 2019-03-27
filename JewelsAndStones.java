/* Linear Approach using set */
class Solution {
    public int numJewelsInStones(String J, String S) {
        Set<Character> st = new HashSet<>();
        int count = 0;
        for(int k=0;k<J.length();k++) {
            st.add(J.charAt(k));
        }
        
        for(int j=0;j<S.length();j++) {
            if (st.contains(S.charAt(j))) count++;
        }
        return count;
    }
}
