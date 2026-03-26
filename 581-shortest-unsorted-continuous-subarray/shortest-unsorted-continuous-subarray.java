class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int j = 0;
        int n = nums.length;
        
        int max = Integer.MIN_VALUE;
        int right = -1,left = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > max)
                max = nums[i];
            if(max > nums[i]) //anamoly
            right = i;
        }
        int min = Integer.MAX_VALUE;
        for (int i = n-1; i >= 0; i--) {
            if (nums[i] < min)
                min = nums[i];
            if(min < nums[i]) //anamoly
            left = i;
        }
        return (right == -1) ? 0:right - left + 1;
    }
}