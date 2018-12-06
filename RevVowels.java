class Solution {
    public String reverseVowels(String s) {
        int i =0;
        int j = s.length()-1;
        if(s.length()==0 || s.length()==1) return s;
        char ch[] = s.toCharArray();
        while(i<j) {
            if(isVowel(ch[i]) && isVowel(ch[j])) {
                char temp = ch[i];
                ch[i]= ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
            // means charAt(i) is vowel, and charAt(j) is not a vowel
            else if(isVowel(ch[i])) {
                j--;
            }
            // means charAt(j) is vowel, and charAt(i) is not a vowel
            else if(isVowel(ch[j])) {
                i++;
            }
            else {
                i++;
                j--;
            }
        }
        return new String(ch);
    }
        
                    
    public boolean isVowel(char c) {
        return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
            c=='A' || c=='E' || c=='I' || c=='O' || c=='U');
    }
}
