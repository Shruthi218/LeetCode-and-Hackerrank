class MyQueue {

    /** Initialize your data structure here. */
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    int stack1size;
    public MyQueue() {
        stack1size = 0;
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        s1.push(x);
        stack1size++;
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while(stack1size > 1) {
            s2.push(s1.pop());
            stack1size--;
        }
        int value = s1.pop();
        
        while(!s2.isEmpty()) {
            s1.push(s2.pop());
            stack1size++;
        }
        stack1size--;
        return value;
    } 
    
    /** Get the front element. */
    public int peek() {
        while(stack1size > 1) {
            s2.push(s1.pop());
            stack1size--;
        }
        int res = s1.peek();
        while(!s2.isEmpty()) {
            s1.push(s2.pop());
            stack1size++;
        }
        return res;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
    return stack1size==0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
