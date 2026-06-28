class Solution {
    public long maxSum(int[] nums, int k, int mul) {
    int n=nums.length;

    long s=0;
    long c=mul;
    Arrays.sort(nums);
    for(int i=n-1;i>=n-k;i--)
    {
      long x=nums[i];
      s=s+Math.max(x,x*c);
      c--;
    }
   return s;
    }
}