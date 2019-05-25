class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if(target == 'z') return letters[0];
        

        int low = 0;
        int high = letters.length - 1;
        while ( low <= high ){
            int mid = (low + high)/2;
            if ( letters[mid] > target){ 
                high = mid - 1;        
            } else {
                low = mid + 1;          
            }
        }
// First if condition handles the wrap around case in which when we say low = mid + 1, low exceeds array length

        if (low > letters.length - 1) {
            return letters[0];
        } else {
            return letters[low];
        }
    }
}
