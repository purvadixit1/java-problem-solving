class Solution {
    public void rotate(int[][] matrix) {
        int n= matrix.length;
        int m = matrix[0].length;
        int[][] ans = new int[n][m];
        for(int j = 0; j<m ; j++) {
            for(int i = n-1; i>=0; i--) {
                ans[j][n-1-i] = matrix[i][j];
            }
        }
        for (int i= 0;i<n;i++) {
            for(int j= 0;j<m;j++) {
                matrix[i][j]= ans[i][j];
            }
        }
        
    }
}