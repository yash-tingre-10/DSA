class Solution {
    public int myAtoi(String s) {
         
        int n = s.length();
        int i=0;
        long ans = 0;
        int sign = 1;
        while(i<n && s.charAt(i)==' ')
            i++;
        if(i>=n)
            return 0;
        
        if(s.charAt(i)=='-' || s.charAt(i)=='+')
        {
            sign = s.charAt(i)=='-'?-1:1;
            i++;
        }
        
        if(i>=n)
            return 0;
            
        
        for(int j=i; j<n && s.charAt(j)>='0' && s.charAt(j)<='9'; j++)
        {
            char ch = s.charAt(j);
            int num = ch - '0';
            
            ans = ans * 10 + num;
            if (ans > Integer.MAX_VALUE) break;
        }
        
        ans = ans * sign;
        if (ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        
        return (int)ans;
        
    }
}


            
        