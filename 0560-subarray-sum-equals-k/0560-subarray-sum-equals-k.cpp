class Solution {
public:
    int subarraySum(vector<int>&nums, int k) {
      
    //     int n=arr.size();
    // int sum=0;
    //     int i=0;int j=0;
    //     int len=INT_MIN;
    //     while(j<n)
    //     {
    //         sum+=arr[j];
    //         if(sum<k)
    //         {
    //             j++;
    //         }
    //         else if(sum==k)
    //         {
    //             len=max(len,j-i+1);
    //             j++;
    //         }
    //         else if(sum>k)
    //         {
    //             while(sum>k)
    //             {
    //                 sum-=arr[i];
    //                 i++;
    //             }
    //                 if(sum==k)
    //                 {
    //                     len=max(len,j-i+1);
    //                 }
    //             j++;
    //         }
    //     }
    //     return len;
//         int i = 0, j = 0, sum = 0;
//     int maxLen = INT_MIN;
//         int N=A.size();
   
//     while (j < N) {
//         sum += A[j];
//         if (sum < K) {
//             j++;
//         }
//         else if (sum == K) {
//             maxLen = max(maxLen, j-i+1);
//             j++;
//         }
//         else if (sum > K) {
//             while (sum > K) {
//                 sum -= A[i];
//                  i++;
//             }
//               if(sum == K){
//               maxLen = max(maxLen, j-i+1);
//             }
//             j++;
//         }
//     }
//     return maxLen;
         int n = nums.size();
        unordered_map<int,int> mp;
//         mp[0] = 1;                          //freq of sum=0
//         int ans = 0,sum = 0;
        
//         for(auto num: nums){
//             sum += num;
         
//             if(mp.find(sum-k)!=mp.end()){   //if diff of sum and k is present in hash, then add freq to ans
//                 ans += mp[sum-k];
//             }
//             mp[sum]++;                      //freq of sum inc
//         }
//         return ans;
        int count=0;
        int currsum=0;
        int i=0;
        while(i<n)
        {
            currsum+=nums[i];
            if(currsum==k)
            {
                count++;
            }
           if(mp.find(currsum-k)!=mp.end())
            {
                count+=mp[currsum-k];
            }
            mp[currsum]++;
            i++;
        }
return count;

       }
};