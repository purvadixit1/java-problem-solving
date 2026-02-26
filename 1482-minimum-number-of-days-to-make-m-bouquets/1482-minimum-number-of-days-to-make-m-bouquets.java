class Solution {
    private boolean isPossible(int[] bd, int m, int k, int day) {
        int total = 0;
        for(int i=0;i<bd.length;i++) {
            int count = 0;
            while(i<bd.length && count<k && bd[i]<=day) {
                count++;
                i++;
            }
            if(count == k) {
                total++;
                i--;
            }
            if(total>=m) {
                return true;
            }
        }
        return false;
    }
    public int minDays(int[] bd, int m, int k) {
        if ((long) m * k > bd.length) {
            return -1;
        }
        int low = 1;
        int high = (int) 1e9;
        while (low < high) {
            int mid = low + (high - low)/2;
            if(isPossible(bd, m, k, mid)) {
                high = mid;
            }
            else {
                low = mid + 1;
            }

        }
        return low;

    }
}