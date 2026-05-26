class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> lp = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            lp.put(ch,lp.getOrDefault(ch,0)+1);
        }
        int flag = 0;
        int count = 0;
           for(Map.Entry<Character,Integer> entry : lp.entrySet() ){
            Integer value = entry.getValue();
            count += (value / 2) * 2;
        
            if (value % 2 == 1) {
                flag = 1;
            } 
        }
        
        count = count + flag;
        return count;
    
}
}