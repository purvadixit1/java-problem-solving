class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>ans = new ArrayList<>(); // to store output
        int top = 0; // top row
        int bottom = matrix.length-1; // bottom row
        int left = 0; // left column
        int right = matrix[0].length-1; // right column

        while(top<=bottom && left<=right) {
            //print top
            for(int i=left;i<=right;i++) {
                ans.add(matrix[top][i]);
            }
            top++;

            //print right column
            for(int i=top;i<=bottom;i++) {
                ans.add(matrix[i][right]);
            }
            right--;

            //print bottom
            if(top<=bottom) {
                for (int i = right;i>=left;i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            //print left column
            if(left<=right) {
                for(int i= bottom;i>=top;i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }

        }
        return ans;
    }
}