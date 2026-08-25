class Solution {
    public static int kthLargest(int nums[], int k) {
        // code here
        PriorityQueue<Integer> pq=new PriorityQueue<>();
      for(int i=0;i<nums.length;i++){
            pq.offer(nums[i]);
            if(pq.size()>k){
                pq.poll();
            }
      }
      return pq.peek();
    }
}