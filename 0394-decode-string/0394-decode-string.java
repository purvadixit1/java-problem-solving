class Solution {

    public String decodeString(String s) {
        Stack<Integer>s1 = new Stack<>();
        Stack<StringBuilder>s2 = new Stack<>();
        StringBuilder q = new StringBuilder();
        int n=0;
        for(char c: s.toCharArray()) {
           if(Character.isDigit(c)) {
            n = n*10 + (c-'0');
           } else if(c=='[') {
            s1.push(n);
            n=0;
            s2.push(q);
            q = new StringBuilder();
           } else if(c ==']') {
           int k = s1.pop();
           StringBuilder temp = q;
           q = s2.pop();
           while(k-- > 0) {
            q.append(temp);
           }
           } else {
            q.append(c);
           }
        }
return q.toString();
        
    }
}