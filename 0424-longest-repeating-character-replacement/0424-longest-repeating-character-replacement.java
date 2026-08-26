class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> mp=new HashMap<>();
        int l=0,r=0;
        int max=0;
        int f=0;
        for(r=0;r<s.length();r++)
        {
            mp.put(s.charAt(r),mp.getOrDefault(s.charAt(r),0)+1);
            f=Math.max(f,mp.get(s.charAt(r)));
            while((r-l+1)-f>k)
            {
                mp.put(s.charAt(l),mp.getOrDefault(s.charAt(l),0)-1);
                if(mp.get(s.charAt(l))==0)
                {
                    mp.remove(s.charAt(l));
                }
                l++;
            }
            max=Math.max(max,r-l+1);
          
         
        }
        return max;
    }
}