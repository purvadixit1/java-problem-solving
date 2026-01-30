class Solution {
    public String countAndSay(int n) {
        if(n==1)return "1";
        if(n==2)return "11";
        String s=countAndSay(n-1);
        int l=0;
        int r=0;
        StringBuilder sb=new StringBuilder();
        char[] c=s.toCharArray();
        while(r<c.length)
        {
            if(c[r]!=c[l])
            {
                sb.append(r-l).append(c[l]);
                l=r;
            }
            r++;
        }
        sb.append(r-l).append(c[l]);
        sb.toString();
        return sb.toString();
    }
}