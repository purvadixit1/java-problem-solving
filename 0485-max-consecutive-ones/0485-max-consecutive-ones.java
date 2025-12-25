class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int finalCount = Integer.MIN_VALUE;
        int count = 0;
         for(int i=0;i<nums.length;i++) {
            if(nums[i] != 1) {
                count = 0;
            } else{
                count++;
                finalCount = Math.max(finalCount, count);
            }
         }
         return finalCount== Integer.MIN_VALUE? 0 : finalCount;
    }
}