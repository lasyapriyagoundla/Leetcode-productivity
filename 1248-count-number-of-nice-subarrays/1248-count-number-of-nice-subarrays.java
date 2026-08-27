class Solution {
    public static int odd(int nums[],int k)
    {
        int l=0,r=0,o=0;
        int c=0;
        for(r=0;r<nums.length;r++)
        {
            if(nums[r]%2!=0)
            {
                 o++;
            }
            while(o>k)
            {

              if(nums[l]%2!=0)
              {
                o--;
              }
              l++;
            }
            c=c+r-l+1;
            
        }
        return c;

    }
    public int numberOfSubarrays(int[] nums, int k) {
        int ans=odd(nums,k)-odd(nums,k-1);
        return ans;
    }
}