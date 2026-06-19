class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        Map <Integer,ArrayList<Integer>> mp=new HashMap<>();
        for(int i=0;i<n;i++)
        {
          for(int j=0;j<m;j++)
          {
            int k=i+j;
            if(!mp.containsKey(k))
            {
                mp.put(k,new ArrayList<>());
            }
            mp.get(k).add(mat[i][j]);
          }
        }

            int ans[]=new int[n*m];
            int id=0;
        for(int d=0;d<n+m-1;d++)
        {
            List<Integer> lst=mp.get(d);
            if(d%2==0)
            {
                Collections.reverse(lst);
            }
            for(int l:lst)
            {
                ans[id++]=l;
            }
        }
        return ans;
    }
}