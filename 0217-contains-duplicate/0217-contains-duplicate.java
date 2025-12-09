class Solution {
    public boolean containsDuplicate(int[] nums) {
        int len = nums.length;
        if (len==1) {
            return false;
        }
        Arrays.sort(nums);
        int i=0;
        int j=i+1;
       while(i<len && j<len) {
        if (nums[i] == nums[j]) {
            return true;
        }
        i++;
        j++;
       }
        return false;
    }
}