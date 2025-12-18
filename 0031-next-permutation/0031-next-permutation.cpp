class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        int n=nums.size();
     
        bool flag=false;
        int i;
    for(i=n-1;i>0;i--)
    {
        if(nums[i]>nums[i-1])
        {
           
            flag=true;
            break;
        }
    }
        if(flag)
        {
            int j;
        for(j=n-1;j>=i;j--)
        {
            if(nums[j]>nums[i-1])
            {
                swap(nums[j],nums[i-1]);
                break;
            }
        }
        }
        else
        {
            i=0;
        }
        sort(nums.begin()+i,nums.end());
        
        
    }
};