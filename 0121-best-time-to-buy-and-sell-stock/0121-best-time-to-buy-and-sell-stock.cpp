class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int a=prices[0];
        int n=prices.size();
        int prof=INT_MIN;
        for(int i=0;i<n;i++)
        {  a=min(a, prices[i]);
        prof=max(prof, prices[i]-a);

        }
        return prof<=0? 0: prof;
    }
};