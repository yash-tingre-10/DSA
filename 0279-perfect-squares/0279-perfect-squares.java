class Solution {
    static int []dp;
    public int numSquares(int n) {
        dp = new int [n+1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        return helper(n);
        
    }

static int helper(int n){
        if(n==0)
            return 0;
        if(dp[n]!=-1)
            return dp[n];
        int ans = Integer.MAX_VALUE;
        for(int i=1; i*i<=n; i++)
        {
            ans = Math.min(helper(n-i*i) , ans);
        }
        return dp[n] = ans + 1;
        
    }
}