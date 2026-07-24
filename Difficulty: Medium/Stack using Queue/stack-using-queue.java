class myStack {
    Queue<Integer> q = new LinkedList<>();
    
    void push(int x) {
        q.add(x);
        int n = q.size();
        for(int i = 0; i < n-1; i++){
            q.add(q.remove());
        }
    }

    void pop() {
        if(q.isEmpty()) return;
        q.remove();
    }

    int top() {
        if(q.isEmpty()) return -1;
        return q.peek();
    }

    int size() {
        return q.size();
    }
}
