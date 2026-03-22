class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length;
  int c=0;
        for(int i=0;i<n;i++)
        {
            int t=nums[i];
            int d=0;
            while(t>0)
            {
                d++;
                t=t/10;
            }
            if(d%2==0)
            {
                  c++;
            }
           
        }
        return c;
    }
}