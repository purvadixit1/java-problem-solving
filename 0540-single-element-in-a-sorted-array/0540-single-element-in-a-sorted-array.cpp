class Solution {
public:
    int singleNonDuplicate(vector<int>& nums) {
        int n=nums.size();
        unordered_map<int, int>p;
        for(int i=0;i<nums.size();i++)
        {
            p[nums[i]]++;
        }
        int ans;
        for(auto it:p)
        {
            if(it.second==1)
            {
                ans=it.first;
                break;
            }
        }
        return ans;
    }
};