class Solution {
    public long subArrayRanges(int[] nums) {
        long s=0;
        long d=0;
        for(int i=0;i<nums.length;i++)
        {
       long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;
        for(int j=i;j<nums.length;j++)
        {

        
            min=Math.min(min,nums[j]);
            max=Math.max(max,nums[j]);
              d=max-min;
              s=s+d;
        }
        }
        return s;
    }
}