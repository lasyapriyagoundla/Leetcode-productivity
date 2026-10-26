class Solution {
    public int triangleNumber(int[] nums) {
     int n=nums.length;
     Arrays.sort(nums);
     int l=0;
     for(int k=n-1;k>=2;k--)
     {
         int i=0,j=k-1;
        while(i<j)
        {
        int a=nums[i];
        int b=nums[j];
        int c=nums[k];
         if(a+b>c)
         {
            l=l+j-i;
            j--;
         }
         else
         {
            i++;
         }
        }

     }
     return l;
    }
}