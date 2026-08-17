class Solution {
    public boolean canServe(int[] arr) {
        // code here
        int fives = 0, tens = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 5){
                fives++;
            }else if(arr[i] == 10){
                if(fives >= 1) {
                    fives--;
                    tens++;
                }else {
                    return false;
                }
            }else {
                if(tens >= 1 && fives >= 1){
                    tens--;
                    fives--;
                }else if(fives >= 3){
                    fives -= 3;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}