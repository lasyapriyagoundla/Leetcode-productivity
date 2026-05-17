class Solution {
    public int singleNumber(int[] nums) {
       int n=nums.length; 
       HashMap<Integer,Integer> h=new HashMap<>();

       for(int i=0;i<n;i++)
       {
       if(h.containsKey(nums[i]))
       {
        h.put(nums[i],h.get(nums[i])+1);
       }
       else
       {
        h.put(nums[i],1);
       }
       }
       for(int i=0;i<n;i++)
       {
        if(h.get(nums[i])==1)
        {
            return nums[i];
        }
       
       }
       return -1;
    }
}