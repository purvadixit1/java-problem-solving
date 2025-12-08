class Solution {
    public int countTriples(int n) {
        int count = 0;
        for (int i = 1; i<=n; i++) {
            for(int j = 1; j<=n; j++) {
                int square = i*i + j*j;
                int square_root = (int) Math.sqrt(square);
                if(square_root <= n && square_root*square_root == square) {
                    count++;
                }
            }
        }
        return count;   
    }
}