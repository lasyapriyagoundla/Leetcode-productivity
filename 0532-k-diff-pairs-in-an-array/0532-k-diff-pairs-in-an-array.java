class Solution {
    public int findPairs(int[] nums, int k) {
       int d=Math.abs(k);
       int c=0;
       HashSet<Integer> s=new HashSet<>();
       HashSet<String> st=new HashSet<>();
       for(int x:nums)
       {
        int d1=x-d;
        int d2=x+d;
        if(s.contains(d1))
        {
            st.add((d1)+","+x);
        }
        if(s.contains(d2))
        {
            st.add(x+","+(d2));
        }
        s.add(x);
       } 
       return st.size();
    }
}