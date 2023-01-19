class Solution {
    public String minRemoveToMakeValid(String s) {
        String ans = "";
        Stack<Integer> st = new Stack<>();
        int count = 0;
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch!='(' && ch!=')')
                continue;
            if(ch=='(')
            {
                count++;
                st.push(i);
            }
            else if(ch==')' && count>0)
            {
                st.push(i);
                count--;
                st.pop();
                st.pop();
            }
            else if(ch==')' && count==0)
            {
                st.push(i);
            }
            
        }
        
        Set<Integer> notValid = new HashSet<>(st);
        for(int i=0; i<s.length(); i++){
            if(!notValid.contains(i))
                ans=ans+s.charAt(i);
        }
        return ans;
    }
}