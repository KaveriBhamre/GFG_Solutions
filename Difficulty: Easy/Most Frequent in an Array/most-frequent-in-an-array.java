class Solution {
    public int mostFreqEle(int[] arr) {
        // code here
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int maxCount = 0;
        int ans = -1;
        for(int ele : arr){
            if(map.get(ele) > maxCount){
                maxCount = map.get(ele);
                ans = ele;
            }
            else if(map.get(ele) == maxCount && ele > ans){
                ans = ele;
            }
        }
        return ans;
        
        
    }
}