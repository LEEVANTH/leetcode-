class Solution {
    private int dfs(char [][]grid,int row,int col,int R,int C)
    {
        grid[row][col]='0';
        int area=1;
        if(row+1<R&&grid[row+1][col]=='1')
        area+=dfs(grid,row+1,col,R,C);
         if(row-1>=0&&grid[row-1][col]=='1')
        area+=dfs(grid,row-1,col,R,C);
         if(col+1<C&&grid[row][col+1]=='1')
        area+=dfs(grid,row,col+1,R,C);
         if(col-1>=0&&grid[row][col-1]=='1')
        area+=dfs(grid,row,col-1,R,C);
        return area;
    }
    public int numIslands(char[][] grid) {
        int R=grid.length;
        int C=grid[0].length;
        int c=0;
        int res;
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                if(grid[i][j]=='1')
                {
                    res=dfs(grid,i,j,R,C);
                    c=c+1;
                }
            }
        }
        return c;
    }
}