class Solution {
    public int minAddToMakeValid(String s) {
        
       int n=s.length();
        Stack<Character> st = new Stack<>();
        int count=0;
        
        for(int i=0; i<n; i++)
        {
            char temp=s.charAt(i);
            if(temp=='(')
            {
                st.push(temp);
                count++;
               
            }
            else if(temp==')' && count>0)
            {
                st.push(temp);
                count--;
                st.pop();
                st.pop();
            }
            else if(temp==')' && count==0)
            {
                st.push(temp);
                
            }
            
        }
        
        return st.size();
    }
}