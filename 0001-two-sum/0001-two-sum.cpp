class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        
        vector<int> ans(2);
        unordered_map<int, int> map;
        for(int i=0; i<nums.size(); i++)
        {
            int newTarget = target - nums[i];
            if(map.find(newTarget)!=map.end())
            {
                ans[0] = i;
                ans[1] = map[newTarget];
            }
            map.insert({nums[i], i});
        }
      
        return ans;   
    }
};