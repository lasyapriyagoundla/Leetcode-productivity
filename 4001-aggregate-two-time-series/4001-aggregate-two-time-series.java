class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] s1, int[][] s2) {
     int n=s1.length;
     int m=s2.length;
     List<List<Integer>> l=new ArrayList<>();
     int i=0,j=0;
     while(i<n && j<m)
     {
     int t1=s1[i][0];
     int v1=s1[i][1];
     int t2=s2[j][0];
     int v2=s2[j][1];
        if(t1<t2)
        {
           l.add(Arrays.asList(t1,v1+v2));
           i++;
        }
        else if(t1==t2)
        {
           l.add(Arrays.asList(t1,v1+v2));
           i++;
          j++;
        }
        else
        {
            l.add(Arrays.asList(t2,v1+v2));
              j++;

        }

     }
     while (i<n)
     {
        l.add(Arrays.asList(s1[i][0],s1[i][1]));
        i++;
     }
     while (j<m)
     {
        l.add(Arrays.asList(s2[j][0],s2[j][1]));
        j++;
     }

   return l;
    }
}