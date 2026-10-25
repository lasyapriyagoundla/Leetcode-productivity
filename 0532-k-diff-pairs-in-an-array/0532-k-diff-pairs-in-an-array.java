class Solution {
    public int findPairs(int[] nums, int k) {
       int d=Math.abs(k);
       int c=0;
       HashSet<Integer> s=new HashSet<>();
       HashSet<Integer> st=new HashSet<>();
       for(int x:nums)
       {
        int d1=x-d;
        int d2=x+d;
        if(s.contains(d1))
        {
            st.add(d1);
        }
        if(s.contains(d2))
        {
            st.add(x);
        }
        s.add(x);
       } 
       return st.size();
    }
}