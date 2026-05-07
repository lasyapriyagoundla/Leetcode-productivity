class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n=nums.length;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=i+1;j<n;j++)
             {
               
                    if(nums[i]%2==0 && nums[j]%2!=0)
                    {
                        c++;
                    }
                    else if(nums[i]%2!=0 && nums[j]%2==0)
                    {
                        c++;
                    }
               
             }
             a[i]=c;
        }
        return a;
    }
}