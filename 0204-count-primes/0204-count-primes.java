class Solution {
    int n=5000001;
    boolean p[]=new boolean[n];
    public Solution()
    {
    Arrays.fill(p,true);
    p[0]=false;
    p[1]=false;
    for(long i=2;i*i<n;i++)
    {
        if(p[(int)i])
        {
         for(long j=i*i;j<n;j=j+i)
         {
            p[(int)j]=false;
         }
        }
    }

    }
    public int countPrimes(int n) {
        int c=0;
       for(int i=2;i<n;i++)
       {
        if(p[i]==true)
        {
            c++;
        }
       } 
       return c;
    }
}