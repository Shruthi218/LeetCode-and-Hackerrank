/* we need to handle case where A[i] + A[j] == K

*/

class Solution {
    public int twoSumLessThanK(int[] A, int K) {
        int i = 0;
        int j = A.length - 1;
        int diff = Integer.MAX_VALUE;
        Arrays.sort(A);
        int sum = 0;
        int res = 0;
        
        while(i<j) {
            sum = A[i] + A[j];
            if(sum < K) {
                if (K - sum < diff) {
                    diff = K - sum;
                    res = sum;
                }
                
                i++;
            } else {
                j--;
            }
        }
        
        return diff == Integer.MAX_VALUE ? -1 : res;
        
    }
}
