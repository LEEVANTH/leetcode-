class Solution {
    private int dfs(int row,int col,int [][]grid,int R,int C)
    {
        int area=1;
        grid [row][col]=0;
        if(row+1<R&&grid[row+1][col]==1)
        area+=dfs(row+1,col,grid,R,C);
        if(row-1>=0&&grid[row-1][col]==1)
        area+=dfs(row-1,col,grid,R,C);
        if(col+1<C&&grid[row][col+1]==1)
        area+=dfs(row,col+1,grid,R,C);
        if(col-1>=0&&grid[row][col-1]==1)
        area+=dfs(row,col-1,grid,R,C);
        return area;

    }
    public int maxAreaOfIsland(int[][] grid) {
        int R=grid.length;
        int res,maxarea=0;
        int C=grid[0].length;
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                if(grid[i][j]==1)
                {
                    res=dfs(i,j,grid,R,C);
                    maxarea=Math.max(maxarea,res);
                }
            }
        }
        return maxarea;
    }
    
}