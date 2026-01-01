class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        } if(nums.length ==1) {
            return 1;
        }
        Arrays.sort(nums);
        int cnt =0;
        int maxi = Integer.MIN_VALUE;
        for (int i =1; i<nums.length;i++) {
            if(nums[i]-nums[i-1] == 1){
                cnt++;
            } 
            else if(nums[i]-nums[i-1] != 0) {
                cnt = 0;
            }
            maxi = Math.max(maxi,cnt);
        }
        return maxi == 0 ? 1 : maxi +1;
    }
}