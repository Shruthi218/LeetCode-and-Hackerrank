class Solution {
    public int uniquePaths(int m, int n) {
        if(m == 0 || n==0) return 0;
        int path[][] = new int[m][n];
        
        // filling up the edge (first row)
         //row is constant, but column is changing hence iterating from 0 to column length (n)
        
        for(int i=0; i < n; i++) {
            path[0][i] = 1;
        }
        // filling up the edge (first column)
        
        for(int i=0; i < m; i++) {
            path[i][0] = 1;
        }
        
        /*for filling up rest of the slots
         for any slot, the path value is calculated by the value it has on it's left hand side plus the    value that is on it's top
        
        */
        
        
        
        for(int i=1; i<m; i++) {
            for(int j=1; j<n; j++) {
                path[i][j] = path[i-1][j] + path[i][j-1];
            }
        }
        return path[m-1][n-1];
    }
}
