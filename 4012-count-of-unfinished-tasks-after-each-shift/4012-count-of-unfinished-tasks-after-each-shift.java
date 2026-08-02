class Solution {
  
  class Pair
  {
    int last;
    long rem;
    Pair(int last,long rem)
    {
        this.last=last;
        this.rem=rem;
    }
  }
    private Pair binary(int f,long time,long p[],int n)
    {
        int l=f;
        int h=n-1;
        int last=f-1;
        long rem=time;
        
        while(l<=h)
            {
        int  m=l+(h-l)/2;
         long need=p[m+1]-p[f];
        if(need<=time)
        {
            last=m;
            rem=time-need;
            l=m+1;
            
        }
        else
        {
            h=m-1;
        }
            }
            return new Pair(last,rem);
       
            }
    
    public int[] countTasks(int[] tasks, int[] shifts) {
        int n=tasks.length;
        
        long p[]=new long[n+1];
       
        for(int i=1;i<=n;i++)
            {
               
                   p[i]=p[i-1]+tasks[i-1];
               
            }
             int f=0;
             long w=0;
             int m=shifts.length;
             int ans[]=new int[m];
               for(int i=0;i<m;i++)
               {
                long time=shifts[i];
                long rem=tasks[f]-w;
                if(rem >time)
                {
                    w=w+time;
                    ans[i]=n-f;
                    continue;
                }
                time=time-rem;
                f++;

                  if(f==n)
                  {
                 ans[i]=0;
                    f=0;
                    w=0;
                    continue;
                  }
                Pair res=binary(f,time,p,n);
                  f=res.last+1;
                  ans[i]=n-f;
                  if(f==n)
                  {
                    f=0;
                    w=0;
                  }
                  else
                  {
                    w=res.rem;
                  }
               }
               return ans;
    }

}