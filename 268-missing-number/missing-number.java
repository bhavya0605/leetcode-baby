class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int miss = 0,a_sum = 0, r_sum = 0;
        for(int i = 0; i < nums.length; i++){
            r_sum += nums[i];
            a_sum += i;
        }
        a_sum += nums.length;

        miss = a_sum - r_sum;
        return miss;
    }

}