class Solution {
    static int [] dp;
    public int rob(int[] nums) {
        
        int n = nums.length;
        dp = new int [n+1];
        Arrays.fill(dp, -1);
        return helper(nums, n-1);
        
    }
    static int helper(int [] arr, int n){
        if(n<0)
            return 0;
        if(n==0)
            return arr[0];
        if(dp[n]!=-1)
            return dp[n];
        return dp[n] = Math.max(helper(arr, n-2) + arr[n],helper(arr,n-1) + 0);
        
    }
}