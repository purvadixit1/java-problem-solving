class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        int n=nums.size();
        sort(nums.begin(),nums.end());
        vector<vector<int>>ans;
        for(int i=0;i<n;i++)
        {
            int j=i+1;
            int k=n-1;
            while(j<k)
            {
                if(nums[i]+nums[j]+nums[k]<0)
                {
                  j++;
                }
                else if(nums[i]+nums[j]+nums[k]>0)
                {
                    k--;
                }
                else
                {
                    vector<int>p;
                    p.push_back(nums[i]);
                    p.push_back(nums[j]);
                    p.push_back(nums[k]);
                    ans.push_back(p);
                     while(j<k&&nums[j]==p[1])
                {
                    j++;
                }
                while(j<k&&nums[k]==p[2])
                {
                    k--;
                }
                }
                
                
            }
            while(i+1<n &&nums[i]==nums[i+1])
            {
                i++;
            }
        }
        return ans;
    }
};