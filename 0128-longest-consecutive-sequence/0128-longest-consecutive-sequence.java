class Solution {
    public int longestConsecutive(int[] nums) {
        
        int l = 0;
        int ans = 0;
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++)
        {
            set.add(nums[i]);
        }
        
        for(int i=0; i<nums.length; i++)
        {
            
            if(!set.contains(nums[i]-1))
            {
                l = 1;
                int find = nums[i];
                while(set.contains(find + 1))
                {
                    find++;
                    l++;
                }
                ans = Math.max(ans,l);
            }
        }
        
       
       
        return ans;
    }
}