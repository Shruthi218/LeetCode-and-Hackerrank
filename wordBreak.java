class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean wordbreak[] = new boolean[s.length()+1];
        wordbreak[0] = true;
        for(int i=0; i < s.length() + 1; i++) {
            for(int j=0; j < i; j++) {
                if(!wordbreak[j]) {
                    continue;
                }
            
            if(wordDict.contains(s.substring(j,i))) {
                wordbreak[i] = true;
                break;
            }
        }
    }
        return wordbreak[s.length()];
    }
}
