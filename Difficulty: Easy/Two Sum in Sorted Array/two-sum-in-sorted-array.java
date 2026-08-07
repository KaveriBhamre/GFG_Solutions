class Solution {
    public ArrayList<Integer> twoSum(int[] nums, int target) {
        
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        int i = 0, j = n-1;
        while(i < j) {
            int currSum = nums[i] + nums[j];
            if(currSum > target){
                j--;
            }else if(currSum < target){
                i++;
            }else if(currSum == target){
                list.add(i + 1); 
                list.add(j + 1);
                return list;
            }
        }
        list.add(-1); 
        list.add(-1);
        return list;
    }
}