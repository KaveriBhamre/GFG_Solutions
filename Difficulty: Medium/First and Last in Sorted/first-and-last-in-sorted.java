class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(first(arr, x));
        list.add(last(arr, x));
        return list;
        
    }
    private int first(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int idx = -1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(nums[mid] == target) {
                idx = mid;
                high = mid - 1;
            }
            else if(nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return idx;
    }

     private int last(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int idx = -1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(nums[mid] == target) {
                idx = mid;
                low = mid + 1;
            }
            else if(nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return idx;
    }
}
