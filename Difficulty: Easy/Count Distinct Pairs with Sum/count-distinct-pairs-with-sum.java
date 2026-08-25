class Solution {
    static int countDistinctPairs(int arr[], int target) {

       Arrays.sort(arr);
       int left = 0, right = arr.length - 1;
       int count = 0;
       
       while(left < right) {
            int currentSum = arr[left] + arr[right];
            
            if(currentSum == target) {
                count++;
                left++;
                right--;
                
                while(left < right && arr[left] == arr[left - 1]) {
                    left++;
                }   
                while(left < right && arr[right] == arr[right+1]) {
                    right--;
                }
            }
            else if (currentSum < target) {
                left++; 
            } 
            else {
                right--;
            }
       }
       return count;
       
    }
}
