class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        
        for(int i=0;i<S.length();i++) {
            if(S.charAt(i)!='#') {
                st1.push(S.charAt(i));
            }
            else {
                if(!st1.isEmpty())
                st1.pop();
            }
            
            
        }
        
    for(int k=0;k<T.length();k++) {
                if(T.charAt(k)!='#') {
                    st2.push(T.charAt(k));
                }
                else {
                    if(!st2.isEmpty())
                    st2.pop();
                }
            }
        
        
        if(st1.size()!=st2.size()) return false;
        
        while(!st1.isEmpty() && !st2.isEmpty()) {
            if(st1.peek()!=st2.peek()) {
                return false;
            }
            else {
                st1.pop();
                st2.pop();
        }
        
}
        return true;
    }
}
