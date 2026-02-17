class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        if(nums[start]<=nums[end]) {
            return nums[start];
        } else
        {
            while(nums[end]>=nums[end-1]) {
                end--;
            }
            return nums[end];
        }

        
    }
}