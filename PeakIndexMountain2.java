class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int low = 0, high = A.length - 1, mid;
        while(low<high) {
            mid = (low+high)/2;
            if(A[mid] < A[mid+1]) {
                low = mid+1;
            }
            else {
                high = mid;
            }
        }
       
        return low;
    }
}
