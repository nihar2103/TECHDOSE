class MyQueue {
    Stack<Integer> S1=new Stack<>();
    Stack<Integer> S2=new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        while(!S1.isEmpty()){
        S2.push(S1.pop());
    }
    S1.push(x);
    while(!S2.isEmpty()){
        S1.push(S2.pop());
    }
    }
    
    public int pop() {
        if(S1.isEmpty()){
            return -1;
        }
        return S1.pop();
    }
    
    public int peek() {
        if(S1.isEmpty()){
            return -1;
        }
        return S1.peek();
    }
    
    public boolean empty() {
        return S1.isEmpty();
    }
}
