class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int temp;
        while(left < right){
             if (nums[left] % 2 == 0) 
            left++;
            else if(nums[right] % 2!=0) right --;
            if(nums[left]%2 != 0 && nums[right] % 2 ==0){
                temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
        return nums;
        
    }
}