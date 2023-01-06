class Solution {
  static int [][] dp;
    public int longestCommonSubsequence(String text1, String text2) {
        
        int n = text1.length();
        int m = text2.length();
        dp = new int [n+1][m+1];

        for(int [] temp : dp)
          Arrays.fill(temp, 0);

        return helper(text1,text2,n,m);
    }

    static int helper(String t1, String t2, int n, int m)
    {

      for(int i = 1; i<=n; i++){
        for(int j = 1; j<=m; j++){

          if(t1.charAt(i-1)==t2.charAt(j-1))
            dp[i][j] = 1 + dp[i-1][j-1];
          else
            dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
        }
      }
      
      return dp[n][m];
    }
}