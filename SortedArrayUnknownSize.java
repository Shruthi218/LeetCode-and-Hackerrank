*/ Search in sorted array of unknown size */

class Solution {
    public int search(ArrayReader reader, int target) {
        int low  = 0;
        int high = Integer.MAX_VALUE;
        
        while(low<=high) {
            int mid = (low+high)/2;
            int x = reader.get(mid);
            if(x < target) {
                low = mid + 1;
            }
            else if(x > target) {
                high = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
