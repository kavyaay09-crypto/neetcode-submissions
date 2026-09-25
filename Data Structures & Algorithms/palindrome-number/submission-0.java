class Solution {
    public boolean isPalindrome(int x) {
        int Original = x;
        int reverse = 0;
        while(x>0)
        {
            int R = x%10;
            x = x/10;
             reverse = (reverse*10)+R;
            
        }
        if(reverse == Original)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}