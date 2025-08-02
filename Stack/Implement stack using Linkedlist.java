class LinkedListStack {
    private Node top;

    private static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
    public LinkedListStack() {
        top = null;
    }

    public void push(int x) {
        Node newNode = new Node(x);
        if(top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public int pop() {
        if(top == null) {
            throw new RuntimeException("Underflow");
        }
        int item = top.data;
        top = top.next;
        return item;
    }

    public int top() {
        if(top == null) {
            throw new RuntimeException("Underflow");
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
