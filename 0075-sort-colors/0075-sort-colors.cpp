class Solution {
public:
    void sortColors(vector<int>& nums) {
        int n=nums.size();
        int i=0;
        int h=n-1;
        int m=0;
        while(m<=h)
        {
            int x=nums[m];
            if(x==0)
            {
                swap(nums[i], nums[m]);
                i++;
                m++;
            }
          else if(x==1)
            {
                m++;
            }
            else
            {
                swap(nums[m], nums[h]);
                h--;

            }
        }
    }
};