/* [0,2,1,0] 

Peak element is 2 because after 2 all the elements are decreasing.

[0,1,3,10,9,8]

Peak element is 10 because elements after 10 are decreasing.
*/


class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int max = A[0];
        int myindex = 0;
        for(int i=0;i<A.length;i++) {
            if(A[i] > max) {
                max = A[i];
                myindex = i;
            }
        }
        return myindex;
    }
}
