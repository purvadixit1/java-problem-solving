class Solution {
    public boolean isPalindrome(String s) {
        String p = "";
        for(int i=0;i<s.length();i++) {
            if(Character.isLetterOrDigit(s.charAt(i))) {
                p += s.charAt(i);
            }
        }
    
        String q = p.toLowerCase();
        for(int i =0;i<q.length();i++) {
            if(q.charAt(i) != q.charAt(q.length()-1-i)) {
                return false;
            }
        }
        return true;
        
    }
}