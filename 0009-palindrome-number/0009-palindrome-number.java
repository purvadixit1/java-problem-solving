class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) {
            return false;
        }
        int n = x;
        int remq = 0;
        while(n>0) {
            int d = n%10;
            remq = remq*10 + d;
            n = n/10;
        }
        return x==remq ? true : false;
       
    }
}