class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null) return 0;
        int islandcount = 0;
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                if(grid[i][j] == '1')
                    ++islandcount;
                changelandtowater(grid,i,j);
            }
        }
        return islandcount;
    }
    
    public void changelandtowater(char[][] grid,int i,int j) {
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j] =='0') return;
        grid[i][j]='0';
        changelandtowater(grid,i-1,j);
        changelandtowater(grid,i+1,j);
        changelandtowater(grid,i,j-1);
        changelandtowater(grid,i,j+1);
    }
}


Recursion - Very well explained in this tutorial video :
Link : https://www.youtube.com/watch?v=CLvNe-8-6s8
