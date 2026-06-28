class Solution {
    public List<List<Integer>> filterOccupiedIntervals(int[][] interval, int freestart, int freeend) {
        Arrays.sort(interval,(a,b)->a[0]-b[0]);
        int s=interval[0][0];
        int e=interval[0][1];
        List<int[]>n=new ArrayList<>();

        for(int i=1;i<interval.length;i++)
        {
            if(interval[i][0]<=e+1)
            {
                e=Math.max(e,interval[i][1]);
            }
            else
            {
                n.add(new int[]{s,e});
                s=interval[i][0];
                e=interval[i][1];

            }
        }
        n.add(new int[]{s,e});
        List<List<Integer>> ans=new ArrayList<>();
        for(int [] sinterval:n)
        {
            int st=sinterval[0];
            int en=sinterval[1];
           if(st>freeend || en<freestart)
            {
                ans.add(Arrays.asList(st,en));
            }
            else
            {

            
            if(st<freestart)
            {
                ans.add(Arrays.asList(st,freestart-1));
            }
             if(en>freeend)
            {
                ans.add(Arrays.asList(freeend+1,en));
            }
            }
        }
        return ans;
    }
}