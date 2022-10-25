class Solution {
    public int characterReplacement(String s, int k) {
        
        HashMap<Character, Integer> window = new HashMap<>();
        int ans = 0;
        int l = 0;
        int Max = 0;
    for (int r = 0; r < s.length(); r++) 
    {
        
        window.put(s.charAt(r), window.getOrDefault(s.charAt(r), 0) + 1);
        Max = Math.max( Max, window.get(s.charAt(r)));
        while((r - l + 1) - Max > k )
        {
            int curr = window.get(s.charAt(l));
            window.put(s.charAt(l), curr-1);
            if(window.get(s.charAt(l)) == 0)
            {
                window.remove(s.charAt(l));
            }
            
            l++;
        }
        ans = Math.max(r-l+1, ans);
        
    }
        return ans;
        
    }
}



