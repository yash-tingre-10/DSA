class Solution {
    public static List<List<Integer>> ans;
    
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> output = new ArrayList<>(); 
        ans = new ArrayList<List<Integer>>();
        helper(nums, output, 0);
        return ans;
    }
    
    static void helper(int []nums, List<Integer> output, int i)
    {
        if(i>=nums.length){
            ans.add(new ArrayList(output));
            return;
        }
        
        
        // Include
        output.add(nums[i]);
        helper(nums, output, i+1);
        
        // Exclude
        output.remove(output.size()-1);
        helper(nums, output, i+1);
       
        


    }
}