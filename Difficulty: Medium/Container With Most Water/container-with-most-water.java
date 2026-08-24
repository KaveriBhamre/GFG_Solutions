class Solution {
    public int maxWater(int height[]) {
        // Code Here
        int n = height.length; 
        int maxArea = 0;
        int left = 0, right = n - 1;
        
        while(left < right) {
            int l = Math.min(height[left], height[right]);
            int b = right - left;
            int area = l * b;
            
            maxArea = Math.max(area, maxArea);
            
            if(height[left] < height[right]) {
                left++;
            }else {
                right--;
            }
        }
        
        
        return maxArea;
    }
}