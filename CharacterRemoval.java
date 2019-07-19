import java.util.*;
public class HelloWorld{
    public static void main(String args[]) {
       int ans = count("silent", "silentofthelambs");
       System.out.println(ans);
       
    }
    
    public static int count(String s1, String s2) {
        int count[] = new int[26];
        int count1 = 0;
        for(int i=0; i<s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
        }
        
        for(int j=0; j<s2.length(); j++) {
            count[s2.charAt(j) - 'a']--;
            if(count[s2.charAt(j) -'a'] > 0 || count[s2.charAt(j) - 'a'] < 0)count1++;
        }
        return count1;
    }
}
