class Solution {
    public int maximumRobots(int[] chargeTimes, int[] runningCosts, long budget) {
        
        int n = runningCosts.length;
        int ans = 0;
        int l = 0;
        long sum = 0;
        Deque<Integer> window = new ArrayDeque<>();
        
        for(int r=0; r<n; r++)
        {
            while(!window.isEmpty() && window.peekLast() < chargeTimes[r])
            {
                window.pollLast();
            }
            window.add(chargeTimes[r]);
            sum = sum + runningCosts[r];
            
            int windowSize = (r-l+1);
            int max = window.peekFirst();
            
            if((max + windowSize * sum) <= budget)
            {
                ans = Math.max(windowSize, ans);
            }
            else if((windowSize + max * sum) > budget)
            {
                
                if(max==chargeTimes[l])
                    window.pollFirst();
                sum = sum - runningCosts[l];
                l++;
            }
            
            
        }
        
        return ans;
        
    }
}