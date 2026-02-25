class Solution {
    public boolean isPossible(int[] weights, int days, int mid) {
        int tDay =1;
        int sum = 0;
        for(int i:weights) {
            if(sum+i<=mid) {
                sum +=i;
            } else {
                tDay++;
                sum = i;
            }
        }
        return tDay<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int start = Integer.MIN_VALUE;
        int ans = 0;
        int end = 0;
    
        for (int weight : weights) {
            end += weight;
            if(start<weight) {
                start = weight;
            }
        }
       while(start<=end) {
        int mid = start + (end-start)/2;
        if(isPossible(weights, days, mid)) {
            ans = mid;
            end = mid-1;
        } else {
            start = mid +1;
        }
       }
       return ans;

        
    }
}