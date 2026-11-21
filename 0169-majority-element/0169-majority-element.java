class Solution {
    public int majorityElement(int[] nums) {
       int n=nums.length;
       if(n==1)
       {
        return nums[0];
       }
        int c=1;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++)
        {

            if(nums[i]==nums[i+1])
            {
                c++;
                if(c>n/2)
                {
                    return nums[i];
                }
            }
            else
            {
                c=1;
            }


            
        }
        return -1;

    }
}