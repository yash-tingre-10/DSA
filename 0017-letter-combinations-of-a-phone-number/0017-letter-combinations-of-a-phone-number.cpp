class Solution {
public:
string dialer[10] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    void helper(vector<string>& ans, string digit, string st, int idx){
        
        if(idx==digit.length())
        {
            ans.push_back(st);
            return;
        }
        
        string temp = dialer[digit[idx]-'0'];
        for(int i=0; i<temp.size(); i++){
            st.push_back(temp[i]);
            helper(ans,digit, st,idx+1);
            st.pop_back();
        }
    }
    
    int temp2 = 0;
    
    vector<string> letterCombinations(string digits) {
        vector<string> ans;
        if(digits.size()==0) return ans;
        helper(ans,digits,"",0);
        return ans;
    }
};