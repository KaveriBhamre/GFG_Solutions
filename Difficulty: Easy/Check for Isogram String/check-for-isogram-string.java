class Solution {
    // Function to check if a string is Isogram or not.
    static boolean isIsogram(String data) {
        // Your code here
        int[] freq = new int[26];
        for(int i = 0; i < data.length(); i++) {
            char ch = data.charAt(i);
            freq[ch - 'a']++;
        }
        for(int i = 0; i < freq.length; i++) {
            if(freq[i] > 1) return false;
        }
        return true;
        
    }
}