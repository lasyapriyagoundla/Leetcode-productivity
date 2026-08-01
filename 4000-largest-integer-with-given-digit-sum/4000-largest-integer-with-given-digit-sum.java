class Solution {
    public int largestInteger(int n, int s) {
        int a=s/9;
        int b=s%9;
        int totald=a;
        if(b>0)
        {
            totald++;
        }
        if(n<totald)
        {
            return -1;
        }
        int f=0;
        for(int i=0;i<a;i++)
        {
          f=f*10;
          f=f+9;

        }
        if(b>0)
        {
            f=f*10;
            f=f+b;
            a++;

        }
        while(a<n)
        {
            f=f*10;
            a++;
        }
        return f;
    }
}