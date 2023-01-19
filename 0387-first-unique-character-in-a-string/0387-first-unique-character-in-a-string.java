class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<Character, Integer> hs = new HashMap<>();
        
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            int count = 0;
            if(hs.containsKey(ch))
            {
                count = hs.get(ch);
                hs.put(ch,count+1);
            }
            else
            {
                hs.put(ch,1);
            }
            
            
        }
        int index = -1;
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(hs.get(ch)==1)
            {
                
                index = i;
                break;
            }
        }
        return index;
        
    }
}