// Node class
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

// Queue class
class myQueue {
    Node start, end;
    int count;

    public myQueue() {
        start = null;
        end = null;
        count = 0;
    }

    public boolean isEmpty() {
        return start == null;
    }

    public void enqueue(int x) {
        Node newNode = new Node(x);
        if(isEmpty()){
            start = newNode;
            end = newNode;
        }
        else{
            end.next = newNode;
            end = newNode;
        }
        count++;
    }

    public void dequeue() {
        Node temp = start;
        start = start.next;
        count--;
    }

    public int getFront() {
        if(isEmpty()) return -1;
        return start.data;
    }

    public int size() {
        return count;
    }
}
