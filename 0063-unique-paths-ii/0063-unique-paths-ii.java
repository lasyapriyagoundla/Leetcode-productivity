class Solution {
    public int uniquePathsWithObstacles(int[][] ob) {
        int n=ob.length;
        int m=ob[0].length;
        int d[][]=new int[n][m];
        for(int i=0;i<m;i++)
        {
            if(ob[0][i]!=1)
            {
                d[0][i]=1;
            }
            else
            {
                while(i<m)
                {
                    d[0][i]=0;
                    i++;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(ob[i][0]!=1)
            {
                d[i][0]=1;
            }
            else
            {
                while(i<n)
                {
                    d[i][0]=0;
                    i++;
                }
            }
        }
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(ob[i][j]==1)
                {
                    d[i][j]=0;
                }
                else
                {
                    d[i][j]=d[i-1][j]+d[i][j-1];
                }
            }
        }
        return d[n-1][m-1];
    }
}