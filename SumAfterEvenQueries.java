class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int result[] = new int[queries.length];
        
        for(int i=0;i<queries.length;i++) {
            int value = queries[i][0];
            int index = queries[i][1];
            A[index] += value;
            int sum = 0;
            for(int k=0;k<A.length;k++) {
                if(A[k]%2==0) {
                    sum+=A[k];
                }
            }
            result[i] = sum;
        }
        
        return result;
        
    }
}
