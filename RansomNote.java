class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int myarr[] = new int[26];
        for(int i=0;i<magazine.length();i++) {
            myarr[magazine.charAt(i) - 'a']++;
        }
        for(int k=0;k<ransomNote.length();k++) {
            myarr[ransomNote.charAt(k) -'a']--;
        }
        
        for(int j=0;j<myarr.length;j++) {
            if(myarr[j] < 0) return false;
        }
        return true;
    }
}
