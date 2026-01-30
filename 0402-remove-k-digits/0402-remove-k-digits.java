class Solution {
    public String removeKdigits(String num, int k) {
        int i= 0;
        if(num.length() == k) {
            return "0";
        }
       
        Stack<Character>st = new Stack<>();
     
        while(i<num.length()) {
             while(k>0 && !st.isEmpty() && st.peek()>num.charAt(i)){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
            i++;
        }
        while(k>0){
            st.pop();
            k--;            
        }
         String ans = num.substring(i);
        while(!st.isEmpty()) {
         ans = st.peek() + ans;
         st.pop();
        }
        ans = ans.replaceFirst("^0+(?!$)", "");
        return ans;

    }
}