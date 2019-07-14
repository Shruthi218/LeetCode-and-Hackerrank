class Solution {
    public String removeVowels(String S) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < S.length(); i++) {
            if(S.charAt(i) == 'a' || S.charAt(i) == 'e' || S.charAt(i) == 'i' || S.charAt(i) =='o' || S.charAt(i) == 'u') {
                continue;
            }
            else {
                sb.append(S.charAt(i));
            }
        }
        return sb.toString();
    }
}
