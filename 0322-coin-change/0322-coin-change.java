class Solution {
  static int [][] dp;
    public int coinChange(int[] coins, int amount) {
      int n = coins.length;
        dp = new int [n+1][amount +1];
        
        for(int [] temp : dp)
            Arrays.fill(temp, -1);
        
        int ans = helper(coins, amount,n);
        if(ans==Integer.MAX_VALUE-1)
          return -1;
        return ans;
    }
    
    
    static int helper(int [] coins, int amount, int n)
    {
        if(n==0) 
            return Integer.MAX_VALUE-1;
        if(amount <= 0) 
            return 0;

        if(dp[n][amount] != -1) 
            return dp[n][amount];

        int trigger = -1;
        
        if(coins[n-1] <= amount){
            int c1 = helper(coins, amount, n-1);
            int c2 = 1 + helper(coins, amount-coins[n-1], n);
            return dp[n][amount] = Math.min(c1,c2);
        }
        else
            return dp[n][amount] = helper(coins, amount, n-1);
    }

}

// Tabulation
//     static int helper(int[] coins, int amount, int n)
//     {
//       if (amount == 0) 
//             return 0;
//       if (coins == null || coins.length == 0 || amount < 0) 
//             return -1;
        
//       for(int i=2; i<=n; i++){
//         for(int j=1; j<=amount; j++){
//           if(coins[i-1]<=j)
//             dp[i][j]  = Math.min(dp[i][j-coins[i-1]] + 1, dp[i-1][j]);
//           else
//             dp[i][j] = dp[i-1][j];
//         }
//       }
      
//       return dp[n][amount];
//     }