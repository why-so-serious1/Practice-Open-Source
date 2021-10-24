class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return rob(nums,dp,nums.length-1);
        
    }
    
    public int rob(int[] nums,int[] dp, int n)
    {
        if(n<0)
            return 0;;
        if(dp[n]!=-1)
            return dp[n];
        
        return dp[n]=Math.max(rob(nums,dp,n-2)+nums[n],rob(nums,dp,n-1));
    }
}