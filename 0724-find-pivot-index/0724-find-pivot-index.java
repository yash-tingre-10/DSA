class Solution {
    public int pivotIndex(int[] nums) {
        
        int ans = -1;
        int lsum = 0,rsum = 0;
        int arrSum = 0;
        
        for(int i=0; i<nums.length; i++)
        {   arrSum += nums[i];  }
        
        for(int i=0; i<nums.length; i++)
        {
            rsum = arrSum - nums[i] - lsum;
            
            if(lsum==rsum)
                return i;
            lsum +=nums[i];
        }
        return ans;
        
    }
}