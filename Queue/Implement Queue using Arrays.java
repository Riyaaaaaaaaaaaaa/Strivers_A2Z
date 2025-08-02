class ArrayQueue {
    private int[] queue;
    private int front;
    private int rear;
    private static final int DEFAULT_CAPACITY = 1000;
    public ArrayQueue() {
        queue = new int[DEFAULT_CAPACITY];
        front = -1; 
        rear = -1;
    }

    public void push(int x) {
        if(rear == queue.length - 1) {
            throw new RuntimeException("Queue Overflow");
        }
        else {
            if(front == -1) {
                front = 0 ;
                rear = 0;
            } else {
                rear++;
            }
            queue[rear] = x;
        }
    }

    public int pop() {
        if(front == -1) {
            throw new RuntimeException("Queue Underflow");
        }
        
            int item = queue[front];
            if(front == rear) {
                front = -1; 
                rear = -1;
            } else {
                front++;
            }
            return item;
        
    }

    public int peek() {
        if(front == -1) {
            throw new RuntimeException("Queue Underflow");
        }
        return queue[front];
    }

    public boolean isEmpty() {
        if(front == -1) {
            return true;
        }
        return false;
    }
}
