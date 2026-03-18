import java.util.*;
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0)
       return false;
       for(int i=0;i<20;i++)
       {
        int z=(int)Math.pow(3,i);
        if(z==n)
        {
            return true;
        }
       }
       return false;
    }
}