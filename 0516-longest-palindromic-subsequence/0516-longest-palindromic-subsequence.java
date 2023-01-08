class Solution {
    static int [][] dp;
    public int longestPalindromeSubseq(String s1) {
        
        int n = s1.length();
        String s2 = new StringBuilder(s1).reverse().toString();
        int m = s2.length();
        dp = new int [n+1][m+1];
        return helper(s1,s2,n,m);
    }
    
    static int helper(String s1, String s2, int n, int m){
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(s1.charAt(i-1)==s2.charAt(j-1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[n][m];
    }
}