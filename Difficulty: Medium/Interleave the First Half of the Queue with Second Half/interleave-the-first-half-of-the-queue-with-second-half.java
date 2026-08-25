class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        // code here
        int n = q.size();
        Queue<Integer> firstHalf = new LinkedList<>();
        Queue<Integer> secondHalf = new LinkedList<>();
        
        for(int i = 0; i < n/2; i++) {
            firstHalf.offer(q.poll());
        }
        while(!q.isEmpty()){
            secondHalf.offer(q.poll());
        }
        
        while(!firstHalf.isEmpty() && !secondHalf.isEmpty()) {
            q.offer(firstHalf.poll());
            q.offer(secondHalf.poll());
        }
        
         
         
        
        
        
    }
}
