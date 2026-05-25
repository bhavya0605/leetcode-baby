import java.util.HashMap;
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> charcount = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(charcount.containsKey(ch)){
                int curr_count = charcount.get(ch);

                charcount.put(ch,curr_count + 1);
            }
            else 
                charcount.put(ch,1);
        }
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(charcount.get(ch) <= 1){
                return i;
            }
        }
        return -1;
    }
}