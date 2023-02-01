class Solution {
    public int reverse(int x) {
       
        long ans = 0;
        boolean isNegetive = false;
        if(x<0){
            isNegetive = true;
            x = x * -1;
        }
        while(x>0)
        {
            int digit = x % 10;
            ans = ans * 10 + digit;
            x = x / 10;
            if(ans > Integer.MAX_VALUE)
                break;
        }
        
        if(isNegetive==true)
            ans = ans * -1;
        if (ans > Integer.MAX_VALUE) return 0;
        if (ans < Integer.MIN_VALUE) return 0;
        return (int)ans;
        
    }
}