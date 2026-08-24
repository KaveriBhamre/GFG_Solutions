class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        int n = arr.length;
        
        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i = 0; i < k; i++) {
            if(arr[i] < 0) {
                queue.offer(arr[i]);
            }
        }
        
        list.add((queue.isEmpty()) ? 0 : queue.peek());
        
        for(int i = 1; i <= n - k; i++) {
            if(arr[i - 1] < 0) {
                queue.poll();
            }
            if(arr[i + k - 1] < 0) {
                queue.offer(arr[i + k - 1]);
            }
            list.add((queue.isEmpty()) ? 0 : queue.peek());
        }
        
        return list;
    }
}