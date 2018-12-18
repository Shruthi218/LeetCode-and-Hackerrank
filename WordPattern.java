class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character,String> mp1 = new HashMap<Character,String>();
        String word[] = str.split(" ");
        int length1 = pattern.length();
        int length2 = word.length;
        if(length1!=length2) return false;
        
        for(int i=0;i<word.length;i++) {
            char ch = pattern.charAt(i);
            String value = word[i];
            if(mp1.containsKey(ch)) {
                if(!mp1.get(ch).equals(word[i])) return false;
            }
            else {
                if(mp1.containsValue(word[i])) return false; 
                mp1.put(ch,word[i]);
            }
        }
        
        return true;
    }
}
