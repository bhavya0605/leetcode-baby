class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
         
         HashMap<Character, Integer> m = new HashMap<>();
         for(int i = 0; i < magazine.length(); i++){
          char ch = magazine.charAt(i);
          m.put(ch,m.getOrDefault(ch,0)+1);
         }

         for(int i = 0; i < ransomNote.length(); i++){
            char ch = ransomNote.charAt(i);

            int count = m.getOrDefault(ch,0);

            if(count == 0) return false;

            m.put(ch,count - 1);

         }
         return true;


            
        //     // 1. Check if the letter even exists in the map
        //     if (!supply.containsKey(ch)) {
        //         return false; 
        //     }

        //     // 2. It exists! Get the current count and subtract 1
        //     int newCount = supply.get(ch) - 1;
            
        //     // 3. If it hits zero, remove it completely. Otherwise, update it.
        //     if (newCount == 0) {
        //         supply.remove(ch); // Deletes the key from the map
        //     } else {
        //         supply.put(ch, newCount); // Updates the map with the lower count
        //     }
        // }

   

         }
    }
