class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();

        int c=0;
        int s=0;
        map.put(0,1);

        for(int i=0;i<n;i++)
        {
         s=s+nums[i];
           
           int r=s-k;
            if(map.containsKey(r))
            {
                c=c+map.get(r);
            }
            map.put(s,map.getOrDefault(s,0)+1);
        
        }
        return c;
    }
}