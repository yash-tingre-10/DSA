class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int [] ans = new int[2];
        HashMap<Integer, Integer> hs = new HashMap<>();
        
        for(int i=0; i<nums.length; i++)
        {
            int newTarget = target - nums[i];
            if(hs.containsKey(newTarget))
            {
                ans[0] = i;
                ans[1] = hs.get(newTarget);
            }
            hs.put(nums[i], i);
        }
        return ans;
        
    }
}