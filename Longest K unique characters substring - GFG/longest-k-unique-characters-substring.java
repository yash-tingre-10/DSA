//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        
        HashMap<Character, Integer> window = new HashMap<>();
        int ans = -1;
        int l = 0;
        int windowSize = 0;
        for(int r = 0; r<s.length(); r++)
        {
            char ch = s.charAt(r);
            if(window.get(ch)==null)
            {   windowSize++;   }
            window.put(ch, window.getOrDefault(ch, 0) + 1);
            
            if(windowSize==k)
            {
                ans = Math.max( r - l + 1, ans);
            }
            
            while(windowSize>k)
            { 
                ch = s.charAt(l);
                int temp = window.get(ch);
                window.put(ch, temp - 1);
                if(window.get(ch) == 0)
                {
                    window.remove(ch);
                    windowSize--;
                }
                
                l++;
            }
            
            
            
        }
        return ans;
    }
}