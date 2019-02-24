class Solution {
    public String reverseOnlyLetters(String S) {
        char ch[] = S.toCharArray();
        int i =0;
        int j = ch.length-1;
        while(i<j) {
            if(Character.isLetter(ch[i]) && Character.isLetter(ch[j])) {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
            
            else if(!Character.isLetter(ch[i])) i++;
            else if(!Character.isLetter(ch[j])) j--;
        }
        return new String(ch);
    }
}
