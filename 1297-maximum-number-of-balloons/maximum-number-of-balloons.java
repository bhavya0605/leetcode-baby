import java.util.HashMap;

class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> bcount = new HashMap<>();
        
        // 1. Count frequencies in the given text using getOrDefault()
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            
            // Only care about letters that are actually in the word "balloon"
            if (ch == 'b' || ch == 'a' || ch == 'l' || ch == 'o' || ch == 'n') {
                // If it's a new letter, it defaults to 0 and adds 1. 
                // If it's an existing letter, it grabs the current count and adds 1.
                bcount.put(ch, bcount.getOrDefault(ch, 0) + 1);
            }
        }
        
        // 2. Calculate the limiting factor (the bottleneck)
        // We use getOrDefault here too just in case one of these letters was completely missing from the text!
        int maxBalloons = bcount.getOrDefault('b', 0); 
        
        maxBalloons = Math.min(maxBalloons, bcount.getOrDefault('a', 0));
        maxBalloons = Math.min(maxBalloons, bcount.getOrDefault('l', 0) / 2); // Requires 2 'l's per balloon
        maxBalloons = Math.min(maxBalloons, bcount.getOrDefault('o', 0) / 2); // Requires 2 'o's per balloon
        maxBalloons = Math.min(maxBalloons, bcount.getOrDefault('n', 0));
        
        return maxBalloons;
    }
}