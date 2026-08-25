class Solution {
    
    public Queue<Integer> reverseK(Queue<Integer> q, int k) {
        if(q.isEmpty() || k <= 0 || k > q.size()) {
            return q;
        }
        int front = q.poll();
        reverseK(q, k-1);
        q.offer(front);
        return q;
    }
    
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
       q = reverseK(q, k);
        
        for(int i = 0; i < q.size() - k; i++) {
            q.offer(q.poll());
        }
        
        return q;
        
    }  
}