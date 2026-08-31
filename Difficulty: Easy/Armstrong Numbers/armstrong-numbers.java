class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int temp = n ;
        int digit;
        long sum = 0;
        
        while ( n!= 0){
            digit = n % 10;
            sum = sum + (digit*digit*digit);
            n = n / 10;
        }
        if (sum == temp) return true;
        return false;
    }
}