import java.util.*;

class Solution {
    public boolean isPowerOfTwo(int n) {
      if(n<=0)
      return false;
        for(int i=0;i<31;i++)
        {
            int z=(int)Math.pow(2,i);
            if(n==z)
            {
               return true;
            }
           
             
            
        }
    return false;
}
}