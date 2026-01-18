class Solution {
    public List<Integer> findAnagrams(String s, String p) {
    int[] num = new int[26];
    int[] num1 = new int[26];
    List<Integer> ans = new ArrayList<>();
    char[] c = p.toCharArray();
    char[] q = s.toCharArray();
   for (int i=0;i<p.length();i++){
            num[p.charAt(i)-'a']++;
        }
    int start = 0;
    int end = 0;
    while(end<s.length()) {
        num1[s.charAt(end)-'a']++;
        if((end - start + 1) == p.length()) {
            if (Arrays.equals(num, num1)) {
                ans.add(start);
            }
            num1[s.charAt(start)-'a']--;
            start++;
        }
        end++;
    }
return ans;
    
    }
}