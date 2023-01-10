class Solution {
    static int [] dp;
    public int deleteAndEarn(int[] nums) {
        int max = 0;
        int n = nums.length;
        //Exceptions
        if(n==1)
            return nums[0];
        for(int temp : nums)
            max = Math.max(max,temp);
        
        int [] map = new int[10005];
        for(int i=0; i<n; i++)
            map[nums[i]]+=nums[i];
            
        dp = new int [10005];
        dp[1] = map[1];
        dp[2] = Math.max(map[1],map[2]);
        return helper(map, max);
    }
    
    static int helper(int [] map, int n){
        
        for(int i=3; i<=n; i++)
            dp[i] = Math.max(map[i] + dp[i-2], dp[i-1]);
        
        return dp[n];
    }
}