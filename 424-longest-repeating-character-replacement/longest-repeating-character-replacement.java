class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0;
        int maxcount = 0,maxlen = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            count[ch - 'A']++;
            if(count[ch - 'A'] > maxcount ) maxcount = count[ch-'A'];
            

            while((i-left+1) - maxcount > k){
                int leftidx = s.charAt(left) - 'A';
                count[leftidx]--;
                left++;
            }
            maxlen = Math.max(maxlen, i - left + 1);
            

            
        }
        return maxlen;
    }
}