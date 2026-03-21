class Solution {
    public int[] twoSum(int[] nums, int target) {
        int t=nums.length;
        
        for(int i=0;i<t;i++)
        {
   for(int j=i+1;j<t;j++)
   {
    if(nums[i]+nums[j]==target)
    {
        return new int []{i,j};
    }
   }
        }
        return new int[]{-1,-1};
    }
}