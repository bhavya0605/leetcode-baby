class Solution {
    public int totalFruit(int[] fruits) {
        // The problem constraints state fruits[i] <= 100,000
        int[] count = new int[100001]; 
        int distinct = 0;
        int maxLen = 0;
        int left = 0;
        
        for (int i = 0; i < fruits.length; i++) {
            // If this fruit isn't in our current window, we are tracking a new distinct type
            if (count[fruits[i]] == 0) {
                distinct++;
            }
            count[fruits[i]]++;
            
            // Shrink the window from the left if we exceed 2 distinct types
            while (distinct > 2) {
                count[fruits[left]]--;
                if (count[fruits[left]] == 0) {
                    distinct--; // We completely emptied this fruit type from our window
                }
                left++;
            }
            
            // Update maxLen automatically (handles both 1 or 2 distinct fruit types)
            maxLen = Math.max(maxLen, i - left + 1);
        }
        
        return maxLen;
    }
}