class ArrayStack {
    private int[] stack;
    private int top;
    private static final int DEFAULT_CAPACITY = 1000;
    
    public ArrayStack() {
        stack = new int[DEFAULT_CAPACITY];
        top = -1;
    }

    public void push(int x) {
        if(top == stack.length - 1) {
            throw new RuntimeException("Stack Overflow");
        }
        top++;
        stack[top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        int item = stack[top];
        top--;
        return item;
    }

    public int top() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack[top];
    }

    public boolean isEmpty() {
        if(top == -1) return true;
        return false;
    }
}
