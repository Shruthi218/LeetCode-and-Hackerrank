/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

/* 1 2 3 4 5
3 --false -- good version
5---true---bad version
4 --true --first bad version

Steps:
n = 5
start = 1, end = 5
mid = start+(end - start)/2 = 3
Pass mid value to the given API isBadVersion(mid)
If the API returns true, then our answer lies on the left hand side.
set end = mid
Else move to the right hand side.
set start = mid+1
Repeat.

*/
 

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1, end = n;
        while(start < end) {
            int mid = start + (end - start)/2;
            if(isBadVersion(mid)) {
                end = mid;
            }
            else {
                start = mid+1;
            }
        }
        return start;
    }
}
