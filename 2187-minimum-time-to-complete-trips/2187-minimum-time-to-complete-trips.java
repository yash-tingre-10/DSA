class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        
        
        long start = 1;
        long end = 100000000000001L;
                   
        long ans =0;
        
        while(start<=end)
        {
            long mid = start + (end - start)/2;
            if( isValid(time, mid,totalTrips)==true)
            {
                ans = mid;
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        
        return ans;
    }
    
    static boolean isValid(int [] time, long target, int trips)
    {
        int n = time.length;
        long ans = 0;
        for(int i = 0; i<n; i++)
        {
            ans = ans + (target/time[i]);
        }
        if(ans >= trips)
            return true;
        return false;
        
    }
}