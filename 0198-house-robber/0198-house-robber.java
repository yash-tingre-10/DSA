class Solution {
    static int [] dp;
    public int rob(int[] nums) {
        
        int n = nums.length;
        // if(n==2)
        //     return Math.max(nums[0], nums[1]);
        System.out.println(n);
        dp = new int [n+1];
        Arrays.fill(dp, 0);
        dp[0] = nums[0];
        // return helper(nums, n-1);
        
        return helper(nums, 0, n-1);
    }
    // Memoizations
//     static int helper(int [] arr, int n){
//         if(n<0)
//             return 0;
//         if(n==0)
//             return arr[0];
//         if(dp[n]!=-1)
//             return dp[n];
//         return dp[n] = Math.max(helper(arr, n-2) + arr[n],helper(arr,n-1) + 0);
        
//     }
    
    // Tabulation
     static int helper(int [] arr, int s, int n){
        
         for(int i=1; i<=n; i++){
            if(i>1) dp[i] = Math.max(dp[i-1],dp[i-2]+arr[i]); 
            else dp[i] = Math.max(dp[i-1],arr[i]);
         }
        
        
         return dp[n];
    }
}