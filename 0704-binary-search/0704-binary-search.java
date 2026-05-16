class Solution {
    public int search(int[] nums, int t) {
        int n=nums.length;
        int l=0;
        int h=n-1;
        while(l<=h)
        {
        int m=(l+h)/2;
        
        if(nums[m]<t)
        {
            l=m+1;
        }
        else if(nums[m]>t)
        {
            h=m-1;

        }
        else if(nums[m]==t)
        {
         return m;
        }
        }  
        return -1;
    }
}