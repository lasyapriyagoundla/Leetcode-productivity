class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
      
       
        Set<List<Integer>> set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            HashSet<Integer>hs=new HashSet<>();

            for(int j=i+1;j<n;j++)
            {
                int k=-(nums[i]+nums[j]);
                if(hs.contains(k))
                {
                  List<Integer> ans=Arrays.asList(nums[i],nums[j],k);
                  Collections.sort(ans);
                  set.add(ans);
                }
                 hs.add(nums[j]);

                
            }
        }
        return new ArrayList<>(set);
    }
}