class Solution {
    public boolean canReach(int[] arr) {
        // code here
        int maxReach = 0;
        int curr = 0;
        for(int i = 0; i < arr.length; i++) {
            if(i > maxReach) {
                return false;
            }
            curr = arr[i] + i;
            maxReach = Math.max(maxReach, curr);
        }
        return true;
    }
}