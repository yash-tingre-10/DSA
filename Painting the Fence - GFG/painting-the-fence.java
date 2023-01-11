//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class Solution
{
    static long [] dp;
    static int mod = 1000000007;
    long countWays(int n,int k)
    {
     dp = new long[n+1];
     Arrays.fill(dp, -1);
     return helper(n,k);   //code here.
    }
    
    // static long helper(int n, int k){
        
    //     if(n==1)
    //         return k;
    //     if(n==2)
    //         return (k + (k*(k-1))) % mod;
    //     if(dp[n]!=-1)
    //         return dp[n];
    //     return dp[n] =  (helper((n-2),k)*(k-1) + helper((n-1), k)*(k-1)) % mod;
    // }
    
    static long helper(int n, int k){
        
        if(n==1)
            return k;
        if(n==2)
            return (k + (k*(k-1))) % mod;
        dp[1] = k;
        dp[2] = (k+ k*(k-1)) % mod;
        
        for(int i=3; i<=n; i++){
            
            dp[i] = ( dp[i-2]*(k-1) + dp[i-1]*(k-1) ) % mod;
        }
        
        return dp[n];
    }
    
    
    
}




//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main (String[] args) throws IOException{
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while(testcases-- > 0){
            //int n=Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] a2 = line.trim().split("\\s+");
            int n =Integer.parseInt(a2[0]);
            int k =Integer.parseInt(a2[1]);

            Solution ob=new Solution();
            //ArrayList<Long> ans=ob.smallestDifferenceTriplet(a,b,c,n);
            long ans=ob.countWays(n,k);
            System.out.println(ans);
        }
    }
}



// } Driver Code Ends