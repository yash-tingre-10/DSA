class Solution {
    static long [] dp;
    static long mod = 1000000007;
    public int countHousePlacements(int n) {
        
        dp =new long[n+1];
        dp[0]=1;
        dp[1]=2;
        return helper(n);
    }
    
    static int helper(int n){
        
        for(int i=2; i<=n; i++)
            dp[i] =( dp[i-2] + dp[i-1] ) % mod;
        
        long ans = (dp[n]*dp[n]) % mod;
        return (int) ans;
    }
}