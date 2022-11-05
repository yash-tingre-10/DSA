class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
      int temp = 0;
            for(int i = m; i<n+m; i++)
            {
                nums1[i] = nums2[temp]; 
                temp++;
            }
            
        Arrays.sort(nums1);
        
    }
}