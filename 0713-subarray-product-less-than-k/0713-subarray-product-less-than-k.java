class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1)
        {
            return 0;
        }
       int l=0,r=0;
       int p=1,c=0;
       for(r=0;r<nums.length;r++)
       {
           p=p*nums[r];
           while(p>=k )
           {
              p=p/nums[l];
              l++;
           }
           c=c+r-l+1;
       } 
       return c;
    }
}