class Solution {
    public boolean isPalindrome(int x) {
        
        int num = 0;
        int temp =x;
        while(temp>0)
        {
            num = num*10 + temp%10;
            temp = temp/10;
        }
        if(num==x)
            return true;
        else return false;
        
    }
}