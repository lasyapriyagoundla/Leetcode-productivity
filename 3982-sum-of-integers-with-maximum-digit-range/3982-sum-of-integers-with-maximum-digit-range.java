class Solution {
    public int maxDigitRange(int[] nums) {
       int max=-1,s=0;
        for(int num:nums)
            {
                int a=num,mn=9,mx=0;
                while(a>0)
                    {
                        int d=a%10;
                        mn=Math.min(mn,d);
                        mx=Math.max(mx,d);
                        a=a/10;
                        
                    }
                int r=mx-mn;
                if(r>max)
                {
                    max=r;
                    s=num;
                }
                else if(r==max)
                {
                    s=s+num;
                }
            }
        return s;
    }
}