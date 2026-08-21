class Solution {
    public int findDuplicate(int[] nums) {
        // int[] a = nums;
        // int j = 0;
        // Arrays.sort(a);
        // for(int i=1;i<nums.length;i++) {
        //     if(a[j] == a[i]) {
        //         return a[i];
            
        //     }
        //    j++;
        // }
        // return 0;

             var list = new HashSet<>();
             int ans = nums[0];

        for(int num : nums) {
            if(list.contains(num)) {
               ans = num;
            }
            list.add(num);
        }
        return ans;
        
    }
}