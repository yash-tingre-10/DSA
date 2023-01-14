class Solution {
    public boolean isSubsequence(String s, String t) {
        
        boolean ans = true;
        int it = 0;
        int i=0;
        
        while(it<s.length() && i<t.length())
        {
            if(s.charAt(it)==t.charAt(i) )
                it++;
            i++;
            
        }
        if(it<s.length())
            return false;
        
        return ans;
    }
}