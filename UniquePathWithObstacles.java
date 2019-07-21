class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // OG. length is nothing but row length
        if(obstacleGrid.length==0 || obstacleGrid[0].length==0 || obstacleGrid==null) return 0;
        int m = obstacleGrid.length; // rows
        int n = obstacleGrid[0].length; // columns
        int paths[][] = new int[m][n];
        
        for(int i=0; i<n;i++) {
            if(obstacleGrid[0][i]!=1) {
                paths[0][i] = 1;
            }
            else break;
        }
        
        for(int i=0; i<m;i++) {
            if(obstacleGrid[i][0]!=1) {
                paths[i][0] = 1;
            }
            else break;
        }
        
        for(int i=1; i<m;i++) {
            for(int j=1; j<n;j++) {
                if(obstacleGrid[i][j]!=1) {
                    paths[i][j] = paths[i-1][j] + paths[i][j-1];
                }
            }
        }
        return paths[m-1][n-1];
    }
}
