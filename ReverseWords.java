class Solution {
    public String reverseWords(String s) {
        
        Stack<Character> st = new Stack<Character>();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)!=' '){
                st.push(s.charAt(i));
                // added 'd' on to my stack
            }
            
            
            
            if(s.charAt(i)==' ' || i==s.length()-1) {
            
                while(!st.isEmpty()){
                    sb.append(st.pop());
                }
                    
                if(i!=s.length()-1){
                    sb.append(" ");  
                }
              
                
            }
            
            
            
            
        }
            
        return sb.toString();

}
}
