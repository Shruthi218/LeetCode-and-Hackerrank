public class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        s = s.replaceAll("\\s+"," ");
        String output = reverse(s);
        StringBuilder res = new StringBuilder();
        StringBuilder myans = new StringBuilder();
        
        for(int i=0;i<output.length();i++) {
            if(output.charAt(i) != ' '){
                res.append(output.charAt(i));
                //System.out.println(res);
                
            }
            
            else {
    
    
                 myans = myans.append(reverse(res.toString()));
                myans.append(" ");
                
                res.setLength(0);
            }
        }
        myans = myans.append(reverse(res.toString()));
        return myans.toString();
    }
    
    
    public String reverse(String s) {
        char ch[] = s.toCharArray();
        int i=0, j= ch.length-1;
        char temp;
        while(i<j) {
            temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        return new String(ch);
}
}
