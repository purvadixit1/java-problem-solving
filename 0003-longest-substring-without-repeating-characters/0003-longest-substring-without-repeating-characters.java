class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int res =0;
        Map<Character, Integer>charMapIndex = new HashMap<>();
        int start = 0;
        for(int end =0; end<n; end++) {
            char currChar = s.charAt(end);
            if(charMapIndex.containsKey(currChar)) {
                start = Math.max(start, charMapIndex.get(currChar) +1);
            }
            res = Math.max(res, end - start +1);
            charMapIndex.put(currChar, end);

        } 
        return res;       
    }
}