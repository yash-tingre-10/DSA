class Solution {
    static int [] dp;
    public int rob(int[] nums) {
        
    int n = nums.length;
        if(n==1)
            return nums[0];
        
        dp = new int [n+1];
        Arrays.fill(dp, 0);
        dp[0] = nums[0];
        
        int arr1[] = new int[n-1];
        int arr2[] = new int[n-1];
        for(int i=0; i<n-1; i++){
            arr1[i] = nums[i];       //include first element and not include last element
            arr2[i] = nums[i+1];    //not include first element and include last element
        }
        n = arr1.length;
        int first = helper(arr1, n-1);
        dp[0] = nums[1];
        
        int second = helper(arr2, n-1);
       
        return Math.max(first, second);
    }
    
    static int helper(int [] arr, int n){
        
         for(int i=1; i<=n; i++){
            if(i>1) dp[i] = Math.max(dp[i-1],dp[i-2]+arr[i]); 
            else dp[i] = Math.max(dp[i-1],arr[i]);
         }   
         return dp[n];
    }
    
}