class Solution {
    public boolean isPalindromic(String s) {
      StringBuilder std=new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++)
            {
                char ch=s.charAt(i);
                int b=(int)ch;
                String st=Integer.toBinaryString(b);
                while(st.length()<8)
                    {
                       st="0"+st;
                        
                    }
                std.append(st);
            }
        int l=0,r=std.length()-1;
        while(l<r)
            {
                if(std.charAt(l)!=std.charAt(r))
                {
                    return false;
                }
                l++;
                r--;
            }
        return true;
    }
}