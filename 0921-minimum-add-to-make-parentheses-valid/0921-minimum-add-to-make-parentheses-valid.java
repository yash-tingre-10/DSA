class Solution {
    public int minAddToMakeValid(String s) {
        
        Stack<Character> st = new Stack<>();
        int count = 0;
        
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch=='('){
                st.push(ch);
                count++;
            }
            else if(ch==')' && count>0){
                st.push(ch);
                count--;
                st.pop(); 
                st.pop();
            }
            else if(ch==')' && count==0){
                st.push(ch);
            }

        }
        
        return st.size();
    }
}