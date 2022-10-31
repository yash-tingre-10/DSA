class Solution {
    public String longestPalindrome(String s) {
        
        
        String ans = "";
        int ansLen = 0;
        int l = 0;
        int r = 0;
        int n = s.length();
        
        if(n==1)
            return s;
        
        for(int i = 0; i<s.length(); i++)
        {
            r = i;
            l = i;
            while(l>=0 && r <n && s.charAt(l)==s.charAt(r) )
            {
                if(r - l + 1 > ansLen)
                {
                    ansLen = (r - l + 1);
                    ans = s.substring(l, r+1);
                }
                r++;    l--;
            }
                
                
            r = i+1;
            l = i;
            while(l>=0 && r <n && s.charAt(l)==s.charAt(r) )
            {
                if(r - l + 1 > ansLen)
                {
                    ansLen = (r - l + 1);
                    ans = s.substring(l, r+1);
                }
                r++;    l--;
                 
            }
            
    }
    
        return ans;
    }
}