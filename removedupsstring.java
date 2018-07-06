import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        //System.out.println("Hello World");
        HelloWorld hw = new HelloWorld();
        hw.removedups("sssssssssssssss");
     }
     
     
     public void removedupsstring(String s) {
         
         
         char ch[] = s.toCharArray();
         Arrays.sort(ch);
         String res = new String(ch);
         StringBuilder sb = new StringBuilder();
         int count = 1;
         
         for(int i=0;i+1<res.length();i++) {
             if(res.charAt(i)==res.charAt(i+1)) {
                 count++;
             }
             else if(res.charAt(i)!=res.charAt(i+1)){
             sb.append(res.charAt(i));
             count = 1;
             }
             
         }
         
         
             sb.append(s.charAt(res.length()-1));
             System.out.println(sb);
     }
}
