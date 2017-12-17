import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String twoStrings(String s1, String s2){
        // Complete this function
        int i,t=0;
        int a1[]=new int [26];
        int a2[]=new int [26];
        for(i=0;i<s1.length();i++)
            a1[s1.charAt(i)-'a']++;
        for(i=0;i<s2.length();i++)
            a2[s2.charAt(i)-'a']++;
        for(i=0;i<26;i++)
            if((a1[i]>0)&&(a2[i]>0))
            {
                t=1; 
                break;
            }
        if(t==1)
            return "YES";
        else
            return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s1 = in.next();
            String s2 = in.next();
            String result = twoStrings(s1, s2);
            System.out.println(result);
            
        }
    }
}
