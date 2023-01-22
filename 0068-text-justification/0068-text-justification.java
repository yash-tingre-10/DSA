class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        int n=words.length;
        
        List<String> ans=new ArrayList<>();
        int i=0;
        while(i<n)
        {
            int j = i+1;
            int currLen = words[i].length();
            while( (j<n) && (currLen + words[j].length() + (j-i-1) ) < maxWidth) 
            {
                currLen = currLen + words[j].length();
                j++;
            }
            int div = (j-i-1);
            int space = (j-i-1);
            if(div==0)
                div=1;
            int atleast = (maxWidth - currLen - space) / div;
            int extra = (maxWidth - currLen - space) % div;
            int wc = j-i;
            if(wc==1 || j>=n)
                ans.add(justifyLeft(words,atleast,extra,i,j,false,maxWidth));
            else
                ans.add(justifyLeft(words,atleast,extra,i,j,true,maxWidth));
         i=j;   
        }
        
    return ans;
}
    
    static String justifyLeft(String [] words,int atleast, int extra, int i, int j,boolean flag,int maxWidth)
    {
        StringBuilder sb = new StringBuilder();
        if(flag==true)
        {
            for(int p=i; p<j; p++)
            {
                sb.append(words[p]);
                if(p==j-1)
                    break;
                sb.append(" ");
                for(int k=0; k<atleast; k++)
                    sb.append(" ");
                if(extra>0){
                    sb.append(" ");
                    extra--;
                }
            }
        }
        else
        {
            for(int p=i; p<j; p++)
            {
                sb.append(words[p]);
                if(p==j-1)
                    break;
                sb.append(" ");
            }
            while(sb.length()<maxWidth)
                sb.append(" ");
            }
        return sb.toString();
    }
    
    
   
    
}
