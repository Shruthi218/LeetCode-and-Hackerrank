import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int[] a = new int[26];
        for(int i=0; i < 26; i++)
        {
            a[i] = in.nextInt();
        }
        
        
        
        String word = in.next();
        int length = word.length();
        
        
        
        int max = a[0];
        for(int j=1;j<a.length;j++)
        {
            
            if(a[j] > max)
            {
                max = a[j];
            }
            
           
            
        }
        
        int result = max * length ; 
        
        System.out.println(result);
        
    }
}
