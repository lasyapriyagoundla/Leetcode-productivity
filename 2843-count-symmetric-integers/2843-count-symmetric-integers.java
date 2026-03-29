

class Solution {
    public int countSymmetricIntegers(int low, int high) {
 
       int c=0;
       for(int i=low;i<=high;i++)
       {
        int t=i;
        int d=0;
        while(t>0)
        {
           d++;
            t=t/10;
        }
        if(d%2!=0)
        
            continue;
        int h=d/2;
        int di=1;
        for(int j=0;j<h;j++)
        {
      di=di*10;
        }
        int l=i/di;
        int r=i%di;
        int s=0;
        while(l>0)
        {
            s=s+l%10;
            l=l/10;
        }
        int s2=0;
        while(r>0)
        {
            s2=s2+r%10;
            r=r/10;
        }
        if(s==s2)
c++;
       } 
       return c;
    }
}