class Solution {
    public static int unique(int nums[],int k)
    {
        int l=0,r=0,c=0;
        Map<Integer,Integer> mp=new HashMap<>();
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
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            s.add(nums[i]);
        }
        int n=s.size();
        int ans=unique(nums,n)-unique(nums,n-1);
        return ans;
    }
}