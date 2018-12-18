class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<String,Character> mp1 = new HashMap<String,Character>();
        String word[] = str.split(" ");
        int length1 = pattern.length();
        int length2 = word.length;
        if(length1!=length2) return false;
        
        for(int i=0;i<word.length;i++) {
            char ch = pattern.charAt(i);
            String key = word[i];
            if(!mp1.containsKey(key)) {
                // Check if the value is existing.
                if(mp1.containsValue(ch)) return false; 
                mp1.put(key,ch);
            }
            
            else {
                if(!mp1.get(key).equals(ch)) return false;
            }
        
            
            
        }
        return true;
    }
}

