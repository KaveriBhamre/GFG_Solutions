class Solution {
    public int maxChildren(int[] greed, int[] cookie) {
        // code here
        Arrays.sort(greed);
        Arrays.sort(cookie);
        int count = 0;
        int i = 0, j = 0;
        while(i < greed.length && j < cookie.length) {
            if(cookie[j] >= greed[i]) {
                count++;
                i++;
                j++;
            }else {
                j++;
            }
        }
        return count;
    }
}