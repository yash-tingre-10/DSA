class Solution {
    static List<List<Integer>> ans;
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        Arrays.sort(nums);
        ans = new ArrayList<>();
        List<Integer> op = new ArrayList<>();
        boolean [] visited = new boolean [nums.length];
        helper(nums,visited,op);
        
        return ans;
    }
    
    static void helper(int [] nums ,boolean [] visited ,List<Integer> op)
    {
        if(op.size()==nums.length){
            if(!ans.contains(op))
                ans.add(new ArrayList<>(op));
            return;
        }
        
        for(int i=0; i<nums.length; i++){
            if(!visited[i]){
                visited[i] = true;
                op.add(nums[i]);
                helper(nums, visited, op);
                op.remove(op.size()-1);
                visited[i] = false;
            }
            
        }
        
    }
}