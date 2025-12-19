class Solution {
public:
void solve(int i, int j,vector<vector<int>>& matrix, int n, int m )
{
    for(int k=0;k<n;k++)
    {
        matrix[k][j]=0;
    }
     for(int k=0;k<m;k++)
    {
        matrix[i][k]=0;
    }
}
    void setZeroes(vector<vector<int>>& matrix) {
        int n=matrix.size();
        int m=matrix[0].size();
        vector<vector<int>>s;
        s=matrix;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    solve(i, j, s,n, m);
                }
                continue;
            }
        }
        matrix=s;
    }
};