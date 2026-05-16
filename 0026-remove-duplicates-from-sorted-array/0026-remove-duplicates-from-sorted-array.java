class Solution {
    public int removeDuplicates(int[] nums) {

       LinkedHashSet<Integer> ans=new LinkedHashSet<>();
       for(int i=0;i<nums.length;i++)
       {
        ans.add(nums[i]);
       }
       int index=0;
       for(int v : ans)
       {
        nums[index]=v;
        index++;
       }
       return ans.size();

    }
}