class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int n = nums.length;
        int [] ans = new int[n-k+1];
        int l = 0;
        Deque<Integer> window = new ArrayDeque<>();
        
        int z = 0;
        for(int r = 0; r<n; r++)
        {
            while(window.size() > 0 && window.peekLast() < nums[r])
                window.pollLast();
            window.add(nums[r]);
            
            
            if(( r - l + 1) == k)
            {    
                ans[z++] = window.peekFirst();
                if(window.peekFirst()==nums[l])
                    window.pollFirst(); 
                
                l++;
                
            }
        }
        
        return ans;
        
    }
}