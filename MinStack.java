class MinStack {

    /** initialize your data structure here. */
    Stack<Integer> s1;
    Stack<Integer> s2;
    public MinStack() {
        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();
        
    }
    
    public void push(int x) {
        if(s2.isEmpty() ||  x <=s2.peek()) {
            s2.push(x);
        }
            s1.push(x);
        
        
    }
        
    
    
    public void pop() {
        if(s1.peek()==getMin()) {
            s2.pop();
        }    
            s1.pop();
        System.out.println(Arrays.toString(s2.toArray()));
    }
        
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        
        
        return s2.peek();
    }
}
