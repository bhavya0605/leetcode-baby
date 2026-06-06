class Solution {
    public int totalFruit(int[] fruits) {
        int[] count = new int[100001];
        int distinct = 0;
        int len = 0;
        int left = 0;
        for(int i = 0; i < fruits.length; i++){

            if(count[fruits[i]] == 0) distinct++;
            count[fruits[i]]++;
            while(distinct > 2){
                count[fruits[left]]--;
                if(count[fruits[left]] == 0) distinct--;

                left++;

            }
            len = Math.max(len,i-left+1);
        }
        return len == 0 ? 1 : len;
    }
}