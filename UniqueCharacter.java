class Solution {
    public int firstUniqChar(String s) {
        if(s.length()==0) return -1;
       Map<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(!mp.containsKey(c)) {
                mp.put(c,i);
            }
            else mp.put(c,-1);
        }
        
        int min = Integer.MAX_VALUE;
        for(char c: mp.keySet()) {
            if(mp.get(c) < min && mp.get(c)!=-1) {
                min = mp.get(c);
            }
            
        }
        
        if(min==Integer.MAX_VALUE) return -1;
        else return min;
    }
}
