class Solution {
    public int[] topKFrequent(int[] a, int k) {
        int ans[]=new int[k];
        Map<Integer,Integer> m=new HashMap<>();
         int n=a.length;
        for(int i=0;i<n;i++)
        {
           m.put(a[i],m.getOrDefault(a[i],0)+1);


        }
        List<Integer> l=new ArrayList<>(m.keySet());
        Collections.sort(l,(x,y) ->
        {
            if(!m.get(x).equals(m.get(y)))
            {
                return m.get(y)-m.get(x);
            }
            return x-y;
        });
        for(int i=0;i<k;i++)
        {
            ans[i]=l.get(i);
        }

return ans;

    }
}