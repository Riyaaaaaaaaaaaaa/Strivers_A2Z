class QueueStack {
    private Queue<Integer> queue;
    public QueueStack() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
        for(int i = 0 ; i < queue.size() - 1 ; i++) {
            queue.add(queue.remove());
        }
    }

    public int pop() {
        return queue.remove();
    }

    public int top() {
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
