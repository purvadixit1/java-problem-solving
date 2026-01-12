class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int n=s.size();
        int res=0;
        for(int i=0;i<n;i++)
        {
            vector<bool>p(256,false);
            
                for(int j=i;j<n;j++)
                {
                    if(p[s[j]]==true)
                    {
                        break;
                    }
                    else
                    {
                        p[s[j]]=true;
                        res=max(res,j-i+1);
                        
                    }
                }
            p[s[i]]=false;
        }
        return res;
    }
};