class Solution {
public:
    int maxProduct(vector<int>& nums) {
        int n=nums.size();
        int ans=nums[0];
        int maxa=ans;
        int mina=ans;
        for(int i=1;i<n;i++)
        {
  if(nums[i]<0)
  {
      swap(maxa,mina);
  }
  maxa=max(maxa*nums[i],nums[i]);
  mina=min(mina*nums[i],nums[i]);
  ans=max(ans,maxa);
        }
        return ans;
    }
};