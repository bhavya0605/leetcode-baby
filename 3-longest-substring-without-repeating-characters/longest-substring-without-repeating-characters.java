class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0;
        int maxlen = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        while(map.get(ch) > 1){
            char leftindex = s.charAt(left);
            map.put(leftindex,map.get(leftindex)-1);
            left++;
            }
        maxlen = Math.max(maxlen, i - left + 1);
        }
        return maxlen;
    }
}