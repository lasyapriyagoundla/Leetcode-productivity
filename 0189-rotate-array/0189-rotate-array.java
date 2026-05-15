class Solution {
    public void rotate(int[] nums, int k) {
    int n=nums.length;
    int d=k%n;
    int t[]=new int[d];
    for(int i=n-d;i<n;i++)
    {
        t[i-(n-d)]=nums[i];
    }   
    for(int i=n-d-1;i>=0;i--)
    {
      nums[i+d]=nums[i];
    } 

    for(int i=0;i<d;i++)
    {
        nums[i]=t[i];
    }
    }
}