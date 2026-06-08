class Solution {
    public int lengthOfLongestSubstring(String s) {
       int distinct = 0;
       int[] count = new int[128];
       int left = 0;
       int maxlen = 0;
       for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            count[ch]++;
            while(count[ch] > 1){
                char leftchar = s.charAt(left);
                count[leftchar]--;
                left++;
            }
            maxlen = Math.max(maxlen,i-left+1);
       } 
       return maxlen;
    }
}