class Solution {
    public static List<List<Integer>> ans;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        List<Integer> output = new ArrayList<>(); 
        ans = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums, output, 0);
        
        return ans;
    }
    
    static void helper(int []nums, List<Integer> output, int i)
    {
        if(i>=nums.length){
            if(!ans.contains(output))
                ans.add(new ArrayList(output));
            return;
        }
        // Exclude
        output.add(nums[i]);
        helper(nums, output, i+1);
        
        // Include
        output.remove(output.size()-1);
        helper(nums, output, i+1);

    }
}