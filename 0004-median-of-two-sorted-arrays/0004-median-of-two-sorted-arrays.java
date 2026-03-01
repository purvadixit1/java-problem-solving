class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        ArrayList<Integer>arr=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            arr.add(nums1[i]);
        }
        for(int i=0;i<m;i++)
        {
            arr.add(nums2[i]);
        }
        Collections.sort(arr);
        if((n+m)%2!=0)return arr.get((n+m)/2);
        return Double.valueOf(Double.valueOf(arr.get((n+m)/2)+Double.valueOf(arr.get((n+m)/2-1)))/Double.valueOf(2));
    }
}