class Solution {
    public int findDuplicate(int[] nums) {
        int[] a = nums;
        int j = 0;
        Arrays.sort(a);
        for(int i=1;i<nums.length;i++) {
            if(a[j] == a[i]) {
                return a[i];
            
            }
           j++;
        }
        return 0;
        
    }
}