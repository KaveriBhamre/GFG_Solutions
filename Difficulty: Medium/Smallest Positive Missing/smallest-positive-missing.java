class Solution {
    public int missingNumber(int[] nums) {
        // code here
        int n = nums.length;
        boolean[] visited = new boolean[n];
        for(int ele : nums){
            if(ele > 0 && ele <= n){
                visited[ele - 1] = true;
            }
        }
        for(int i = 0; i < n; i++){
            if(visited[i] == false){
                return i+1;
            }
        }
        return n+1;
    }
}
