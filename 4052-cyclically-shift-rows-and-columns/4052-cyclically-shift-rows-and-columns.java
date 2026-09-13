class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] ro, int[] co) {
         int [][] r=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int col=(j-ro[i]+n)%n;
                r[i][col]=grid[i][j];
                
            }
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int row=(i-co[j]+n)%n;
               grid[row][j]=r[i][j];
                
            }
        }
        return grid;
         
        
    }
}