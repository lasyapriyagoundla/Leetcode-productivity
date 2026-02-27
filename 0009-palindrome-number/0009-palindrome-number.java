class Solution {
    public boolean isPalindrome(int x) {
       
        long r=0;
        int d;
        int o=x;
        while(x>0)
        {
            d=x%10;
            r=r*10+d;
            x=x/10;
        }
        return o==r;
    }
}