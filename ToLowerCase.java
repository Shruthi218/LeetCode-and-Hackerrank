class Solution {
    public String toLowerCase(String str) {
       char ch[] = str.toCharArray();
        for(int i=0;i<ch.length;i++) {
            if(ch[i] >=65 && ch[i]<=96) {
            ch[i]+= 32;
            }
        }
        return new String(ch);
    }
}
