public class HelloWorld{

     public static void main(String []args){
        String rans = "Aa";
        String mag = "Aaaaab";
        boolean ans = ransom(rans,mag);
        System.out.println(ans);
        
     }
     
     public static boolean ransom(String rans, String mag) {
         if(rans.equals(mag)) return true;
         int count[] = new int[52];
         for(int i = 0 ; i< mag.length(); i++) {
             if(Character.isLowerCase(mag.charAt(i))) {
                count[mag.charAt(i) - 'a']++;
             }
            else {
                count[25 + mag.charAt(i) - 'A']++;
            }
         }
         
         for(int i=0 ; i<rans.length();i++) {
             if(Character.isLowerCase(rans.charAt(i))) {
                 count[rans.charAt(i) - 'a']--;
                 if(count[rans.charAt(i) - 'a'] < 0) return false;
             }
             else {
                 count[25 + rans.charAt(i) - 'A']--;
                 if(count[25 + rans.charAt(i) - 'A'] < 0) return false;
             }
         }
         return true;
         }
         
}
