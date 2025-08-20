// Last updated: 8/20/2025, 10:07:21 PM
class MinStack {

    static class Val{
        int v;
        int m;
    }

    Stack<Val> s;

    public MinStack() {
        s = new Stack<Val>();
    }
    
    public void push(int val) {
        Val obj = new Val();
        obj.v=val;

        if(s.isEmpty() || s.peek().m >=val){
            obj.m = val;
        }
        else{
            obj.m = s.peek().m;
        }
       
       s.push(obj);
    }
    
    public void pop() {
       s.pop();
    }
    
    public int top() {
         return s.peek().v;
    }
    
    public int getMin() {
        return s.peek().m;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */