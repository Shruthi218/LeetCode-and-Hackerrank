
// Program to check whether all string array contents are present in the dictionary, if yes return true, else return false

import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        HelloWorld h = new HelloWorld();
        
        String s[] = new String[] {"grapes","mango","guava"};
        boolean ans = h.DictionaryMap(s);
        System.out.println(ans);
        
     }
     
     public static boolean DictionaryMap(String s[]) {
         HashSet<String> set = new HashSet<String>();
         set.add("Apple");
         set.add("Banana");
         set.add("Orange");
         set.add("lemon");
         set.add("grapes");
         set.add("mango");
         set.add("guava");
         
         for(int i=0;i<s.length;i++) {
             if(set.contains(s[i])) continue;
             else 
             return false;
         }
        return true;
     }
}
