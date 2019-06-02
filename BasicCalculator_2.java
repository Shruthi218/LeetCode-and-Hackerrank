class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int idx = 0;
        char sign = '+';
        while(idx < s.length())
        {
            if(idx < s.length() && Character.isDigit(s.charAt(idx))) {
                int num = 0;
                while(idx < s.length() && Character.isDigit(s.charAt(idx))) {
                num = num * 10 + s.charAt(idx) - '0';
                idx++;
                }
            
                if(sign == '+') {
                    stack.push(num);
                }
                else if(sign == '-') {
                    stack.push(-num);
                }
                else if(sign == '*') {
                    stack.push(stack.pop() * num);
                }
                else if(sign == '/') {
                    stack.push(stack.pop() / num);
                }
                
        
            }
            else if(isOperator(s.charAt(idx))) {
                sign = s.charAt(idx);
                idx++;
            }
            else idx++;
        }
        
        int result = 0;
        while(!stack.isEmpty()) {
            result+= stack.pop();
        }
        return result;
    }
        
        
        public boolean isOperator(char c) {
            if(c == '+' || c== '-' || c== '*' || c== '/') return true;
            return false;
        }
}
        
        
        
       
