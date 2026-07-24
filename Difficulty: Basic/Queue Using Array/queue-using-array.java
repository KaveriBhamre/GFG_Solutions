class myQueue {
    
    int[] queue;
    int currSize;
    int front;
    int rear;
    int N;
    
    public myQueue(int n) {
        queue = new int[n];
        currSize = 0;
        front = -1;
        rear = -1;
        N = n;
    }

    public boolean isEmpty() {
      return currSize == 0;
    }

    public boolean isFull() {
       return currSize == N;
    }

    public void enqueue(int x) {
        if(currSize == N){
            return;
        }
        if(currSize == 0){
            front = 0;
            rear = 0;
        }else {
            rear = (rear+1) % N;
        }
        
        queue[rear] = x;
        currSize++;
    }

    public void dequeue() {
        if(currSize == 0){
            return;
        }
        
        int ele = queue[front];
        
        if(currSize == 1){
            front = -1;
            rear = -1;
        }else{
            front = (front + 1) % N;
        }
        currSize--;
        
    }

    public int getFront() {
        if(currSize == 0){
            return -1;
        }
        return queue[front];
    }

    public int getRear() {
        if(currSize == 0){
            return -1;
        }
        return queue[rear];
    }
}
