class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0 ||
                s.length() < t.length()) {
            return new String();
        }
        int[] map = new int[128];
        int count = t.length();
        int start = 0, end = 0, minLen = Integer.MAX_VALUE, startIndex = 0;
        for (char c: t.toCharArray()) {
            map[c]++;
        }
        char[] chs = s.toCharArray();
        while(end<chs.length) {
           if( map[chs[end++]]-- > 0)  {
            count--;
           }
           while(count == 0) {
            if(minLen > end - start) {
                minLen = end - start;
                startIndex = start;
            }
            if(map[chs[start++]]++ == 0) {
             count++;
            }
           }
        }
        return minLen == Integer.MAX_VALUE ? new String() : new String(chs, startIndex, minLen);
    }
}