class Solution {
    public int[] findErrorNums(int[] nums) {
        int dup = -1;
        int mis = -1;
        for(int i= 1; i<=nums.length;i++) {
            int cnt = 0;
            for(int j= 0;j< nums.length;j++) {
                if(nums[j]==i) {
                    cnt++;
                }
            }
            if(cnt == 2) {
                dup = i;
            }
            if(cnt == 0) {
                mis = i;
            }
        }
        return new int[] {dup, mis};
        
    }
}