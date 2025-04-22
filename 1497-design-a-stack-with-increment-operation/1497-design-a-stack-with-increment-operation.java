class CustomStack {
    private int capacity;
    private int top;
    private int[] CustomStack;

    public CustomStack(int maxSize) {
        this.capacity = maxSize;
        this.top = -1;
        this.CustomStack = new int[capacity];
    }
    
    public void push(int x) {
        if(top == capacity-1){
            return;
        }
        top = top+1;
        CustomStack[top] = x;
    }
    
    public int pop() {
        if(top == -1){
            return -1;
        }
        int y = CustomStack[top--];
        return y;
    }
    
    public void increment(int k, int val) {
        if(top+1 <= k){
            for(int i = 0; i< top+1; i++){
                CustomStack[i] = CustomStack[i] + val;
            }
        }else{
            for(int i = 0; i< k; i++){
                CustomStack[i] = CustomStack[i] + val;
            }
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */