// Please run on leetcode compiler to check results
//Leetcode 1155

/**
* Input: n = 1, k = 6, target = 3
* Output: 1
* Explanation: You throw one die with 6 faces.
            There is only one way to get a sum of 3.
 */

class Solution {
    
    int MOD = (int)(1e9 + 7);
    
    public int numRollsToTarget(int n, int k, int target) {
        
        int dp[][] = new int[n+1][target+1];
        
        
        for(int d[]: dp) 
            Arrays.fill( d, -1 );
        
        return helper(n, k, target, dp);   
    }
    
    int helper(int n, int k, int tar, int dp[][]) {
        
        if(n == 0) {
            if(tar == 0)
                return dp[n][tar] = 1;
            else
                return dp[n][tar] = 0;
        }
        
        if(dp[n][tar] != -1)
            return dp[n][tar];
        
        int count = 0;
        for(int i = 1; i <= k; i++) {
            if( tar - i >= 0 ) {
                int ans = helper(n-1, k, tar-i, dp); 
                count = ( (count % MOD) + (ans % MOD) ) % MOD;
            }
        }
        
        return dp[n][tar] = count;
    }
}