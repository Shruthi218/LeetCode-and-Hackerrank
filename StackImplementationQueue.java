class MyStack {

    /** Initialize your data structure here. */
    
    Queue<Integer> q1 = new LinkedList<>();
    
    public MyStack() {
        
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        
        q1.offer(x);
        
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int size = q1.size();
        while(size > 1) {
            q1.offer(q1.poll());
            size--;
        }
        return q1.poll();
    }
    
    /** Get the top element. */
    public int top() {
        int size = q1.size();
        while(size > 1) {
            q1.offer(q1.poll());
            size--;
        }
        int top = q1.peek();
        q1.offer(q1.poll()); //this is to get back to the orginal queue state
        return top;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        
        return q1.isEmpty();
    }
}
/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
