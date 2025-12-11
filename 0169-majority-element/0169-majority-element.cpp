class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int p=INT_MIN;
        unordered_map<int, int>mp;
        for(int i=0;i<nums.size();i++)
        {
            mp[nums[i]]++;
            p=max(p, mp[nums[i]]);
        }
        int ans;
for(auto it: mp)
{
    if(it.second==p)
    {
ans=it.first;
break;
    }
}
return ans;
    }
};