class Solution {
    public static int sub(int nums[],int k)
    {
        int l=0,r=0;
        Map<Integer,Integer> mp=new HashMap<>();
          int c=0;
        for(r=0;r<nums.length;r++)
        {
            mp.put(nums[r],mp.getOrDefault(nums[r],0)+1);
            while(mp.size()>k)
            {
                mp.put(nums[l],mp.getOrDefault(nums[l],0)-1);
                if(mp.get(nums[l])==0)

                {
                    mp.remove(nums[l]);
                }
                l++;
            }
            c=c+(r-l+1);

        }
        return c;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        int ans=sub(nums,k)-sub(nums,k-1);
        return ans;
    }
}