class Solution {
    public int missingNumber(int[] nums) {
        // code here
        int x = 1;
        Set<Integer> set = new HashSet<>();
        for(int ele : nums){
            set.add(ele);
        }
        while(set.contains(x)) x++;
        return x;
    }
}
