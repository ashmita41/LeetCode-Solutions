class MinStack {

    public MinStack() {
        
    }
    // we will use two stacks 
    // one for stack operations and other one for min seen so far
    Stack<Integer> st = new Stack<>();
    Stack<Integer> ms = new Stack<>();
    
    public void push(int value) {
        st.push(value);
        if(ms.isEmpty()) {
            ms.push(value);
        } else {
            ms.push(Math.min(value, ms.peek()));
        }
    }
    
    public void pop() {
        if(st.isEmpty()) {
            return;
        }
        st.pop();
        ms.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return ms.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */