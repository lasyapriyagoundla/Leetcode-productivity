class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        int t=lower;
        for(int num:nums)
            {
                if(num>upper)
                {
                    break;
                }
                if(num>t)
                {
                ans.add(Arrays.asList(t,num-1));
                }
                if(num>=t)
                {
                    t=num+1;
                }
            }
        if(t<=upper)
        {
            ans.add(Arrays.asList(t,upper));
        }
        return ans;
    }
}