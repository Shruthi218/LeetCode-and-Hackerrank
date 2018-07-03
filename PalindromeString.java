public class HelloWorld{

     public static void main(String []args) { 
        //System.out.println("Hello World");
        HelloWorld hw = new HelloWorld();
        boolean ans = hw.PalindromeString("abba");
        System.out.println(ans);
     }
        
     
     
     public boolean PalindromeString(String s) {
         
         char ch[] = s.toCharArray();
         int i=0;
         int j = ch.length-1;
         
         if(s==null)
         return true;
         
         while(i<j) {
             
             if(ch[i]!=ch[j])
             return false;
             
             
             
             else {
                 i++;
                 j--;
             }
         }
         return true;
         
     }
}
    
