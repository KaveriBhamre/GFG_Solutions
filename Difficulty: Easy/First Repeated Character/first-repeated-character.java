class Solution {
    String firstRepChar(String s) {
        // code here
        int[] freq = new int[26];
        for(char c : s.toCharArray()) {
            freq[c - 'a']++;
            if(freq[c - 'a'] > 1) return String.valueOf(c);
        }
        
        
        return "-1";
        
    }
}