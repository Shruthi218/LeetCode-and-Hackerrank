/* Approach 1 - Using Sorting */

class Solution {
    public int[] sortedSquares(int[] A) {
      for(int i=0;i<A.length;i++) {
          A[i] = A[i] * A[i];
      }  
        
        Arrays.sort(A);
        return A;
    }
}


/* Approach 2 - Using Two Pointer */

class Solution {
    public int[] sortedSquares(int[] A) {
        int n = A.length;
        int result[] = new int[n];
        int i = 0;
        int j = n-1;
        int p = n - 1;
        
        while(i<=j) {
            if(Math.abs(A[i]) > Math.abs(A[j])) {
                result[p] = A[i] * A[i];
                p--;
                i++;
            }
            else {
                result[p] = A[j] * A[j];
                p--;
                j--;
            }
        }
        return result;
    }
}
