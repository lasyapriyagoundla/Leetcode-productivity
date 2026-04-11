class Solution {
    public int singleNumber(int[] nums) {
       int t=nums.length; 
       for(int i=0;i<t;i++)
       {
       int c=0;
        for(int j=0;j<t;j++)
        {
            if(nums[i]==nums[j])
            {
                c++;
            }
        }
        if(c==1)
        {
            return nums[i];
        }
       }
       return -1;
    }
}