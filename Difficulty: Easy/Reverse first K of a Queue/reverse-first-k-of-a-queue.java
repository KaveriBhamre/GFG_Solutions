class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {

        if (q.isEmpty() || k > q.size())
            return q;
        if (k <= 0)
            return q;
            
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < k; i++) {
            st.push(q.poll());
        }
        while(!st.isEmpty()) {
            q.offer(st.pop());
        }
        for(int i = 0; i < q.size() - k; i++) {
            q.offer(q.poll());
        }
        
        return q;
    }
}