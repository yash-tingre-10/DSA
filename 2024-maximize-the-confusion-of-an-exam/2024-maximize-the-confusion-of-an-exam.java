class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
     int [] count = new int[2];
        count[0] = 0;count[1] = 0;
        int l=0;
        int Max = 0;
        int ans = 0;
        for(int r=0; r<answerKey.length(); r++)
        {
            if(answerKey.charAt(r)=='T')
            {   count[0] = count[0] + 1;   }
            else
            {   count[1] = count[1] + 1;   }
            ;
            
            while((r - l + 1) - Math.max( count[0],  count[1] ) > k )
            {
                
                if(answerKey.charAt(l)=='T')
                {   count[0] = count[0] - 1;   }
                else
                {   count[1] = count[1] - 1;   }
                
                l++;
            }
            
            ans = Math.max(r-l+1,ans);
            
        }
        return ans;
        
        
    }
}