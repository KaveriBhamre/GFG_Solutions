/* Structure of linked list Node
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}
*/
// Stack class
class myStack {
    Node top;
    int count;
    
    public myStack() {
        top = null;
        count = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
        count++;
    }

    public void pop() {
       if(isEmpty()) return;
       top = top.next;
       count--;
    }

    public int peek() {
        if(isEmpty()) return -1;
        return top.data;
    }

    public int size() {
        return count;
    }
}
