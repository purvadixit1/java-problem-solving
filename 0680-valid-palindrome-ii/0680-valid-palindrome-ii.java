class Solution {
    public boolean validPalindrome(String s) {
        int cnt = 0;
        if(s.length()==3) {
            if(s.charAt(0) != s.charAt(2)) {
                return false;
            }
        }
        for(int i=0;i<s.length()/2;i++) {
            if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
                cnt++;
            }
        } 
        return cnt<=1 ? true:false;

        
    }
}