//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Recursion {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();//testcases
		while(T-->0)
		{
		    Solution obj=new Solution();
		    
		    int n,k;
		    //taking input n and k
		    n=sc.nextInt();
		    k=sc.nextInt();
		    
		    //calling josephus() function
		    System.out.println(obj.josephus(n,k));
		    
		    
		}
		
	}
}


// } Driver Code Ends


class Solution
{
   public int josephus(int n, int k)
    {
        ArrayList<Integer> people = new ArrayList<>(n);
        k--;
        for(int i=0; i<n; i++)
        {   people.add(i+1);   }
        
        return solve(people,k,0);
      
       
    }

    static int solve(ArrayList<Integer> people, int k, int index)
    {
        if(people.size()==1)
        {   
            return people.get(0);   
        }
        
        index = (index + k) % people.size();
        people.remove(index);
        return solve(people, k, index);
    }
}

