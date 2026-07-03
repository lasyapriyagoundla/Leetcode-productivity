class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
          Arrays.sort(nums);
          int cl=nums[0]+nums[1]+nums[2];
        for(int i=0;i<n;i++)
        {
            int l=i+1,r=n-1;
            while(l<r)
            {
                int s=nums[i]+nums[l]+nums[r];
                if(Math.abs(s-target)<Math.abs(cl-target)) 
                {
                   cl=s;
                }
                if(s==target)
                {
                    return s;
                }
                else if(s>target)
                {
                  r--;
                }
                else
                {
                    l++;
                }
            }
        }
        return cl;
    }
}